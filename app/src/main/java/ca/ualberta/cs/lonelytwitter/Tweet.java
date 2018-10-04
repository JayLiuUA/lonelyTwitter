/*
*   Lonely Twitter
*
*   Version: 1.0
*
*   October 3, 2018
*
*   This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

    @author: Xiaohui1
*   @since 1.0
*   @see java.io
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;

/*  @param: none
    @return: none
 */
    public void setMessage(String message) throws longTweetException {

        if (message.length() > 140) {
            throw new longTweetException();
        }
        this.message = message;
    }
/*  @param: date
    @return: none
 */
    public void setDate(Date date){
        this.date = date;
    }

/*  @param: none
    @return: message
 */
    public String getMessage(){
        return this.message;
    }
/*  @param: none
    @return: date
 */
    public Date getDate(){
        return this.date;
    }
/*  @param: none
    @return: none
 */
    public abstract Boolean isImportant();
/*  @param: none
    @return: string
 */
    public String toString(){
        return this.date.toString()+" | "+this.message;
    }
}
