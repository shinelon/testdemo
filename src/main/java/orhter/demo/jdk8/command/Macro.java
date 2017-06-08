package orhter.demo.jdk8.command;

import java.util.ArrayList;
import java.util.List;

public class Macro {
	private final List<Action> actions;
	
	public Macro() {
		actions=new ArrayList<>();
	}
	public void record(Action action){
		actions.add(action);
	}
	public void run(){
		actions.forEach(Action::perform);
	}
	
	public static void main(String[] args) {
		Macro macro=new Macro();
		EditorImpl editorImpl=new EditorImpl();
		//原始命令模式
		macro.record(new Save(editorImpl));
		//使用lambda改造命令模式
		macro.record(editorImpl::save);
		macro.record(editorImpl::open);
		macro.run();
	}
}
