package td;

import android.os.IInterface;
import com.google.android.play.core.internal.zzat;
import java.util.ArrayList;
import java.util.Iterator;
import p290o6.C7967l0;
import p457wd.C9907h;

/* JADX INFO: renamed from: td.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9254c extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractRunnableC9250a f47944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9262j f47945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9254c(C9262j c9262j, C9907h c9907h, AbstractRunnableC9250a abstractRunnableC9250a) {
        super(c9907h);
        this.f47945c = c9262j;
        this.f47944b = abstractRunnableC9250a;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C9262j c9262j = this.f47945c;
        IInterface iInterface = c9262j.f47965n;
        ArrayList arrayList = c9262j.f47955d;
        AbstractRunnableC9250a abstractRunnableC9250a = this.f47944b;
        C7967l0 c7967l0 = c9262j.f47953b;
        if (iInterface == null && !c9262j.f47958g) {
            c7967l0.m15814o("Initiate binding to the service.", new Object[0]);
            arrayList.add(abstractRunnableC9250a);
            ServiceConnectionC9261i serviceConnectionC9261i = new ServiceConnectionC9261i(c9262j);
            c9262j.f47964m = serviceConnectionC9261i;
            c9262j.f47958g = true;
            if (!c9262j.f47952a.bindService(c9262j.f47959h, serviceConnectionC9261i, 1)) {
                c7967l0.m15814o("Failed to bind to the service.", new Object[0]);
                c9262j.f47958g = false;
                Iterator it = arrayList.iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList.clear();
                            return;
                        }
                        AbstractRunnableC9250a abstractRunnableC9250a2 = (AbstractRunnableC9250a) it.next();
                        zzat zzatVar = new zzat();
                        C9907h c9907h = abstractRunnableC9250a2.f47942a;
                        if (c9907h != null) {
                            c9907h.m18407a(zzatVar);
                        }
                    }
                }
            }
        } else {
            if (c9262j.f47958g) {
                c7967l0.m15814o("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC9250a);
                return;
            }
            abstractRunnableC9250a.run();
        }
    }
}
