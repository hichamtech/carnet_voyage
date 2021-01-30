import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { EditDomaineComponent } from './edit-domaine.component';

describe('EditDomaineComponent', () => {
  let component: EditDomaineComponent;
  let fixture: ComponentFixture<EditDomaineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditDomaineComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(EditDomaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
