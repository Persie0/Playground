package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Base64;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: po */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0910po extends ood implements omx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f47442a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f47443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(alw alwVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = alwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(aqa aqaVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = aqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(arc arcVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = arcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(awh awhVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = awhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(bck bckVar, int i, byte[] bArr, byte[] bArr2) {
        super(0);
        this.f47443b = i;
        this.f47442a = bckVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(kah kahVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = kahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(kmt kmtVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = kmtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(lxm lxmVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = lxmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(lzb lzbVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = lzbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(mrm mrmVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = mrmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(omx omxVar, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = omxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(C0913pr c0913pr, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = c0913pr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910po(byte[] bArr, int i) {
        super(0);
        this.f47443b = i;
        this.f47442a = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x0225  */
    /* JADX WARN: Type inference failed for: r0v11, types: [alw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, omx] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, omx] */
    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2077a() throws NoSuchMethodException, ClassNotFoundException {
        arb arbVar;
        boolean z;
        Class clsM2069a = null;
        switch (this.f47443b) {
            case 0:
                ((C0913pr) this.f47442a).m19329b();
                return oki.f46196a;
            case 1:
                ((C0913pr) this.f47442a).m19331d();
                return oki.f46196a;
            case 2:
                return this.f47442a.mo2077a();
            case 3:
                return this.f47442a.mo2077a();
            case 4:
                return all.m912b(this.f47442a);
            case 5:
                return ((aqa) this.f47442a).m1854f();
            case 6:
                arc arcVar = (arc) this.f47442a;
                String str = arcVar.f2178b;
                if (str == null || !arcVar.f2180d) {
                    Context context = arcVar.f2177a;
                    nax naxVar = new nax((char[]) null);
                    arc arcVar2 = (arc) this.f47442a;
                    arbVar = new arb(context, str, naxVar, arcVar2.f2179c, arcVar2.f2181e, null, null, null, null);
                } else {
                    File noBackupFilesDir = arcVar.f2177a.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    File file = new File(noBackupFilesDir, ((arc) this.f47442a).f2178b);
                    Context context2 = ((arc) this.f47442a).f2177a;
                    String absolutePath = file.getAbsolutePath();
                    nax naxVar2 = new nax((char[]) null);
                    arc arcVar3 = (arc) this.f47442a;
                    arbVar = new arb(context2, absolutePath, naxVar2, arcVar3.f2179c, arcVar3.f2181e, null, null, null, null);
                }
                afj.m508h(arbVar, ((arc) this.f47442a).f2183g);
                return arbVar;
            case 7:
                return BigInteger.valueOf(((awh) this.f47442a).f2581b).shiftLeft(32).or(BigInteger.valueOf(((awh) this.f47442a).f2582c)).shiftLeft(32).or(BigInteger.valueOf(((awh) this.f47442a).f2583d));
            case 8:
                Class<?> clsLoadClass = ((ClassLoader) ((bck) this.f47442a).f2948a).loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getBounds", new Class[0]);
                Method method2 = clsLoadClass.getMethod("getType", new Class[0]);
                Method method3 = clsLoadClass.getMethod("getState", new Class[0]);
                method.getClass();
                if (bck.m2197h(method, ooj.m18762a(Rect.class)) && bck.m2196g(method)) {
                    method2.getClass();
                    if (bck.m2197h(method2, ooj.m18762a(Integer.TYPE)) && bck.m2196g(method2)) {
                        method3.getClass();
                        z = bck.m2197h(method3, ooj.m18762a(Integer.TYPE)) && bck.m2196g(method3);
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                Method method4 = ((bck) this.f47442a).m2210d().getMethod("getWindowLayoutComponent", new Class[0]);
                Class clsM2211e = ((bck) this.f47442a).m2211e();
                method4.getClass();
                return Boolean.valueOf(bck.m2196g(method4) && bck.m2195f(method4, clsM2211e));
            case 10:
                try {
                    clsM2069a = ((awc) ((bck) this.f47442a).f2949b).m2069a();
                    break;
                } catch (ClassNotFoundException e) {
                }
                if (clsM2069a == null) {
                    return false;
                }
                Class clsM2211e2 = ((bck) this.f47442a).m2211e();
                Method method5 = clsM2211e2.getMethod("addWindowLayoutInfoListener", Activity.class, clsM2069a);
                Method method6 = clsM2211e2.getMethod("removeWindowLayoutInfoListener", clsM2069a);
                method5.getClass();
                if (bck.m2196g(method5)) {
                    method6.getClass();
                    z = bck.m2196g(method6);
                }
                return Boolean.valueOf(z);
            case 11:
                Class<?> clsLoadClass2 = ((ClassLoader) ((bck) this.f47442a).f2948a).loadClass(rgoX.yxcEcAeedRSgZ);
                clsLoadClass2.getClass();
                Method declaredMethod = clsLoadClass2.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class clsM2210d = ((bck) this.f47442a).m2210d();
                declaredMethod.getClass();
                return Boolean.valueOf(bck.m2195f(declaredMethod, clsM2210d) && bck.m2196g(declaredMethod));
            case 12:
                Set setMo19375b = ((kah) this.f47442a).f35479a.mo19375b();
                HashSet hashSet = new HashSet();
                Iterator it = setMo19375b.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C0952rc) it.next()).f47535a);
                }
                return hashSet;
            case 13:
                return ((kmt) this.f47442a).m14584c();
            case 14:
                return new String((byte[]) this.f47442a, oph.f46377a);
            case 15:
                return Base64.encodeToString((byte[]) this.f47442a, 11);
            case 16:
                return oqv.m18926g((oly) ((mrm) this.f47442a).mo16811e(ord.f46447b));
            case 17:
                lzb lzbVar = (lzb) this.f47442a;
                if (lzbVar.f39597g == null || lzbVar.f39598h == null) {
                    return null;
                }
                nxl nxlVarM18137O = nuu.f44695d.m18137O();
                String str2 = lzbVar.f39597g;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nuu nuuVar = (nuu) nxqVar;
                str2.getClass();
                nuuVar.f44697a = 1 | nuuVar.f44697a;
                nuuVar.f44698b = str2;
                String str3 = lzbVar.f39598h;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nuu nuuVar2 = (nuu) nxlVarM18137O.f44974b;
                str3.getClass();
                nuuVar2.f44697a = 2 | nuuVar2.f44697a;
                nuuVar2.f44699c = str3;
                return (nuu) nxlVarM18137O.mo18103l();
            case 18:
                Object obj = this.f47442a;
                Set setM18717v = omn.m18717v();
                lzb lzbVar2 = (lzb) obj;
                nxd nxdVar = lzbVar2.f39599i;
                if (nxdVar != null) {
                    setM18717v.add(new lvx(nxdVar));
                }
                nxd nxdVar2 = lzbVar2.f39600j;
                if (nxdVar2 != null) {
                    setM18717v.add(new lvv(nxdVar2));
                }
                nxd nxdVar3 = lzbVar2.f39601k;
                if (nxdVar3 != null) {
                    setM18717v.add(new lvy(nxdVar3));
                }
                nuw nuwVar = lzbVar2.f39602l;
                if (nuwVar != null) {
                    setM18717v.add(new lvz(nuwVar));
                }
                if (lzbVar2.f39603m) {
                    setM18717v.add(lvw.f39417a);
                }
                omn.m18720y(setM18717v);
                return setM18717v;
            case 19:
                return ((lxm) this.f47442a).f39520j.f39540d;
            default:
                return ((lxm) this.f47442a).f39520j.f39541e;
        }
    }
}
