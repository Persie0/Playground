package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ndi {

    /* JADX INFO: renamed from: a */
    public static final ndk f42045a = m17357a(ndk.f42049d);

    /* JADX INFO: renamed from: a */
    private static ndk m17357a(String[] strArr) {
        ndk ndkVarM17392f;
        try {
            ndkVarM17392f = nea.m17392f();
        } catch (NoClassDefFoundError e) {
            ndkVarM17392f = null;
        }
        if (ndkVarM17392f != null) {
            return ndkVarM17392f;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (ndk) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
