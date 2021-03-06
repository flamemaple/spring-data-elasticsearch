package org.springframework.data.elasticsearch.core.completion;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.CompletionField;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Mewes Kochheim
 */
@Document(indexName = "test-completion-index", type = "annotated-completion-type", indexStoreType = "memory", shards = 1, replicas = 0, refreshInterval = "-1")
public class AnnotatedCompletionEntity {

	@Id
	private String id;
	private String name;

	@CompletionField(payloads = true, maxInputLength = 100)
	private Completion suggest;

	private AnnotatedCompletionEntity() {
	}

	public AnnotatedCompletionEntity(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Completion getSuggest() {
		return suggest;
	}

	public void setSuggest(Completion suggest) {
		this.suggest = suggest;
	}
}
