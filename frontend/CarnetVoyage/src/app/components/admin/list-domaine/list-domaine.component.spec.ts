import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { ListDomaineComponent } from './list-domaine.component';

describe('ListDomaineComponent', () => {
  let component: ListDomaineComponent;
  let fixture: ComponentFixture<ListDomaineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListDomaineComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(ListDomaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
