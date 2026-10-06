package p000;

import java.io.PushbackReader;
import java.io.Reader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfj extends PushbackReader {

    /* JADX INFO: renamed from: a */
    private int f3092a;

    /* JADX INFO: renamed from: b */
    private int f3093b;

    /* JADX INFO: renamed from: c */
    private int f3094c;

    public bfj(Reader reader) {
        super(reader, 8);
        this.f3092a = 0;
        this.f3093b = 0;
        this.f3094c = 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        int i3 = i;
        boolean z = true;
        int i4 = 0;
        int i5 = 0;
        while (z && i4 < i2) {
            z = super.read(cArr2, i5, 1) == 1;
            if (z) {
                char c = cArr2[i5];
                int i6 = this.f3092a;
                switch (i6) {
                    case 0:
                        if (c == '&') {
                            this.f3092a = 1;
                            c = '&';
                            i6 = 1;
                        }
                        break;
                    case 1:
                        if (c != '#') {
                            this.f3092a = 5;
                            i6 = 5;
                        } else {
                            i6 = 2;
                            this.f3092a = 2;
                        }
                        break;
                    case 2:
                        if (c == 'x') {
                            this.f3093b = 0;
                            this.f3094c = 0;
                            this.f3092a = 3;
                            i6 = 3;
                        } else if (c >= '0' && c <= '9') {
                            this.f3093b = Character.digit(c, 10);
                            this.f3094c = 1;
                            this.f3092a = 4;
                            i6 = 4;
                        } else {
                            this.f3092a = 5;
                            i6 = 5;
                        }
                        break;
                    case 3:
                        if ((c >= '0' && c <= '9') || ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                            this.f3093b = (this.f3093b * 16) + Character.digit(c, 16);
                            int i7 = this.f3094c + 1;
                            this.f3094c = i7;
                            if (i7 > 4) {
                                this.f3092a = 5;
                                i6 = 5;
                            } else {
                                this.f3092a = 3;
                                i6 = 3;
                            }
                        } else if (c != ';') {
                            this.f3092a = 5;
                            i6 = 5;
                        } else if (!bfk.m2310b((char) this.f3093b)) {
                            c = ';';
                            this.f3092a = 5;
                            i6 = 5;
                        } else {
                            this.f3092a = 0;
                            c = (char) this.f3093b;
                            i6 = 0;
                        }
                        break;
                    case 4:
                        if (c >= '0' && c <= '9') {
                            this.f3093b = (this.f3093b * 10) + Character.digit(c, 10);
                            int i8 = this.f3094c + 1;
                            this.f3094c = i8;
                            if (i8 > 5) {
                                this.f3092a = 5;
                                i6 = 5;
                            } else {
                                this.f3092a = 4;
                                i6 = 4;
                            }
                        } else if (c != ';') {
                            this.f3092a = 5;
                            i6 = 5;
                        } else if (!bfk.m2310b((char) this.f3093b)) {
                            c = ';';
                            this.f3092a = 5;
                            i6 = 5;
                        } else {
                            this.f3092a = 0;
                            c = (char) this.f3093b;
                            i6 = 0;
                        }
                        break;
                    default:
                        this.f3092a = 0;
                        i6 = 0;
                        break;
                }
                if (i6 == 0) {
                    if (true == bfk.m2310b(c)) {
                        c = ' ';
                    }
                    cArr[i3] = c;
                    i4++;
                    i3++;
                    i5 = 0;
                } else if (i6 == 5) {
                    unread(cArr2, 0, i5 + 1);
                    i5 = 0;
                } else {
                    i5++;
                }
            } else if (i5 > 0) {
                unread(cArr2, 0, i5);
                this.f3092a = 5;
                z = true;
                i5 = 0;
            }
        }
        if (i4 > 0 || z) {
            return i4;
        }
        return -1;
    }
}
