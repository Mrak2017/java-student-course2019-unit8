import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable, of } from 'rxjs';
import { JournalEntity } from 'src/app/model/core/journal-entity.model';
import { FILTER_CODE_QUESTION_ANSWERS_COUNT, JournalFilterItem } from 'src/app/model/core/journal-filter-item';
import { JournalItem } from 'src/app/model/core/journal-item.model';
import { JournalRequest } from 'src/app/model/core/journal-request.model';
import { JournalResult } from 'src/app/model/core/journal-result.model';
import { QuestionJournalItem } from 'src/app/model/question-journal-item.model';

export const QUESTIONS_JOURNAL_ID = 'questions';

@Injectable()
export class JournalBackendMockService {

  constructor(private http:HttpClient) {
  }

  getJournalInfo(id: string): Observable<JournalEntity> {
    return this.http.get<JournalEntity>(this.getRestUrl() + 'api/journal/' + id);
  }

  getResult(request: JournalRequest): Observable<JournalResult> {
    return this.http.put<JournalResult>(this.getRestUrl() + 'api/journal/get-query', request);
  }

  private getRestUrl(): string {
    return 'http://localhost:8080/';
  }
}
