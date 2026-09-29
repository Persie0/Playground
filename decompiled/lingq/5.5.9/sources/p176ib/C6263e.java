package p176ib;

/* JADX INFO: renamed from: ib.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6263e {
    public C6263e(String str) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }
}
