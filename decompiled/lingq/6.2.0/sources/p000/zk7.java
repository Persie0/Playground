package p000;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class zk7 {

    /* JADX INFO: renamed from: a */
    public final Context f71681a;

    /* JADX INFO: renamed from: b */
    public final cs4 f71682b;

    /* JADX INFO: renamed from: c */
    public final int f71683c;

    /* JADX INFO: renamed from: d */
    public final cs4 f71684d;

    /* JADX INFO: renamed from: e */
    public final cs4 f71685e;

    /* JADX INFO: renamed from: f */
    public boolean f71686f;

    public zk7(Context context, lna lnaVar) {
        context.getClass();
        lnaVar.getClass();
        this.f71681a = context;
        final int i = 0;
        this.f71682b = AbstractC3192a.m15356a(new ui3(this) { // from class: yk7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zk7 f69935b;

            {
                this.f69935b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                zk7 zk7Var = this.f69935b;
                switch (i2) {
                    case 0:
                        return ((al7) zk7Var.f71685e.getValue()).f807a;
                    default:
                        return pb1.m19014B(zk7Var.f71681a);
                }
            }
        });
        this.f71683c = Process.myPid();
        final int i2 = 1;
        this.f71684d = AbstractC3192a.m15356a(new y47(lnaVar, i2));
        this.f71685e = AbstractC3192a.m15356a(new ui3(this) { // from class: yk7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zk7 f69935b;

            {
                this.f69935b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                zk7 zk7Var = this.f69935b;
                switch (i3) {
                    case 0:
                        return ((al7) zk7Var.f71685e.getValue()).f807a;
                    default:
                        return pb1.m19014B(zk7Var.f71681a);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final String m25683a() {
        return (String) this.f71682b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Map m25684b(Map map) {
        cs4 cs4Var = this.f71684d;
        if (map == null) {
            return AbstractC3194a.m15364Q(new Pair(m25683a(), new xk7(Process.myPid(), (String) cs4Var.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(m25683a(), new xk7(Process.myPid(), (String) cs4Var.getValue()));
        return AbstractC3194a.m15371X(linkedHashMap);
    }
}
