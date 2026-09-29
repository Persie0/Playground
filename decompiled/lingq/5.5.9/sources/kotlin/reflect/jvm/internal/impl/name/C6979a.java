package kotlin.reflect.jvm.internal.impl.name;

import dm.C5207g;
import mn.C7646c;
import mo.C7661i;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6979a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39483a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.BEGINNING.ordinal()] = 1;
            iArr[State.AFTER_DOT.ordinal()] = 2;
            iArr[State.MIDDLE.ordinal()] = 3;
            f39483a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13891a(String str) {
        State state = State.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f39483a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i11 == 3) {
                    if (cCharAt == '.') {
                        state = State.AFTER_DOT;
                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                        return false;
                    }
                }
            }
        }
        return state != State.AFTER_DOT;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX INFO: renamed from: b */
    public static final C7646c m13892b(C7646c c7646c, C7646c c7646c2) {
        boolean z10;
        C5207g.m11111f(c7646c, "<this>");
        C5207g.m11111f(c7646c2, "prefix");
        if (!C5207g.m11106a(c7646c, c7646c2) && !c7646c2.m15216d()) {
            String strM15214b = c7646c.m15214b();
            C5207g.m11110e(strM15214b, "this.asString()");
            String strM15214b2 = c7646c2.m15214b();
            C5207g.m11110e(strM15214b2, "packageName.asString()");
            z10 = false;
            if (C7661i.m15256V2(strM15214b, strM15214b2, false) && strM15214b.charAt(strM15214b2.length()) == '.') {
            }
            if (!z10 && !c7646c2.m15216d()) {
                if (C5207g.m11106a(c7646c, c7646c2)) {
                    C7646c c7646c3 = C7646c.f42076c;
                    C5207g.m11110e(c7646c3, "ROOT");
                    return c7646c3;
                }
                String strM15214b3 = c7646c.m15214b();
                C5207g.m11110e(strM15214b3, "asString()");
                String strSubstring = strM15214b3.substring(c7646c2.m15214b().length() + 1);
                C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                return new C7646c(strSubstring);
            }
            return c7646c;
        }
        z10 = true;
        if (!z10) {
            return c7646c;
        }
        if (C5207g.m11106a(c7646c, c7646c2)) {
            C7646c c7646c4 = C7646c.f42076c;
            C5207g.m11110e(c7646c4, "ROOT");
            return c7646c4;
        }
        String strM15214b4 = c7646c.m15214b();
        C5207g.m11110e(strM15214b4, "asString()");
        String strSubstring2 = strM15214b4.substring(c7646c2.m15214b().length() + 1);
        C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return new C7646c(strSubstring2);
    }
}
