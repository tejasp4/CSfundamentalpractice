//Data Commands:
// SET name value - set name to value value, names or values can't contain spaces
// GET name print out value of variable name or NULL 
// UNSET variable name like variable was never set
// NUMEQUALTO value print out number of variables that are currently set to value. If no variables equal -> print 0
// END exit program
// BEGIN - open a new transaction block, including nested ones
// ROLLBACK - undo all commands in latest transactional block
// COMMIT - save all changes to actual db in all transactional blocks
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.EmptyStackException;

public class TranslationalDB {

	/** BufferReader object reader to take in STD Input from the client side. */
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/** HashMap that maps String values to Integer values. This is the main database. */ 
	public static HashMap<String, Integer> db = new HashMap<>();

	/** Stack of HashMaps that keeps track of Commits in their order. */ 
	public static Stack<HashMap<String, Integer>> commits = new Stack<>();
	
	/** Commit DB that gets changed when BEGIN commands are executed (or NUMEQUALTO Commands are executed). */ 
	public static HashMap<String, Integer> currDB = db;

	public static boolean openCommit = false;

	


	/** Commands class which holds all necessary Translational Database commands such as 
	SET, GET, UNSET, NUMEQUALTO, END, BEGIN, COMMIT, and ROLLBACK */ 
	public static class Commands {


		/** SET command that assigns a mapping from some String name to some Integer value. */ 
		public static void setCommand(String name, String value, HashMap<String, Integer> db) {
			System.out.println("SET " + name + " " + value);
			int value0 = Integer.parseInt(value);
			db.put(name, value0);
		}

		/** GET command that either returns Value contained in Mapping, or > NULL if value is not mapped. */ 
		public static  void getCommand(String name, HashMap<String, Integer> db) {
			System.out.println("GET " + name);
			boolean contains = db.containsKey(name);
			if (contains) {
				int returnValue = db.get(name);
				System.out.println("> " + returnValue);
			} else {
				System.out.println("> " + "NULL");
			}
			
		}

		/** UNSET Command that deletes mappings of a certain String name to Value. */ 
		public static void unsetCommand(String name, HashMap<String, Integer> db) {
			System.out.println("UNSET " + name);
			db.remove(name);
		}

		/** NUMEQUALTO Command that counts the number of occurecnces of a certain Value in Database. */ 
		public static void numEqualToCommand(String value) {
			System.out.println("NUMEQUALTO " + value);
			HashMap<String, Integer> checkDB;
			if (commits.empty()) {
				checkDB = db;
			} else {
				checkDB = commits.peek();
			}
			int intVal = Integer.parseInt(value);
			int count = 0;
		    for (int dbVal : checkDB.values() ) {
		    	if (dbVal == intVal) {
		    		count++;
		    	}
		    }
		   	System.out.println("> " + count);
		}

		/** END command that exits program and takes no more client input. */ 
		public static void endCommand() {
			System.out.println("END");
				System.exit(0);
		}

		/** BEGIN command that opens a new transition block (nested or not nested), changes openCommit boolean, and changes the CurrentDB being handled to a new HashMap. */ 
		public static void beginCommand() {
			System.out.println("BEGIN");
			if (openCommit != true) {
				openCommit = true;
			}
			if (commits.empty()) {
				currDB = (HashMap<String, Integer>) db.clone();
				commits.push(currDB);
			} else {
				currDB = new HashMap<String, Integer>();
				commits.push(currDB);
			}
		    
		}

		/** Replaces the original database with the most recent current database in transitional commit Stack, applying all changes made. */ 
		public static void commitCommand() {
			System.out.println("COMMIT");
			if (commits.empty()) {
				System.out.println("> NO TRANSACTION");
			} else {
				db = commits.pop();
				commits.clear();
				openCommit = false;
			}
		}

		/** Undoes all commands in most recent Transitional Block in the Commit Stack to revert to a previous database model. */ 
		public static void rollbackCommand() {
			System.out.println("ROLLBACK");
			if (!openCommit) {
				System.out.println("> NO TRANSACTION");
			} else {
				commits.pop();
				try {
					currDB = commits.peek();
				} catch (EmptyStackException e) {
					currDB = new HashMap<String, Integer>();
				}
				
			}
		    
		}
	} 


	public static void main(String[] args) throws Exception {
		String input = reader.readLine();
		String[] inputSplit = input.split(" ");
		while (input != "END") {

			switch (inputSplit[0]) {

			/** SET command case. */ 
			case "SET": 
			if (inputSplit.length != 3) { 
				throw new IllegalArgumentException();
				} else if (openCommit) {
				Commands.setCommand(inputSplit[1], inputSplit[2], currDB);
				} else {
				Commands.setCommand(inputSplit[1], inputSplit[2], db);
				}
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** GET command case. */
			case "GET": 
			if (inputSplit.length != 2) { 
				throw new IllegalArgumentException();
				} else if (openCommit) {
					Commands.getCommand(inputSplit[1], currDB);
				} else {
					Commands.getCommand(inputSplit[1], db);		
				}
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** UNSET command case. */
			case "UNSET":
			if (inputSplit.length != 2) { 
				throw new IllegalArgumentException();
				}
			Commands.unsetCommand(inputSplit[1], db);
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** NUMEQUALTO command case. */
			case "NUMEQUALTO":
			if (inputSplit.length != 2) { 
				throw new IllegalArgumentException();
				} else {
					Commands.numEqualToCommand(inputSplit[1]);
				}
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** BEGIN command case. */
			case "BEGIN":
			if (inputSplit.length != 1) { 
				throw new IllegalArgumentException();
				}
			Commands.beginCommand();
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** COMMIT command case. */
			case "COMMIT":
			if (inputSplit.length != 1) { 
				throw new IllegalArgumentException();
				}
			Commands.commitCommand();
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** ROLLBACK command case. */
			case "ROLLBACK":
			if (inputSplit.length != 1) { 
				throw new IllegalArgumentException();
				}
			Commands.rollbackCommand();
			input = reader.readLine();
			inputSplit = input.split(" ");
			break;

			/** END command case. */
			case "END":
				Commands.endCommand();
				break;

			default:
				System.out.println("Not a command. Choose from available commands:");
				System.out.println("SET, GET, UNSET, NUMEQUALTO, BEGIN, COMMIT, ROLLBACK, END");
				input = reader.readLine();
				inputSplit = input.split(" ");
				break;

			}
		}
	}
}