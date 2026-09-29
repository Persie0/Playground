package p452w8;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: renamed from: w8.s */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC9838s {

    /* JADX INFO: renamed from: w8.s$a */
    @AutoValue.Builder
    public static abstract class a {
    }

    /* JADX INFO: renamed from: a */
    public static C9829j.a m18330a() {
        C9829j.a aVar = new C9829j.a();
        aVar.m18324c(Priority.DEFAULT);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo18319b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo18320c();

    /* JADX INFO: renamed from: d */
    public abstract Priority mo18321d();

    /* JADX INFO: renamed from: e */
    public final C9829j m18331e(Priority priority) {
        C9829j.a aVarM18330a = m18330a();
        aVarM18330a.m18323b(mo18319b());
        aVarM18330a.m18324c(priority);
        aVarM18330a.f50029b = mo18320c();
        return aVarM18330a.m18322a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo18319b();
        objArr[1] = mo18321d();
        objArr[2] = mo18320c() == null ? "" : Base64.encodeToString(mo18320c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
