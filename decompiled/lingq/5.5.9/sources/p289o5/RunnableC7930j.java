package p289o5;

import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.play.core.assetpacks.C3112c;
import dm.C5207g;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p080e.C5288t;
import p115fb.ServiceConnectionC5495k;
import p116fc.C5504a;
import p136gc.C5752h;
import p136gc.C5756l;
import p136gc.InterfaceC5746b;
import p152hb.C5992n;
import p290o6.C7967l0;
import p338qd.C8571q1;
import p338qd.C8573r0;
import p338qd.C8592y;
import p338qd.InterfaceC8589w1;
import p402u0.C9370m;
import p457wd.C9904e;
import p457wd.C9905f;
import p457wd.C9910k;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: o5.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7930j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43216b;

    public /* synthetic */ RunnableC7930j(int i10, Object obj) {
        this.f43215a = i10;
        this.f43216b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x003a A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        C8592y c8592y;
        switch (this.f43215a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C9370m) this.f43216b).m17742d(C7939s.f43251k);
                return;
            case 1:
                ServiceConnectionC7938r serviceConnectionC7938r = (ServiceConnectionC7938r) this.f43216b;
                serviceConnectionC7938r.f43240d.f43158a = 0;
                serviceConnectionC7938r.f43240d.f43163f = null;
                serviceConnectionC7938r.m15749a(C7939s.f43251k);
                return;
            case 2:
                ((ServiceConnectionC5495k) this.f43216b).m11718a("Service disconnected", 2);
                return;
            case 3:
                if (((C5752h) this.f43216b).m12115c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
                return;
            case 4:
                Object obj = this.f43216b;
                C5992n c5992n = (C5992n) obj;
                c5992n.f35559m.lock();
                try {
                    C5992n.m12445k((C5992n) obj);
                    c5992n.f35559m.unlock();
                    return;
                } catch (Throwable th2) {
                    c5992n.f35559m.unlock();
                    throw th2;
                }
            case 5:
                C5504a c5504a = (C5504a) this.f43216b;
                synchronized (c5504a.f34121a) {
                    if (c5504a.m11734b()) {
                        Log.e("WakeLock", String.valueOf(c5504a.f34130j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        c5504a.m11736d();
                        if (c5504a.m11734b()) {
                            c5504a.f34123c = 1;
                            c5504a.m11737e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (((C5756l) this.f43216b).f34826c) {
                    Object obj2 = ((C5756l) this.f43216b).f34827d;
                    if (((InterfaceC5746b) obj2) != null) {
                        ((InterfaceC5746b) obj2).mo12096d();
                    }
                    break;
                }
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C8571q1 c8571q1 = (C8571q1) this.f43216b;
                InterfaceC8589w1 interfaceC8589w1 = (InterfaceC8589w1) c8571q1.f45950b.zza();
                C3112c c3112c = c8571q1.f45949a;
                c3112c.getClass();
                HashMap map = new HashMap();
                C7967l0 c7967l0 = C3112c.f15905c;
                HashMap map2 = new HashMap();
                try {
                    for (File file : c3112c.m8971e()) {
                        String strM8977m = c3112c.m8977m(file.getName());
                        if (strM8977m != null) {
                            File file2 = new File(strM8977m, "assets");
                            if (file2.isDirectory()) {
                                c8592y = new C8592y(strM8977m, 0, file2.getCanonicalPath());
                            } else {
                                c7967l0.m15812m("Failed to find assets directory: %s", file2);
                            }
                            if (c8592y != null) {
                                map2.put(file.getName(), c8592y);
                            }
                        }
                        c8592y = null;
                        if (c8592y != null) {
                            map2.put(file.getName(), c8592y);
                        }
                        break;
                    }
                } catch (IOException e10) {
                    c7967l0.m15812m("Could not process directory while scanning installed packs: %s", e10);
                }
                for (String str : map2.keySet()) {
                    map.put(str, Long.valueOf(c3112c.m8973i(str)));
                }
                C9910k c9910kMo8955a = interfaceC8589w1.mo8955a(map);
                InterfaceC9268p interfaceC9268p = c8571q1.f45952d;
                Executor executor = (Executor) interfaceC9268p.zza();
                C5288t c5288t = new C5288t(9, c3112c);
                c9910kMo8955a.getClass();
                c9910kMo8955a.f50544b.m12894b(new C9904e(executor, c5288t));
                c9910kMo8955a.m18409b();
                c9910kMo8955a.f50544b.m12894b(new C9905f((Executor) interfaceC9268p.zza(), C8573r0.f45961M));
                c9910kMo8955a.m18409b();
                return;
            default:
                C5207g.m11107b(((InterfaceC2041a) this.f43216b).mo807E(), "invoke(...)");
                return;
        }
    }
}
