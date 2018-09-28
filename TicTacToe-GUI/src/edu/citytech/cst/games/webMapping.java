package edu.citytech.cst.games;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webMapping {
	
	@RequestMapping("/tictactoe")
	public Map<String, Object> move(@RequestParam(value="moves")String move) 
	{
	
			Map<String,Object> Details = new HashMap<>();
			Details.put("moves", move);
			String[] ret = TicTacToeLogic.whoWonPlusWinningCombo(move);
			Details.put("whoWon: ", ret[0]);
			Details.put("Winning Combination: ", ret[1]);
			Details.put("isWinner", ret[2]);
		return (Details);
	}
	
	@RequestMapping("/author")
	public Map<String,Object> getDetailInformation() {
		Map<String,Object> info = new HashMap<>();
		info.put("author","Wei.Liang");
		info.put("email", "wheresthepros@gmail.com");
		return info;
		}


}
