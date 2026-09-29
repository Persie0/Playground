package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class kb3 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f46963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f46964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f46965d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f46966e;

    public /* synthetic */ kb3(String str, Context context, Object obj, int i, int i2) {
        this.f46962a = i2;
        this.f46963b = str;
        this.f46964c = context;
        this.f46966e = obj;
        this.f46965d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f46962a;
        int i2 = this.f46965d;
        Object obj = this.f46966e;
        Context context = this.f46964c;
        String str = this.f46963b;
        switch (i) {
            case 0:
                Object[] objArr = {(hb3) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return nb3.m17311b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return nb3.m17311b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new mb3(-3);
                }
        }
    }
}
