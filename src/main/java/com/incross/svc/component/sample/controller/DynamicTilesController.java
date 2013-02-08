package com.incross.svc.component.sample.controller;

import org.springbyexample.web.servlet.view.tiles2.TilesUrlBasedViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FileName : DynamicTilesController.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 4.
 * @작성자 : 이남규
 * @프로그램설명 : 다이나믹 타일즈에서 definition 변경 방법 샘플 코드
 */
@Controller
public class DynamicTilesController {

	@Autowired
	private TilesUrlBasedViewResolver tilesUrlBasedViewResolver;

	/**
	 * <pre>
	 * popupTiles
	 * 디폴트 layout이 아닌 다른 layout을 사용하고 싶을 때에는 다음과 같이 코드를 작성하도록 한다.
	 * <pre>
	 * @return
	 */
	@RequestMapping(value = "/popupTiles", method = RequestMethod.GET)
	public String popupTiles() {
		tilesUrlBasedViewResolver.isCache();
		tilesUrlBasedViewResolver.clearCache();
		tilesUrlBasedViewResolver.setTilesDefinitionName("popup");

		return "userList";
	}
}
