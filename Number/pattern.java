// Source code is decompiled from a .class file using FernFlower decompiler.
package Number;

import java.util.Random;

class pattern {
   pattern() {
   }

   public static void main(String[] var0) {
      Random var1 = new Random();
      int var2 = var1.nextInt(8);
      int[][] var3 = new int[var2][var2];

      int var4;
      int var5;
      for(var4 = 0; var4 < var2; ++var4) {
         for(var5 = 0; var5 < var2; ++var5) {
            var3[var4][var5] = var1.nextInt(8);
         }
      }

      for(var4 = 1; var4 <= var2; ++var4) {
         for(var5 = 1; var5 <= var4; ++var5) {
            System.out.print(".");
         }

         for(var5 = var4; var5 <= 2 * (var2 + var4); ++var5) {
            System.out.print("  ");
         }

         for(var5 = 1; var5 <= var4; ++var5) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
