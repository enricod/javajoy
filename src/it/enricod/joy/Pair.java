package it.enricod.joy;

public final class Pair<T, R> {

	private T t;
	private R r;

	public Pair(T t, R r) {
		this.t = t;
		this.r = r;
	}

	public T getFirst() {
		return t;
	}

	public R getSecond() {
		return r;
	}
}
