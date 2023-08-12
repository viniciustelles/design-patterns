package br.com.design.patterns.state.states;

import br.com.design.patterns.state.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
