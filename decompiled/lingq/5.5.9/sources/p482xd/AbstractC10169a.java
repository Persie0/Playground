package p482xd;

import p338qd.C8573r0;

/* JADX INFO: renamed from: xd.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10169a implements InterfaceC10173e<Character> {

    /* JADX INFO: renamed from: xd.a$a */
    public static abstract class a extends AbstractC10169a {
        @Override // p482xd.InterfaceC10173e
        @Deprecated
        public final boolean apply(Character ch2) {
            return mo19189b(ch2.charValue());
        }
    }

    /* JADX INFO: renamed from: xd.a$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: a */
        public final char f51472a;

        public b(char c10) {
            this.f51472a = c10;
        }

        @Override // p482xd.AbstractC10169a
        /* JADX INFO: renamed from: b */
        public final boolean mo19189b(char c10) {
            return c10 == this.f51472a;
        }

        public final String toString() {
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            char c10 = this.f51472a;
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            String strCopyValueOf = String.copyValueOf(cArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(strCopyValueOf);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: xd.a$c */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: a */
        public final String f51473a = "CharMatcher.none()";

        public final String toString() {
            return this.f51473a;
        }
    }

    /* JADX INFO: renamed from: xd.a$d */
    public static final class d extends c {

        /* JADX INFO: renamed from: b */
        public static final d f51474b = new d();

        @Override // p482xd.AbstractC10169a
        /* JADX INFO: renamed from: a */
        public final int mo19188a(int i10, CharSequence charSequence) {
            C8573r0.m16687N(i10, charSequence.length());
            return -1;
        }

        @Override // p482xd.AbstractC10169a
        /* JADX INFO: renamed from: b */
        public final boolean mo19189b(char c10) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public int mo19188a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        C8573r0.m16687N(i10, length);
        while (i10 < length) {
            if (mo19189b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo19189b(char c10);
}
