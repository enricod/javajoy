package it.enricod.joy.operators;

import java.util.HashMap;
import java.util.Map;

public class OperatorsRegistry implements IOperatorsRegistry {

	private Map<String, IOperator> builtinOperators = new HashMap<String, IOperator>();
	private Map<String, IOperator> userOperators = new HashMap<String, IOperator>();

	@Override
	public IOperator getOperator(String name) {
		if (builtinOperators.containsKey(name)) {
			return builtinOperators.get(name);
		} else if (userOperators.containsKey(name)) {
			return userOperators.get(name);
		} else {
			return new DummyOperator(name);
		}
	}

	@Override
	public void init() {
		builtinOperators.put("put", new DupOperator());
		builtinOperators.put("+", new AddOp());
		builtinOperators.put("-", new SubtractOp());
		builtinOperators.put("*", new MultiplyOp());
		builtinOperators.put("/", new DivideOp());
	}

}
