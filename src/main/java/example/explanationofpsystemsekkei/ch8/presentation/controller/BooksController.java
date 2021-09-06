package example.explanationofpsystemsekkei.ch8.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @Autowired
    BooksQueryService booksQueryService;

    @Autowired
    BookRegisterService bookRegisterService;

    /**
     * 特定の1冊を取得
     */
    @RequestMapping(method = RequestMethod.GET)
    BookResponse booksBy(@RequestParam Nmae name){
        Book book = booksQueryService.findBy(name);
        return BookResponse.from(book);
    }

    /**
     * 本一覧取得 limitあり
     */
    @RequestMapping(method = RequestMethod.GET)
    BooksResponse listAll(@RequestParam(value = "limit", defaultValue = "20", required = false) Limit limit){
        Books books = BooksQueryService.listAll(limit);
        return BooksResponse.from(books);
    }

    /**
     * 絞り込み検索をする
     * category
     * author
     */
    @RequestMapping(method = RequestMethod.GET)
    ResponseBooks booksList(@RequestMapping()){
        // how to configuration multi query parameters.
    }

    /**
     * 本を1冊登録する
     */
    @RequestMapping(method = RequestMethod.POST)
    BookResponse registerBook(@RequestBody BooksRequest booksRequest){
        Book book = booksRequest.toBook();
        bookRegisterService.register(book);
    }
}
