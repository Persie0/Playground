package p000;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.camera.p014ui.remotecontrol.RemoteControlView;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gdi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24312b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24313c;

    public /* synthetic */ gdi(icc iccVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = iccVar;
        this.f24311a = i;
    }

    public /* synthetic */ gdi(iex iexVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = iexVar;
        this.f24311a = i;
    }

    public /* synthetic */ gdi(Consumer consumer, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = consumer;
        this.f24311a = i;
    }

    public gdi(jfj jfjVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = jfjVar;
        this.f24311a = i;
    }

    public /* synthetic */ gdi(kcj kcjVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = kcjVar;
        this.f24311a = i;
    }

    public /* synthetic */ gdi(kkh kkhVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = kkhVar;
        this.f24311a = i;
    }

    public /* synthetic */ gdi(kxz kxzVar, int i, int i2) {
        this.f24313c = i2;
        this.f24312b = kxzVar;
        this.f24311a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f24313c) {
            case 0:
                this.f24312b.accept(Integer.valueOf(this.f24311a));
                break;
            case 1:
                this.f24312b.accept(Integer.valueOf(this.f24311a));
                break;
            case 2:
                icc iccVar = (icc) this.f24312b;
                if (this.f24311a == iccVar.f30326v) {
                    iccVar.m11047d();
                    break;
                }
                break;
            case 3:
                Object obj = this.f24312b;
                int i = this.f24311a;
                iex iexVar = (iex) obj;
                if (iexVar.f30574c == null) {
                    iexVar.f30574c = (RemoteControlView) iexVar.f30575d.inflate();
                    iexVar.f30577f = new ieu(iexVar.f30574c);
                }
                iexVar.f30576e.mo7482d(iexVar.f30577f);
                iexVar.f30578g = iexVar.f30572a.registerReceiver(iexVar.f30581j, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                iexVar.f30579h = true;
                iexVar.f30576e.mo7487i(ely.SMARTS);
                RemoteControlView remoteControlView = iexVar.f30574c;
                if (i >= 0) {
                    remoteControlView.f7164a.setText(i + "%");
                } else {
                    remoteControlView.f7164a.setText("--");
                }
                Intent intent = iexVar.f30578g;
                if (intent != null) {
                    iexVar.m11158a(intent);
                    iexVar.f30578g = null;
                }
                break;
            case 4:
                ((jfj) this.f24312b).m13032k(this.f24311a);
                break;
            case 5:
                Object obj2 = this.f24312b;
                int i2 = this.f24311a;
                kcj kcjVar = (kcj) obj2;
                kcjVar.f35571c = i2;
                if (!kcjVar.f35570b.isEmpty()) {
                    Iterator it = kcjVar.f35570b.iterator();
                    while (it.hasNext()) {
                        ((kdr) it.next()).m14003a(i2);
                    }
                    kbo kboVar = kcjVar.f35569a;
                    switch (i2) {
                        case 1:
                            str = "NONE";
                            break;
                        case 2:
                            str = "RESTRICT_VIBRATION";
                            break;
                        default:
                            str = "RESTRICT_VIBRATION_SOUND";
                            break;
                    }
                    kboVar.mo13944f("Camera audio restriction set to ".concat(str));
                }
                break;
            case 6:
                ((kkh) this.f24312b).m14419a(this.f24311a);
                break;
            default:
                ((kxz) this.f24312b).f37691b.mo14521e(this.f24311a);
                break;
        }
    }
}
