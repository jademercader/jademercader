import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


	public class SampleMenu1 extends JFrame implements ActionListener {

		private JFrame jf;
		private MenuBar mb;
		private Menu fileMenu, editMenu, exerMenu, aboutMenu;
		private MenuItem exitMenu, module1Menu, module2Menu, examMenu, newMenu, openMenu, saveMenu, modiMenu, redoMenu, undoMenu, s_allMenu, F9Menu;
		private String selectedExercise; // Declare the selectedExercise variable

		public SampleMenu1() {
			mb = new MenuBar();

			jf = new JFrame(" ITE4 - Prog 2:     BSCS - 1B.   MCO - FinalMenu - Project on Java Programming      by: Jade C. Mercader      Instructor: Rodel Ventures" );

			fileMenu = new Menu("File");
			newMenu = new MenuItem("New");
			openMenu = new MenuItem("Open");
			saveMenu = new MenuItem("Save");
			exitMenu = new MenuItem("Exit");

			editMenu = new Menu("Edit");
			modiMenu = new MenuItem("Modify");
			redoMenu = new MenuItem("Redo Ctrl Y");
			undoMenu = new MenuItem("Undo Ctrl Z");
			s_allMenu = new MenuItem("Select All");
							
			exerMenu = new Menu("My Activity");
			module1Menu = new MenuItem("Module 1");
			module2Menu = new MenuItem("Module 2");
			examMenu = new MenuItem("Exam");


			aboutMenu = new Menu("About");
			F9Menu = new MenuItem("ako si Jade, Tamad ako pero may nangangarapgarap ako!");

			module1Menu.addActionListener(this);
			module2Menu.addActionListener(this);
			examMenu.addActionListener(this);

			newMenu.addActionListener(this);
			openMenu.addActionListener(this);
			saveMenu.addActionListener(this);
			exitMenu.addActionListener(this);

			F9Menu.addActionListener(this);
		}

		public void show() {
			jf.setMenuBar(mb);
			fileMenu.add(newMenu);
			fileMenu.add(openMenu);
			fileMenu.add(saveMenu);
			fileMenu.addSeparator();
			fileMenu.add(exitMenu);

			editMenu.add(modiMenu);
			editMenu.add(redoMenu);
			editMenu.add(undoMenu);
			editMenu.addSeparator();
			editMenu.add(s_allMenu);

			exerMenu.add(module1Menu);
			exerMenu.add(module2Menu);
			exerMenu.add(examMenu);


			aboutMenu.add(F9Menu);

			mb.add(fileMenu);
			mb.add(editMenu);
			mb.add(exerMenu);
			mb.add(aboutMenu);

			jf.setSize(900, 600);
			jf.setResizable(false);
			jf.setVisible(true);
		}

		 public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();

				if (o == module1Menu) {
					if (selectedExercise != null && selectedExercise.equals("Total1")) {
						runTotal1();

					} else if (selectedExercise != null && selectedExercise.equals("Arr2Display")) {
						runArr2Display();

					} else if (selectedExercise != null && selectedExercise.equals("ArrDisplay")) {
						runArrDisplay();

					} else if (selectedExercise != null && selectedExercise.equals("ArrLargest")) {
						runArrLargest();

					} else if (selectedExercise != null && selectedExercise.equals("ArrLowest")) {
						runArrLowest();

					} else if (selectedExercise != null && selectedExercise.equals("ArrAveSum")) {
						runArrAveSum();

					} else if (selectedExercise != null && selectedExercise.equals("Arr2Average")) {
						runArr2Average();

					} else if (selectedExercise != null && selectedExercise.equals("String1")) {
						runString1();

					} else if (selectedExercise != null && selectedExercise.equals("CompConc1")) {
						runCompConc1();

					} else if (selectedExercise != null && selectedExercise.equals("TVClass1")) {
						runTVClass1();

					} else if (selectedExercise != null && selectedExercise.equals("RadiusCircle1")) {
						runRadiusCircle1();

					} else {
						showModule1Exercises();
					}

				} else if (o == module2Menu) {
					if (selectedExercise != null && selectedExercise.equals("ArrListAdd")) {
						runArrListAdd();

					}else if (selectedExercise != null && selectedExercise.equals("ArrListRem")) {
						runArrListRem();

					}else if (selectedExercise != null && selectedExercise.equals("ArrListChange")) {
						runArrListChange();

					}else if (selectedExercise != null && selectedExercise.equals("ArrListSort")) {
						runArrListSort();

					}else if (selectedExercise != null && selectedExercise.equals("ArrListAddRemo")) {
						runArrListAddRemo();

					}else if (selectedExercise != null && selectedExercise.equals("ArrPFAve")) {
						runArrPFAve();

					}else if (selectedExercise != null && selectedExercise.equals("ArrListRem2")) {
						runArrListRem2();

					}else if (selectedExercise != null && selectedExercise.equals("String2")) {
						runString2();

					}else if (selectedExercise != null && selectedExercise.equals("String3")) {
						runString3();

					}else if (selectedExercise != null && selectedExercise.equals("Stack1")) {
						runStack1();

					}else if (selectedExercise != null && selectedExercise.equals("PushStack")) {
						runPushStack();

					}else if (selectedExercise != null && selectedExercise.equals("RemQueue")) {
						runRemQueue();

					}else if (selectedExercise != null && selectedExercise.equals("StackPushPop")) {
						runStackPushPop();

					}else if (selectedExercise != null && selectedExercise.equals("QueueRemDel")) {
						runQueueRemDel();

					 } else {
						showModule2Exercises();
					}

				} else if (o == examMenu) {
					if (selectedExercise != null && selectedExercise.equals("ExamAveArray")) {
					    runExamAveArray();

					}else if (selectedExercise != null && selectedExercise.equals("ExamString")) {
					    runExamString1();

					}else if (selectedExercise != null && selectedExercise.equals("ExamSort")) {
					    runExamSort();

					}else if (selectedExercise != null && selectedExercise.equals("ExamConcatenate")) {
					    runExamConcatenate();

					}else if (selectedExercise != null && selectedExercise.equals("ExamObject")) {
					    runExamObject();

					} else {
						showExamExercises();
					}

				} else if (o == F9Menu) {
					String output = "Programmer: Jade C. Mercader\n";
					output += "Course: Computer Science\n";
					output += "ITE4 - Programming 2\n";
					output += "NwSSU Main Campus\n";
					output += "Final Project and Compilation..\n";

					JOptionPane.showMessageDialog(null, output, "About Me", JOptionPane.INFORMATION_MESSAGE);
				} else if (o == exitMenu) {
					JOptionPane.showMessageDialog(null, "Exit");
					System.exit(0);
				}
			}

			public void showModule1Exercises() {
				String[] module1Exercises = {
						"Total1",
						"Arr2Display",
						"ArrLargest",
						"ArrDisplay",
						"ArrLowest",
						"ArrAveSum",
						"Arr2Average",
						"String1",
						"CompConc1",
						"RadiusCircle1",
						"TVClass1",
				};

				selectedExercise = (String) JOptionPane.showInputDialog(null, "Select an exercise:", "Module 1", JOptionPane.PLAIN_MESSAGE, null, module1Exercises, module1Exercises[0]);

				if (selectedExercise != null) {
					if (selectedExercise.equals("Total1")) {
						runTotal1();
					} else if (selectedExercise.equals("Arr2Display")) {
						runArr2Display();

					} else if (selectedExercise.equals("ArrDisplay")) {
						runArrDisplay();

					} else if (selectedExercise.equals("ArrLargest")) {
						runArrLargest();

					} else if (selectedExercise.equals("ArrLowest")) {
						runArrLowest();

					} else if (selectedExercise.equals("ArrAveSum")) {
						runArrAveSum();

					} else if (selectedExercise.equals("Arr2Average")) {
						runArr2Average();

					}else if (selectedExercise.equals("String1")) {
						    runString1();

					}else if (selectedExercise.equals("CompConc1")) {
						    runCompConc1();

					}else if (selectedExercise.equals("TVClass1")) {
						    runTVClass1();

				    }else if (selectedExercise.equals("RadiusCircle1")) {
						    runRadiusCircle1();

					} else {

						JOptionPane.showMessageDialog(null, "You selected: " + selectedExercise);
					}
				}
			}

			public void showModule2Exercises() {
				String[] module2Exercises = {
						"ArrListAdd",
						"ArrListRem",
						"ArrListChange",
						"ArrListSort",
						"ArrListAddRemo",
						"ArrPFAve",
						"ArrListRem2",
						"String2",
						"String3",
						"Stack1",
						"PushStack",
						"RemQueue",
						"StackPushPop",
						"QueueRemDel",

				};

				selectedExercise = (String) JOptionPane.showInputDialog(null, "Select an exercise:", "Module 2", JOptionPane.PLAIN_MESSAGE, null, module2Exercises, module2Exercises[0]);

				if (selectedExercise != null) {
					if (selectedExercise.equals("ArrListAdd")) {
						runArrListAdd();

					} else if (selectedExercise.equals("ArrListRem")) {
						runArrListRem();

					} else if (selectedExercise.equals("ArrListChange")) {
						runArrListChange();

					} else if (selectedExercise.equals("ArrListSort")) {
						runArrListSort();

					} else if (selectedExercise.equals("ArrListAddRemo")) {
						runArrListAddRemo();

					} else if (selectedExercise.equals("ArrPFAve")) {
						runArrPFAve();

					} else if (selectedExercise.equals("ArrListRem2")) {
						runArrListRem2();

					} else if (selectedExercise.equals("String2")) {
						runString2();

					} else if (selectedExercise.equals("String3")) {
						runString3();

					} else if (selectedExercise.equals("Stack1")) {
						runStack1();

					} else if (selectedExercise.equals("PushStack")) {
						runPushStack();

					} else if (selectedExercise.equals("RemQueue")) {
						runRemQueue();

					} else if (selectedExercise.equals("StackPushPop")) {
						runStackPushPop();

					} else if (selectedExercise.equals("QueueRemDel")) {
						runQueueRemDel();

					} else {
						JOptionPane.showMessageDialog(null, "You selected: " + selectedExercise);
					}
				}
			}

			public void showExamExercises() {
				String[] ExamExercises = {
						"ExamAveArray",
						"ExamString",
						"ExamSort",
						"ExamConcatenate",
						"ExamObject",
				};

				selectedExercise = (String) JOptionPane.showInputDialog(null, "Select an exercise:", "Exam", JOptionPane.PLAIN_MESSAGE, null, ExamExercises, ExamExercises[0]);

				if (selectedExercise != null) {
					if (selectedExercise.equals("ExamAveArray")) {
						runExamAveArray();

					}else if (selectedExercise.equals("ExamString")) {
						runExamString1();

					}else if (selectedExercise.equals("ExamSort")) {
						runExamSort();

					}else if (selectedExercise.equals("ExamConcatenate")) {
						runExamConcatenate();

					}else if (selectedExercise.equals("ExamObject")) {
						runExamObject();

					} else {
						JOptionPane.showMessageDialog(null, "You selected: " + selectedExercise);
				}
			}
		}

			public void runTotal1() {
				String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
				int count = Integer.parseInt(countInput);

				int[] values = new int[count];

				for (int i = 0; i < values.length; i++) {
					String elementInput = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
					int element = Integer.parseInt(elementInput);
					values[i] = element;
				}

				int total = 0;
				for (int i = 0; i < values.length; i++) {
					total += values[i];
				}
				JOptionPane.showMessageDialog(null, "The total is: " + total);
			}

			public void runArrDisplay() {
				String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
				int count = Integer.parseInt(countInput);

				int[] arr = new int[count];
				for (int i = 0; i < arr.length; i++) {
					String elementInput = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
					int element = Integer.parseInt(elementInput);
					arr[i] = element;
				}

				String output = "";
				for (int i = 0; i < arr.length; i++) {
					output += i + "\t" + arr[i] + "\n";
				}
				JOptionPane.showMessageDialog(null, "Array elements:\n" + output);
			}

			public void runArrLargest() {
				String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
				int count = Integer.parseInt(countInput);

				int[] data = new int[count];

				for (int i = 0; i < data.length; i++) {
					String elementInput = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
					int element = Integer.parseInt(elementInput);
					data[i] = element;
				}

				int max = data[0];

				for (int i = 1; i < data.length; i++) {
					if (data[i] > max) {
						max = data[i];
					}
				}

				JOptionPane.showMessageDialog(null, "The largest element is: " + max);
			}

			public void runArr2Display() {
				String countInput = JOptionPane.showInputDialog(null, "Enter the number of students:");
				int studentCount = Integer.parseInt(countInput);

				String testCountInput = JOptionPane.showInputDialog(null, "Enter the number of tests:");
				int testCount = Integer.parseInt(testCountInput);

				double[][] grades = new double[studentCount][testCount];

				for (int i = 0; i < studentCount; i++) {
					for (int j = 0; j < testCount; j++) {
						String gradeInput = JOptionPane.showInputDialog(null, "Enter grade for student " + (i + 1) + " test " + (j + 1) + ":");
						double grade = Double.parseDouble(gradeInput);
						grades[i][j] = grade;
					}
				}

				String output = "Grades:\n";
				for (int i = 0; i < studentCount; i++) {
					output += "Student " + (i + 1) + ": ";
					for (int j = 0; j < testCount; j++) {
						output += grades[i][j] + " ";
					}
					output += "\n";
				}

				JOptionPane.showMessageDialog(null, output);
			}

			public void runArrLowest() {

				int[] data = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
				int min = data[0];
				for (int i = 1; i < data.length; i++) {
							if (data[i] < min) {
								min = data[i];
							}
						}

					 JOptionPane.showMessageDialog(null, "The lowest number is: " + min);
			}

			public void runArrAveSum() {

				int[] values = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
						int sum = 0;

						for (int i = 0; i < values.length; i++) {
							sum += values[i];
						}
						double average = (double) sum / values.length;

				   JOptionPane.showMessageDialog(null, "The sum is: " + sum);
				   JOptionPane.showMessageDialog(null, "The average is: " + average);
		}

		public void runArr2Average() {
			String countInput = JOptionPane.showInputDialog(null, "Enter the number of students:");
						int studentCount = Integer.parseInt(countInput);

						String testCountInput = JOptionPane.showInputDialog(null, "Enter the number of tests:");
						int testCount = Integer.parseInt(testCountInput);

				double[][] grades = new double[studentCount][testCount];
				for (int i = 0; i < studentCount; i++) {
								for (int j = 0; j < testCount; j++) {
									String gradeInput = JOptionPane.showInputDialog(null, "Enter grade for student " + (i + 1) + " test " + (j + 1) + ":");
									double grade = Double.parseDouble(gradeInput);
									grades[i][j] = grade;
								}
							}

							String output = "Grades:\n";
							for (int i = 0; i < studentCount; i++) {
								output += "Student " + (i + 1) + ": ";
								for (int j = 0; j < testCount; j++) {
									output += grades[i][j] + " ";
								}
								output += "\n";
							}

							JOptionPane.showMessageDialog(null, output);
			}

			public void runString1() {
			    String input = JOptionPane.showInputDialog(null, "Enter a string:");
			    int length = input.length();
			    StringBuilder reversed = new StringBuilder(input).reverse();

			    JOptionPane.showMessageDialog(null, "Length: " + length);
			    JOptionPane.showMessageDialog(null, "Reversed: " + reversed);
			}

			public void runCompConc1() {
				String string1 = JOptionPane.showInputDialog(null, "Enter string 1:");
			    String string2 = JOptionPane.showInputDialog(null, "Enter string 2:");

			    boolean areEqual = string1.equals(string2);
				String concatenated = string1 + " " + string2;

				JOptionPane.showMessageDialog(null, "Strings are" + (areEqual ? "" : " not") + " Equal");
				JOptionPane.showMessageDialog(null, "Concatenate: " + concatenated);
			}

			public void runTVClass1() {
				TV tv1 = new TV();
			    TV tv2 = new TV();

				tv1.setOn(true);
				tv1.setChannel(40);
				tv1.setVolume(5);

				JOptionPane.showMessageDialog(null, "TV1: Channel = " + tv1.getChannel() + ", Volume = " + tv1.getVolume());
				JOptionPane.showMessageDialog(null, "TV2: Channel = " + tv2.getChannel() + ", Volume = " + tv2.getVolume());
			 }

			 public void runRadiusCircle1() {
				 Circle circle1 = new Circle();
				 Circle circle2 = new Circle();
				 Circle circle3 = new Circle();

				 JOptionPane.showMessageDialog(null, "Circle 1: radius = " + circle1.getRadius() + ", area = " + circle1.getArea());
				 JOptionPane.showMessageDialog(null, "Circle 2: radius = " + circle2.getRadius() + ", area = " + circle2.getArea());
				 JOptionPane.showMessageDialog(null, "Circle 3: radius = " + circle3.getRadius() + ", area = " + circle3.getArea());

				 circle2.setRadius(300);
				 JOptionPane.showMessageDialog(null, "Circle 2: new radius = " + circle2.getRadius() + ", new area = " + circle2.getArea());
    }

           public void runArrListAdd() {
				ArrayList<String> list = new ArrayList<String>();

				String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
				int count = Integer.parseInt(countInput);

				for (int i = 0; i < count; i++) {
					String element = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
					list.add(element);
				}

				JOptionPane.showMessageDialog(null, "Elements in the ArrayList: " + list);
			}
    public void runArrListRem() {
		     ArrayList<String> list = new ArrayList<String>();

		     String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
		     int count = Integer.parseInt(countInput);

		     for (int i = 0; i < count; i++) {
		         String element = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
		         list.add(element);
		     }

		     String output = "Elements in the ArrayList: " + list + "\n";

		     String indexInput = JOptionPane.showInputDialog(null, "Enter the index of the element to remove (0-" + (count - 1) + "):");
		     int index = Integer.parseInt(indexInput);

		     if (index >= 0 && index < count) {
		         String removedElement = list.remove(index);
		         output += "Removed element: " + removedElement + "\n";
		         output += "Updated ArrayList: " + list;
		     } else {
		         output += "Invalid index! Please enter a valid index.";
		     }

		     JOptionPane.showMessageDialog(null, output);
		 }

		public void runArrListSort() {
			        ArrayList<Integer> numbers = new ArrayList<>();

			        numbers.add(5);
			        numbers.add(3);
			        numbers.add(8);
			        numbers.add(1);
			        numbers.add(4);

			        JOptionPane.showMessageDialog(null, "Original list: " + numbers);

			        Collections.sort(numbers);

			        JOptionPane.showMessageDialog(null, "Sorted list (ascending order): " + numbers);
    }

    public void runArrListAddRemo() {
		    ArrayList<String> list = new ArrayList<String>();

		    String countInput = JOptionPane.showInputDialog(null, "Enter the number of elements:");
		    int count = Integer.parseInt(countInput);

		    for (int i = 0; i < count; i++) {
		        String element = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":");
		        list.add(element);
		    }

		    JOptionPane.showMessageDialog(null, "Elements in the ArrayList: " + list);

		    String removeInput = JOptionPane.showInputDialog(null, "Enter the index of the element to remove:");
		    int index = Integer.parseInt(removeInput);

		    if (index >= 0 && index < list.size()) {
		        list.remove(index);
		        JOptionPane.showMessageDialog(null, "Element at index " + index + " removed.");
		    } else {
		        JOptionPane.showMessageDialog(null, "Invalid index.");
		    }

		    JOptionPane.showMessageDialog(null, "Updated elements in the ArrayList: " + list);
		}

		    public void runArrPFAve() {
			    int[] values = {90, 87, 84, 88, 85, 84, 90, 80, 80, 87};
			    int sum = 0;
			    double average;

			    for (int i = 0; i < values.length; i++) {
			        sum += values[i];
			    }

			    average = (double) sum / values.length;

			    JOptionPane.showMessageDialog(null, "Average score: " + average);

			    if (average >= 75) {
			        JOptionPane.showMessageDialog(null, "Passed");
			    } else {
			         JOptionPane.showMessageDialog(null, "Failed");
			    }
			}

			public void runArrListRem2() {
				Queue<Integer> queue = new LinkedList<>();
				      queue.add(1);
				      queue.add(2);
				      queue.add(3);
				      queue.add(4);
				      queue.add(5);

				      JOptionPane.showMessageDialog(null, "Queue: " + queue);


				      int numToRemove = 2;
				      for (int i = 0; i < numToRemove; i++) {
				         int removedElement = queue.remove();
				         JOptionPane.showMessageDialog(null, "Removed Element: " + removedElement);
				      }

				      JOptionPane.showMessageDialog(null, "Queue after deletion: " + queue);
				  }

		 public void runString2() {
		   String inputString = JOptionPane.showInputDialog(null, "Enter String:");
			int length = inputString.length();
			System.out.println("Length: " + length);

			  String reversedString = "";
				for (int i = length - 1; i >= 0; i--) {
					  reversedString += inputString.charAt(i);
					    }
					JOptionPane.showMessageDialog(null, "Reversed: " + reversedString);

				if (inputString.equals(reversedString)) {
					JOptionPane.showMessageDialog(null, "It's a Palindrome");
					 } else {
					 JOptionPane.showMessageDialog(null, "It's not a Palindrome");
				 }
			 }

			 public void runString3() {
				  MyClass t1 = new MyClass();
				  MyClass t2 = new MyClass();
				  MyClass t3 = new MyClass();
				  JOptionPane.showMessageDialog(null, t1.x + " " + t2.x + " " + t3.x);
    }

    public void runStack1() {
		Stack<String> stack = new Stack<String>();

		        stack.push("Java");
		        stack.push("Python");
		        stack.push("C++");
		        stack.push("JavaScript");

		        JOptionPane.showMessageDialog(null, "Stack elements: " + stack);

		        String topElement = stack.pop();
		        JOptionPane.showMessageDialog(null, "Removed element: " + topElement);

		        String peekElement = stack.peek();
		        JOptionPane.showMessageDialog(null, "Top element: " + peekElement);

		        int stackSize = stack.size();
		        JOptionPane.showMessageDialog(null, "Stack size: " + stackSize);
    }

    public void runPushStack() {
		 Stack<Integer> stack = new Stack<>();

		        stack.push(1);
		        stack.push(2);
		        stack.push(3);
		        stack.push(4);
		        stack.push(5);

		        JOptionPane.showMessageDialog(null, "Stack: " + stack);
    }

    public void runRemQueue() {
		Queue<Integer> queue = new LinkedList<>();

		      queue.add(10);
		      queue.add(20);
		      queue.add(30);
		      queue.add(40);
		      queue.add(50);

		      JOptionPane.showMessageDialog(null, "Original Queue: " + queue);
		      int removedElement = queue.remove();
		      JOptionPane.showMessageDialog(null, "Element removed from the Queue: " + removedElement);
		      JOptionPane.showMessageDialog(null, "Queue after removing an element: " + queue);
   }
   public void runStackPushPop() {
	   Stack<Integer> stack = new Stack<>();

	         stack.push(10);
	         stack.push(20);
	         stack.push(30);
	         stack.push(40);
	         stack.push(50);

	         JOptionPane.showMessageDialog(null, "Original Stack: " + stack);
	         int poppedElement1 = stack.pop();
	         int poppedElement2 = stack.pop();

	         JOptionPane.showMessageDialog(null, "Elements popped from the Stack: " + poppedElement1 + ", " + poppedElement2);
	         JOptionPane.showMessageDialog(null,"Stack after popping elements: " + stack);
   }

   public void runQueueRemDel() {
	   Queue<Integer> queue = new LinkedList<>();
	         queue.add(10);
	         queue.add(20);
	         queue.add(30);
	         queue.add(40);
	         queue.add(50);
	         System.out.println("Initial Queue: " + queue);

	         int removedElement = queue.remove();
	         JOptionPane.showMessageDialog(null, "Removed Element: " + removedElement);
	          JOptionPane.showMessageDialog(null, "Queue after removal: " + queue);

	         boolean isDeleted = queue.remove(30);
	         if (isDeleted) {
	             JOptionPane.showMessageDialog(null, "Element 30 is deleted from the queue");
	         } else {
	             JOptionPane.showMessageDialog(null, "Element 30 is not present in the queue");
	         }
	          JOptionPane.showMessageDialog(null, "Queue after deletion: " + queue);
   }

        public void runArrListChange() {
		ArrayList<String> list = new ArrayList<>();
		        list.add("apple");
		        list.add("banana");
		        list.add("cherry");
		        list.add("date");

		        JOptionPane.showMessageDialog(null, "Before change: " + list);
		        list.set(2, "grape");

		        JOptionPane.showMessageDialog(null, "After change: " + list);
    }

    public void runExamAveArray() {
		    String countInput = JOptionPane.showInputDialog(null, "Enter the number of students:");
		    int studentCount = Integer.parseInt(countInput);

		    String testCountInput = JOptionPane.showInputDialog(null, "Enter the number of tests:");
		    int testCount = Integer.parseInt(testCountInput);

		    double[][] grades = new double[studentCount][testCount];
		    for (int i = 0; i < studentCount; i++) {
		        for (int j = 0; j < testCount; j++) {
		            String gradeInput = JOptionPane.showInputDialog(null, "Enter grade for student " + (i + 1) + " test " + (j + 1) + ":");
		            double grade = Double.parseDouble(gradeInput);
		            grades[i][j] = grade;
		        }
		    }

		    String output = "Grades and Results:\n";
		    for (int i = 0; i < studentCount; i++) {
		        double average = calculateAverage(grades[i]);
		        output += "Student " + (i + 1) + ": ";
		        for (int j = 0; j < testCount; j++) {
		            output += grades[i][j] + " ";
		        }
		        output += "- Average: " + average;
		        output += " - Result: " + (average >= 70 ? "Passed" : "Failed");
		        output += "\n";
		    }

		    JOptionPane.showMessageDialog(null, output);
		}

		public double calculateAverage(double[] grades) {
		    double sum = 0;
		    for (double grade : grades) {
		        sum += grade;
		    }
		    return sum / grades.length;
		}

		public void runExamString1() {
		    int[][] scores = {{95, 86, 80}, {90, 84, 75}, {65, 83, 97}, {87, 95, 91}, {88, 94, 93},
		                      {77, 77, 88}, {68, 88, 84}, {99, 60, 60}, {88, 94, 70}, {99, 89, 75}};

		    StringBuilder output = new StringBuilder("No. Test1  Test2  Test3  Average\n");
		    for (int i = 0; i < scores.length; i++) {
		        double sum = 0;
		        output.append(String.format("%d    ", i + 1));
		        for (int j = 0; j < scores[i].length; j++) {
		            output.append(String.format("%d      ", scores[i][j]));
		            sum += scores[i][j];
		        }
		        double average = sum / scores[i].length;
		        output.append(String.format("%.2f\n", average));
		    }

		    JOptionPane.showMessageDialog(null, output.toString());
		}

		public void runExamSort() {
			 int[] arr = {99, 23, 83, 94, 35, 18, 34, 46};

			        JOptionPane.showMessageDialog(null, "Original Elements: " + Arrays.toString(arr));

			        int n = arr.length;
			        for (int i = 0; i < n-1; i++) {
			            for (int j = 0; j < n-i-1; j++) {
			                if (arr[j] > arr[j+1]) {
			                    int temp = arr[j];
			                    arr[j] = arr[j+1];
			                    arr[j+1] = temp;
			                }
			            }
			        }

			        JOptionPane.showMessageDialog(null, "Sorted Elements: " + Arrays.toString(arr));
    }

  public void runExamConcatenate() {
      String str1 = JOptionPane.showInputDialog(null, "Enter String1:");
      int len1 = str1.length();
      JOptionPane.showMessageDialog(null, "Length: " + len1);

      String str2 = JOptionPane.showInputDialog(null, "Enter String2:");
      int len2 = str2.length();
      JOptionPane.showMessageDialog(null, "Length: " + len2);

      String concat = str1 + " and " + str2;
      JOptionPane.showMessageDialog(null, "Concatenate: " + concat);
  }

        public void runExamObject() {
	        Student myStudent1 = new Student();
	  		myStudent1.firstName = "Anthony";
	  		myStudent1.lastName = "Abelgas";
	  		myStudent1.classYear = 2024;
	  		myStudent1.major = "Computer Science";

	  		Student myStudent2 = new Student();
	  		myStudent2.firstName = "Micheal";
	  		myStudent2.lastName = "Estrelles";
	  		myStudent2.classYear = 2023;
	  		myStudent2.major = "Business";

	  		JOptionPane.showMessageDialog(null, "STUDENT 1: ");
	  		JOptionPane.showMessageDialog(null, myStudent1.firstName);
	  		JOptionPane.showMessageDialog(null, myStudent1.lastName);
	  		JOptionPane.showMessageDialog(null, myStudent1.classYear);
	  		JOptionPane.showMessageDialog(null, myStudent1.major);
	  		JOptionPane.showMessageDialog(null, "STUDENT 2: ");
	  		JOptionPane.showMessageDialog(null, myStudent2.firstName);
	  		JOptionPane.showMessageDialog(null, myStudent2.lastName);
	  		JOptionPane.showMessageDialog(null, myStudent2.classYear);
	  		JOptionPane.showMessageDialog(null, myStudent2.major);

	}

			public static void main(String[] args) {
			    SampleMenu1 menu = new SampleMenu1();
			    menu.show();
			}
		}



