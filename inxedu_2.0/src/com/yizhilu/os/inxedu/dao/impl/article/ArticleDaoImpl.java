package com.yizhilu.os.inxedu.dao.impl.article;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yizhilu.os.inxedu.common.dao.GenericDaoImpl;
import com.yizhilu.os.inxedu.common.entity.PageEntity;
import com.yizhilu.os.inxedu.dao.article.ArticleDao;
import com.yizhilu.os.inxedu.entity.article.Article;
import com.yizhilu.os.inxedu.entity.article.ArticleContent;
import com.yizhilu.os.inxedu.entity.article.QueryArticle;

@Repository("articleDao")
public class ArticleDaoImpl extends GenericDaoImpl implements ArticleDao {

	public int createArticle(Article article) {
		this.insert("ArticleMapper.createArticle", article);
		return article.getArticleId();
	}

	public void addArticleContent(ArticleContent content) {
		this.insert("ArticleMapper.addArticleContent", content);
	}

	public void updateArticle(Article article) {
		this.update("ArticleMapper.updateArticle", article);
	}

	public void updateArticleContent(ArticleContent content) {
		this.update("ArticleMapper.updateArticleContent", content);
	}

	public void deleteArticleByIds(String articleIds) {
		this.delete("ArticleMapper.deleteArticleByIds", articleIds);
	}

	public void deleteArticleContentByArticleIds(String articleIds) {
		this.delete("ArticleMapper.deleteArticleContentByArticleIds", articleIds);
	}

	public Article queryArticleById(int articleId) {
		return this.selectOne("ArticleMapper.queryArticleById", articleId);
	}

	public String queryArticleContentByArticleId(int articleId) {
		return this.selectOne("ArticleMapper.queryArticleContentByArticleId", articleId);
	}

	/**
	 * 分页查询文章列表
	 */
	public List<Article> queryArticlePage(QueryArticle query, PageEntity page) {
		return this.queryForListPageCount("ArticleMapper.queryArticlePage", query, page);
	}

	public void updateArticleNum(Map<String, String> map) {
		this.update("ArticleMapper.updateArticleNum", map);
	}

	public List<Article> queryArticleListByIds(String articleIds) {
		return this.selectList("ArticleMapper.queryArticleListByIds", articleIds);
	}

	/**
	 * 公共多条件查询文章资讯列表,用于前台
	 */
	public List<Article> queryArticleList(QueryArticle queryArticle) {
		return this.selectList("ArticleMapper.queryArticleList", queryArticle);
	}

	public int queryAllArticleCount() {
		return this.selectOne("ArticleMapper.queryAllArticleCount", null);
	}

}
