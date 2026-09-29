package p000;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* JADX INFO: renamed from: iy */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3127iy implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f44752b;

    public /* synthetic */ C3127iy(Context context, int i) {
        this.f44751a = i;
        this.f44752b = context;
    }

    @Override // p000.on9
    public final Object get() {
        u52 u52Var;
        int i = this.f44751a;
        Context context = this.f44752b;
        switch (i) {
            case 0:
                return AbstractC3352my.m17083B(context);
            case 1:
                return new b64(context, 25);
            case 2:
                new i62();
                new sq6(2);
                context.getApplicationContext();
                bw8 bw8Var = new bw8();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                map.clear();
                map2.clear();
                return bw8Var;
            case 3:
                return new i92(context);
            default:
                ImmutableList immutableList = u52.f63412p;
                synchronized (u52.class) {
                    try {
                        if (u52.f63418v == null) {
                            Context applicationContext = context.getApplicationContext();
                            HashMap map3 = new HashMap(8);
                            map3.put(0, 1000000L);
                            map3.put(2, -9223372036854775807L);
                            map3.put(3, -9223372036854775807L);
                            map3.put(4, -9223372036854775807L);
                            map3.put(5, -9223372036854775807L);
                            map3.put(10, -9223372036854775807L);
                            map3.put(9, -9223372036854775807L);
                            map3.put(7, -9223372036854775807L);
                            u52.f63418v = new u52(applicationContext, map3);
                        }
                        u52Var = u52.f63418v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return u52Var;
        }
    }
}
