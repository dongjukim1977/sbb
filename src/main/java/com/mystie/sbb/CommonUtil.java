package com.mystie.sbb;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
    public String markdown(String markdown) {
        // Markdown 파서 생성
        Parser parser = Parser.builder().build();
        // Markdown 텍스트를 파싱하여 Node 생성
        Node document = parser.parse(markdown);
        // HTML 렌더러 생성
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        // Markdown 을 HTML 로 렌더링
        return renderer.render(document);
    }
}
