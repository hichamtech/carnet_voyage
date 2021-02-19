import { TestBed } from '@angular/core/testing';

import { ApiActiviteService } from './api-activite.service';

describe('ApiActiviteService', () => {
  let service: ApiActiviteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiActiviteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
