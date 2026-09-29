package p452w8;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: w8.n */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC9833n {

    /* JADX INFO: renamed from: w8.n$a */
    @AutoValue.Builder
    public static abstract class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m18328a(String str, String str2) {
            Map<String, String> map = ((C9827h.a) this).f50019f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18325a(String str) {
        String str2 = mo18305b().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map<String, String> mo18305b();

    /* JADX INFO: renamed from: c */
    public abstract Integer mo18306c();

    /* JADX INFO: renamed from: d */
    public abstract C9832m mo18307d();

    /* JADX INFO: renamed from: e */
    public abstract long mo18308e();

    /* JADX INFO: renamed from: f */
    public final int m18326f(String str) {
        String str2 = mo18305b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo18309g();

    /* JADX INFO: renamed from: h */
    public abstract long mo18310h();

    /* JADX INFO: renamed from: i */
    public final C9827h.a m18327i() {
        C9827h.a aVar = new C9827h.a();
        aVar.m18313d(mo18309g());
        aVar.f50015b = mo18306c();
        aVar.m18312c(mo18307d());
        aVar.f50017d = Long.valueOf(mo18308e());
        aVar.f50018e = Long.valueOf(mo18310h());
        aVar.f50019f = new HashMap(mo18305b());
        return aVar;
    }
}
