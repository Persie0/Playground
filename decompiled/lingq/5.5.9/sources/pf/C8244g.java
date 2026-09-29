package pf;

import no.C7814a0;

/* JADX INFO: renamed from: pf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8244g extends C7814a0 {
    @Override // no.C7814a0
    /* JADX INFO: renamed from: a */
    public final int mo15554a(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        }
        if (c10 >= 'a' && c10 <= 'z') {
            sb2.append((char) ((c10 - 'a') + 14));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - ':') + 15));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - '[') + 22));
            return 2;
        }
        if (c10 == '`') {
            sb2.append((char) 2);
            sb2.append((char) (c10 - '`'));
            return 2;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) ((c10 - 'A') + 1));
            return 2;
        }
        if (c10 < '{' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return mo15554a((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) ((c10 - '{') + 27));
        return 2;
    }

    @Override // no.C7814a0
    /* JADX INFO: renamed from: b */
    public final int mo15555b() {
        return 2;
    }
}
