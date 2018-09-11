import { Component } from '@angular/core';

import {DefaultService, Card} from './typescript-angular-client/index';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  card: Card;

  constructor(private defaultService: DefaultService) {}

  ngOnInit() {
    this.defaultService.cardsCardNumberGet('0123456789').subscribe(value => {
      this.card = value;
    });
  }

}
