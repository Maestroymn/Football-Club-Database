import java.sql.*;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int password;
		int in_id = 900;
		int numberOfOp = 0;
		Scanner keyboard = new Scanner(System.in);
		String inp, id;
		System.out.println("Welcome to the Manchester City F.C. database");
		enterance();
		String q;
		inp = keyboard.next();
		do {

			switch (inp) {
			case "C":
			case "c":
				System.out.println("Enter your Id and password:");
				// id = keyboard.next();
				// password = keyboard.nextInt();
				id = "group5";
				password = 4453;
				if (checkpassword(id, password)) {
					ICoach();

					System.out.println("Enter the operation that you would like to do?");
					int op = keyboard.nextInt();
					switch (op) {
					case 1:
							for (int i = 0; i < 11; ++i) {
								System.out.println("Choose Position:");
								String pos = keyboard.next();
								viewPlayer(pos);
								System.out.println("Choose player by his id.");
								String p_id = keyboard.next();
								System.out.println("First XI or reserves?");
								String y = keyboard.next();
								addplayertomatchsquad(p_id, y);
								System.out.println("Current Squad:");
								getMatchsquad();
								
							}


						break;
					case 2:

						break;

					case 3:

						break;

					case 4:
						getStatus();
						break;
					
						
						
					case 9:
						System.out.println("Which information do you want to update?");
						System.out.println("1)Adress");
						System.out.println("2)Phone Number");
						System.out.println("3)Return to the main page");
						int ans = keyboard.nextInt();
						if (ans == 3)
							continue;
						else if (ans == 1) {
							System.out.println("Enter the new Address and your id:");
							String Newadd = keyboard.next();
							int c_id = keyboard.nextInt();
							changeAddressforC(Newadd, c_id);
						} else if (ans == 2) {
							System.out.println("Enter the new phone number and your id:");
							int Newpnumber = keyboard.nextInt();
							int c_id = keyboard.nextInt();
							changePnumberforC(Newpnumber, c_id);
						}

						break;
					default:
						System.out.println("Incorrect input!!");
						break;
					}
				} else {
					while (true) {
						if (numberOfOp == 2) {
							System.out.println("From now on you may only enter as Visitor.");
							inp = "V";
							break;

						}

						System.out.println("Wrong id or password " + (2 - numberOfOp) + " chance left");
						System.out.println("Enter your Id and password again:");
						id = keyboard.next();
						if (checkpassword(id, password))
							break;
						password = keyboard.nextInt();
						numberOfOp++;
					}

				}

				break;
			case "D":
			case "d":
				//System.out.println("Enter your Id and password:");
				//id = keyboard.next();
				//password = keyboard.nextInt();
				id="group5";
				password = 4453;
				if (checkpassword(id, password)) 
					IDirector();

					System.out.println("Enter the operation that you would like to do?");
					int op = keyboard.nextInt();
					switch (op) {
					case 1:
						//System.out.println("Enter the id of the contract that you want to end:");
						deletepcontract();
						break;
					case 2:
						addpcontract();
						break;
					case 3:
						addcontract();
						break;
					case 4:
						deletescontract();
						break;
					case 5:
						addccontract();
						break;
					case 6:
						deleteccontract();
						break;
					case 7:
						addslogan();
						break;
					case 8:
						System.out.println("Which information do you want to update?");
						System.out.println("1)Adress");
						System.out.println("2)Phone Number");
						System.out.println("3)Return to the main page");
						int ans = keyboard.nextInt();
						if (ans == 3)
							continue;
						else if (ans == 1) {
							System.out.println("Enter the new Address and your id:");
							String Newadd = keyboard.next();
							int s_id = keyboard.nextInt();
							changeAddressforS(Newadd, s_id);
						} else if (ans == 2) {
							System.out.println("Enter the new phone number and your id:");
							int Newpnumber = keyboard.nextInt();
							int s_id = keyboard.nextInt();
							changePnumberforS(Newpnumber, s_id);
						}
						break;
						
					default:
						System.out.println("Incorrect input!!");
						break;
					}
					break;
			case "M":
			case "m":
				System.out.println("Enter your Id and password:");
				// id = keyboard.next();
				// password = keyboard.nextInt();
				id = "group5";
				password = 4453;
				if (checkpassword(id, password)) {
					IMedic();
					System.out.println("Enter the operation that you would like to do?");
					op = keyboard.nextInt();
					switch (op) {
					case 1:
								
						System.out.println("Enter the id of the injured player: ");
								String pid=keyboard.next();
								System.out.println("Enter medic id: ");
								String mid = keyboard.next();
								System.out.println("Enter treatment type: ");
								String treatment = keyboard.next();
								System.out.println("Enter treatment time:");
								String time = keyboard.next();
								
								addtreatment(in_id , treatment , time , mid , pid );
						in_id++;
								break;
					case 2:
								System.out.println("Enter the player's id:");
								String play_id = keyboard.next();
								viewtreatment(play_id);
						break;
					case 3:
						System.out.println("List of active treatments:");
						viewtreatment();
						System.out.println("Enter the treatment id:");
						int treat_id = keyboard.nextInt();
						deletetreatment(treat_id);
						break;

					case 9:

						System.out.println("Which information do you want to update?");
						System.out.println("1)Adress");
						System.out.println("2)Phone Number");
						System.out.println("3)Return to the main page");
						int ans = keyboard.nextInt();
						if (ans == 3)
							continue;
						else if (ans == 1) {
							System.out.println("Enter the new Address and your id:");
							String Newadd = keyboard.next();
							int m_id = keyboard.nextInt();
							changeAddressforM(Newadd, m_id);
						} else if (ans == 2) {
							System.out.println("Enter the new phone number and your id:");
							int Newpnumber = keyboard.nextInt();
							int m_id = keyboard.nextInt();
							changePnumberforM(Newpnumber, m_id);
						}


						break;
					default:
						System.out.println("Incorrect input!!");
						break;
					}
				} else {
					while (true) {
						if (numberOfOp == 2) {
							System.out.println("From now on you may only enter as Visitor.");
							inp = "V";
							break;
						}

						System.out.println("Wrong id or password " + (2 - numberOfOp) + " chance left");
						System.out.println("Enter your Id and password again:");
						id = keyboard.next();
						if (checkpassword(id, password))
							break;
						password = keyboard.nextInt();
						numberOfOp++;
					}

				}

				break;

			case "S":
			case "s":
				System.out.println("Enter your Id and password:");
				// id = keyboard.next();
				// password = keyboard.nextInt();
				id = "group5";
				password = 4453;
				if (checkpassword(id, password)) {
					IScout();
					
					System.out.println("Enter the operation that you would like to do?");
					op = keyboard.nextInt();
					switch (op) {
					case 1:
						feedback();
						break;
					case 2:
						addwatchedplayer();
						break;
					case 3:
						removewplayer();
						break;
					
						
					case 9:

						System.out.println("Which information do you want to update?");
						System.out.println("1)Adress");
						System.out.println("2)Phone Number");
						System.out.println("3)Return to the main page");
						int ans = keyboard.nextInt();
						if (ans == 3)
							continue;
						else if (ans == 1) {
							System.out.println("Enter the new Address and your id:");
							String Newadd = keyboard.next();
							int s_id = keyboard.nextInt();
							changeAddressforS(Newadd, s_id);
						} else if (ans == 2) {
							System.out.println("Enter the new phone number and your id:");
							int Newpnumber = keyboard.nextInt();
							int s_id = keyboard.nextInt();
							changePnumberforS(Newpnumber, s_id);
						}

						break;
					default:
						System.out.println("Incorrect input!!");
						break;
					}
				} else {
					while (true) {
						if (numberOfOp == 2) {
							System.out.println("From now on you may only enter as Visitor.");
							inp = "V";
							break;
						}

						System.out.println("Wrong id or password " + (2 - numberOfOp) + " chance left");
						System.out.println("Enter your Id and password again:");
						id = keyboard.next();
						if (checkpassword(id, password))
							break;
						password = keyboard.nextInt();
						numberOfOp++;
					}

				}

				break;
			}
			if (inp.equals("V") || inp.equals("v")) {
				int op;
				Instruction();
				System.out.println("Enter the operation that you would like to do?");
				op = keyboard.nextInt();
				switch (op) {
				case 1:
					getClubName();
					break;
				case 2:
					getPlayers();
					break;

				case 3:
					getCoaches();
					break;

				case 4:
					getMeds();
					break;

				case 5:
					getScout();
					break;
				case 6:
					getMatchsquad();
					break;
				case 7:
					getBuildings();

					break;
				case 8:
					getSponsors();
					break;
				case 9:
					getDirectors();
					break;
				default:
					System.out.println("Incorrect input!!");
					break;
				}

			}

			System.out.println(
					"If you want to exit from the system press 'Q'.\nIf you want to exit from the User press 'U'");
			q = keyboard.next();
			if (q.equals("Q") || q.equals("q")) {
				System.out.println("BYE!!");
				break;
			} else if (q.equals("U") || q.equals("u")) {
				enterance();
			inp = keyboard.next();
			}
		} while (true);

	}
	private static void changeAddressforS(String newadd, int s_id) {

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE SCOUT_TEAM set S_ADD = '" + newadd + "' WHERE S_ID = '" + s_id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}
	
	private static void changePnumberforS(int newpnumber, int s_id) {

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE SCOUT_TEAM set S_PNUM = '" + newpnumber + "' WHERE S_ID = '" + s_id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}	

	private static void changePnumberforM(int newpnumber, int m_id) {

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE MEDICAL_STAFF set MED_PNUM = '" + newpnumber + "' WHERE MED_ID = '" + m_id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}
	
	private static void changeAddressforM(String newadd, int m_id) {

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE MEDICAL_STAFF set MED_ADD = '" + newadd + "' WHERE MED_ID = '" + m_id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}

	private static void deletetreatment(int treat_id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String status = " ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("UPDATE PLAYERS SET STATUS = 'healthy' WHERE P_ID = (SELECT P_ID FROM GET_TREAT WHERE TREATMENT_ID = " + treat_id + ")");
			rs = stmt.executeQuery("DELETE FROM GET_TREAT WHERE treatment_id = " + treat_id + "");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void viewtreatment() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select TREATMENT_ID	, TREATMENT_TYPE , TREATMENT_TIME , MED_ID ,P_ID from GET_TREAT ");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.println(rs.getString(5) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void viewtreatment(String play_id) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select TREATMENT_ID	, TREATMENT_TYPE , TREATMENT_TIME , MED_ID ,P_ID from GET_TREAT where P_ID= '" + play_id	 + "' ");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.println(rs.getString(5) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	
		
	}

	private static void addtreatment(int in_id, String treatment, String time, String mid, String pid) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("insert into GET_TREAT values (" + in_id + ", '" + treatment + "' , '" + time + "' , '" + mid + "' , '" + pid + "'  ) ");
			rs = stmt.executeQuery("UPDATE PLAYERS SET STATUS = 'injured' WHERE P_ID = (SELECT P_ID FROM GET_TREAT WHERE TREATMENT_ID = " + in_id + ")");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void addplayertomatchsquad(String p_id, String y) {
		Connection con = null;
		Statement stmt = null;
		
		
		ResultSet rs = null;

		String P = " ";
		String N = " ";
		String position = " ";
		String Status = " ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select P_ID,P_NAME,STATUS,POSITION from PLAYERS where P_ID= '" + p_id + "' ");
			while (rs.next()) {
				P = rs.getString(1);
				N = rs.getString(2);
				
				Status = rs.getString(3);
				position = rs.getString(4);
			}
			int year = 2018;
			System.out.println(P + y + N + year+ Status +position  );
			rs = stmt.executeQuery("insert into SEASON_SQUAD values ('" + P + "', '" + y +  "' , '" + N +  "' , "+ year +"  , '" + Status + "'  , '" + position + "') ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void viewPlayer(String position) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select P_ID,P_NAME,STATUS from PLAYERS where POSITION = '" + position + "' ");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void changeAddressforC(String newadd, int id) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE COACHES set C_ADD = '" + newadd + "' WHERE C_ID = '" + id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void changePnumberforC(int newpnumber, int id) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			String q1 = "UPDATE COACHES set C_PNUM = '" + newpnumber + "' WHERE C_ID = '" + id + "' ";
			int x = stmt.executeUpdate(q1);
			if (x > 0) {
				System.out.println("successfully Updated");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getStatus() {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select P_NAME ,STATUS from PLAYERS group by P_NAME,STATUS");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.println(rs.getString(2) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getDirectors() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from MANAGEMENTS");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.println(rs.getString(6) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getSponsors() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from SPONSORSHIP");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.println(rs.getString(2) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getBuildings() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from BUILDINGS");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getInt(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getMatchsquad() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from SEASON_SQUAD");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.println(rs.getString(5) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getScout() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Scout_Team");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt(4) + "\t");
				System.out.println(rs.getString(5) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getMeds() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from MEDICAL_STAFF");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.println(rs.getString(6));

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void ICoach() {
		System.out.println("1)Selection for match squad: ");
		System.out.println("2)Suggest a player to watch to Scout team: ");
		System.out.println("3)Check feedback of an observed player by Scout team: ");
		System.out.println("4)Check Status of Players: ");

		System.out.println("9)Information update: ");

	}

	private static void IMedic() {
		System.out.println("1)Add a treatment");
		System.out.println("2)Situation of a treatment");
		System.out.println("3)Finish a treatment");

		System.out.println("9)Information update: ");
	}

	private static void IScout() {
		System.out.println("1)Leave a comment for the watched player:");
		System.out.println("2)Add a player to watch list:");
		System.out.println("3)Remove a player from watch list:");
		System.out.println("9)Information update: ");
	}

	private static void feedback() {
		Statement stmt = null;
		ResultSet rs =null;
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager
					.getConnection("jdbc:oracle:thin:kaan07/123456@127.0.0.1");
			stmt = con.createStatement();
			
			Scanner keyboard = new Scanner(System.in);			
			System.out.println("Enter the ID of the player:");
			String id=keyboard.nextLine();			
			System.out.println("Enter the comment of the player:");
			String comment=keyboard.nextLine();
			
			
			int insertedr=stmt.executeUpdate("update WATCH_LIST set WCOMMENT= '"+comment+"' where WP_ID= '"+id+"'");
			if ( insertedr>0) {
				System.out.println("Comment Updated.");
			} else {
				System.out.println("Couldn't update!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void addwatchedplayer() {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:kaan07/123456@127.0.0.1");
			stmt = con.createStatement();

			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the ID and name of the player:");
			String id = keyboard.next();
			String pname=keyboard.next();
			String name=keyboard.next();
			String pnm=pname+" "+name;
			System.out.println("Enter nation, position and current status of the player:");
			String nation=keyboard.next();
			String pos=keyboard.next();
			String status=keyboard.next();
			System.out.println("Enter the birth date of the player:");
			String bdate=keyboard.next();
			String comm="";
			int insertedr=stmt.executeUpdate("insert into WATCH_LIST values ('"+comm+"','"+pos+"','"+bdate+"','"+nation+"','"+status+"','"+pnm+"','"+id+"')");
			
			if (insertedr > 0) {
				System.out.println("Player added to database.");
			} else {
				System.out.println("Couldnt add!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void removewplayer() {
		Connection con = null;
		Statement stmt = null;
		String id;
		System.out.println("Enter the ID of the player that you want to end the contract:");
		Scanner scan = new Scanner (System.in);
		id=scan.next();
		try
        {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:kaan07/123456@127.0.0.1");
            PreparedStatement prepared_statement = null;
            stmt = con.createStatement();           
            String strq="delete from WATCH_LIST where WP_ID='"+id+"'";
            prepared_statement = con.prepareStatement(strq);
            int x= stmt.executeUpdate(strq);
            if (x > 0)
            {
                 System.out.println("Removed.");                    
            }
            else
            {
                System.out.println("Can't remove!");                
            }
            
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {				
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
		
	private static void Instruction() {

		System.out.println("1)Club Info:");
		System.out.println("2)Players:");
		System.out.println("3)Coaches:");
		System.out.println("4)Medical Staff:");
		System.out.println("5)Scout Team:");
		System.out.println("6)Match Squad:");
		System.out.println("7)Buildings:");
		System.out.println("8)Sponsors:");
		System.out.println("9)Directors:");
	}

	private static void enterance() {
		System.out.println("Choose your user type:");
		System.out.println("[C]oach");
		System.out.println("[D]irector");
		System.out.println("[M]edical Staff");
		System.out.println("[S]cout Team");
		System.out.println("[V]isitor");

	}

	private static void getPlayers() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from PLAYERS order by P_ID asc");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getInt(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.print(rs.getString(7) + "\t");
				System.out.print(rs.getString(8) + "\t");
				System.out.print(rs.getString(9) + "\t");
				System.out.println(rs.getString(10) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getCoaches() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Coaches");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.print(rs.getString(6) + "\t");
				System.out.println(rs.getString(7) + "\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void getClubName() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from FOOTBALL_CLUB");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getInt(3) + "\t");

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static boolean checkpassword(String id, int password) {
		if (id.equals("group5") && password == 4453) {
			return true;
		} else
			return false;

	}
		
	private static void IDirector() {
		System.out.println("1)End contract with a player:");
		System.out.println("2)Start a contract with a player:");
		System.out.println("3)Start a sponsorship:");
		System.out.println("4)End a sponsorship:");
		System.out.println("5)Start a contract with a coach:");
		System.out.println("6)End contract with a coach:");
		System.out.println("7)Add a slogan to sponsorship:");
		System.out.println("9)Information update: ");

	}
	
	public static void deleteccontract() {//Scanner scan1 = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		String id;
		System.out.println("Enter the ID of the coach that you want to remove:");
		Scanner scan = new Scanner (System.in);
		id=scan.next();
		try
        {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
            PreparedStatement prepared_statement = null;
            stmt = con.createStatement();
            String strQuery = 	"delete from C_CONTRACT where CC_ID ='" +id+"'"; 
            String strque= "delete from COACHES where C_ID ='" +id+"'"; 
            prepared_statement = con.prepareStatement(strQuery);
            int x = stmt.executeUpdate(strQuery);
            int y=stmt.executeUpdate(strque);
            if (x > 0 && y>0)
            {
                 System.out.println("Deleted.");                    
            }
            else
            {
                System.out.println("Can't delete!");                
            }
            
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {				
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}}

	public static void deletescontract() {//Scanner scan1 = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		String id;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the ID of the sponsor that you want to end:");
		id=scan.next();
		try
        {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
            PreparedStatement prepared_statement = null;
            stmt = con.createStatement();
            String strQuery = 	"delete from S_CONTRACT where SC_ID ='" +id+"'";
            String strque= "delete from SPONSORSHIP where S_ID ='" +id+"'";
            prepared_statement = con.prepareStatement(strQuery);
            prepared_statement = con.prepareStatement(strque);
            int x = stmt.executeUpdate(strQuery);
            int y = stmt.executeUpdate(strque);
            if (x > 0 && y > 0)
            {
                 System.out.println("Deleted.");                    
            }
            else
            {
                System.out.println("Can't delete!");                
            }
            
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {				
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}}

	public static void deletepcontract() {//Scanner scan1 = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		String id;
		System.out.println("Enter the ID of the player that you want to end the contract:");
		Scanner scan = new Scanner (System.in);
		id=scan.next();
		try
        {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
            PreparedStatement prepared_statement = null;
            stmt = con.createStatement();
            String strQuery = 	"delete from P_CONTRACT where PC_ID ='" +id+"'";
            String strq="delete from PLAYERS where P_ID='"+id+"'";
            prepared_statement = con.prepareStatement(strQuery);
            prepared_statement = con.prepareStatement(strq);
            int x = stmt.executeUpdate(strQuery);
            int y= stmt.executeUpdate(strq);
            if (x > 0 && y > 0)
            {
                 System.out.println("Deleted.");                    
            }
            else
            {
                System.out.println("Can't delete!");                
            }
            
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {				
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
	
	public static void addcontract() {Connection con = null;
	Statement stmt = null;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager
				.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
		stmt = con.createStatement();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the ID of the new sponsorship:");
		String id = keyboard.next();
		System.out.println("Enter the start date and end date:");
		String sdate=keyboard.next();
		String edate=keyboard.next();
		System.out.println("Enter the brand name of the new sponsorship:");
		String bname=keyboard.nextLine();
		String cname="Manchester City";
		int insertedr=stmt.executeUpdate("insert into SPONSORSHIP values ('"+bname+"','"+cname+"','"+id+"')");
		int insertedRows = stmt.executeUpdate("insert into S_CONTRACT values ('" + sdate + "', '"+edate+"','"+id+"')");

		
		if (insertedRows > 0 && insertedr>0) {
			System.out.println("Sponsorship added.");
		} else {
			System.out.println("Couldnt add!");
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}}

	public static void addslogan() {Connection con = null;
	Statement stmt = null;
	ResultSet rs =null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager
				.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
		stmt = con.createStatement();
		
		Scanner keyboard = new Scanner(System.in);			
		System.out.println("Enter the brand name of the sponsorship:");
		String bname=keyboard.nextLine();			
		System.out.println("Enter the slogan of the sponsorship:");
		String slogan=keyboard.nextLine();
		
		
		int insertedr=stmt.executeUpdate("update SPONSORSHIP set SLOGAN= '"+slogan+"' where BRAND_NAME= '"+bname+"'");
		if ( insertedr>0) {
			System.out.println("Slogan Updated.");
		} else {
			System.out.println("Couldn't update!");
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	
	public static void addpcontract() {Connection con = null;
	Statement stmt = null;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:kaan07/123456@127.0.0.1");
		stmt = con.createStatement();

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the ID and name of the new player:");
		String id = keyboard.next();
		String pname=keyboard.next();
		String name=keyboard.next();
		String pnm=pname+" "+name;
		System.out.println("Enter jersey number, nation and position of the new player:");
		int jersey=keyboard.nextInt();
		String nation=keyboard.next();
		String pos=keyboard.next();
		System.out.println("Enter the start date and end date:");
		String sdate=keyboard.next();
		String edate=keyboard.next();
		System.out.println("Enter the birth date of the new player:");
		String bdate=keyboard.next();
		String cname="Manchester City";
		String pnum="";
		String addr="";
		int insertedRows = stmt.executeUpdate("insert into P_CONTRACT values ('" + sdate + "', '" + edate + "', '"+id+"')");
		int insertedr=stmt.executeUpdate("insert into PLAYERS values ('"+id+"','"+pnm+"','"+jersey+"','"+nation+"','"+pos+"','"+pnum+"','"+addr+"','"+bdate+"','"+cname+"')");
		
		if (insertedRows > 0) {
			System.out.println("Player added to database.");
		} else {
			System.out.println("Couldnt add!");
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}}
		
	public static void addccontract() {Connection con = null;
	Statement stmt = null;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager
				.getConnection("jdbc:oracle:thin:AT/at123@127.0.0.1");
		stmt = con.createStatement();
		String add="";
		String pnum="";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the ID of the new coach:");
		String id = keyboard.next();
		System.out.println("Enter the start date and end date:");
		String sdate=keyboard.next();
		String edate=keyboard.next();
		String cname="Manchester City";
		System.out.println("Enter the birth date of the new coach:");
		String bd=keyboard.next();
		System.out.println("Enter the name of the coach:");
		String name=keyboard.next();
		String name1=keyboard.next();
		String nm=name+" "+name1;
		System.out.println("Enter the profession of the new coach:");
		String prof=keyboard.next();
		String prof1=keyboard.next();
		String prf=prof+" "+prof1;
		int insertedr=stmt.executeUpdate("insert into COACHES values ('"+id+"','"+nm+"','"+prf+"','"+add+"','"+pnum+"','"+bd+"','"+cname+"')");
		int insertedRows = stmt.executeUpdate("insert into C_CONTRACT values ('" + sdate + "', '" + edate + "', '"+id+"')");

		
		if (insertedRows > 0 && insertedr>0) {
			System.out.println("New coach added.");
		} else {
			System.out.println("Couldn't add!");
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
			
}