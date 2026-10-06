package p000;

import android.content.pm.ResolveInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgv implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f27753a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27754b;

    public /* synthetic */ hgv(MediaFormat mediaFormat, int i) {
        this.f27754b = i;
        this.f27753a = mediaFormat;
    }

    public /* synthetic */ hgv(Surface surface, int i) {
        this.f27754b = i;
        this.f27753a = surface;
    }

    public /* synthetic */ hgv(AmbientDelegate ambientDelegate, int i, byte[] bArr, byte[] bArr2) {
        this.f27754b = i;
        this.f27753a = ambientDelegate;
    }

    public /* synthetic */ hgv(dhv dhvVar, int i) {
        this.f27754b = i;
        this.f27753a = dhvVar;
    }

    public /* synthetic */ hgv(hgx hgxVar, int i) {
        this.f27754b = i;
        this.f27753a = hgxVar;
    }

    public /* synthetic */ hgv(hpg hpgVar, int i) {
        this.f27754b = i;
        this.f27753a = hpgVar;
    }

    public /* synthetic */ hgv(hth hthVar, int i) {
        this.f27754b = i;
        this.f27753a = hthVar;
    }

    public /* synthetic */ hgv(Comparable comparable, int i) {
        this.f27754b = i;
        this.f27753a = comparable;
    }

    public /* synthetic */ hgv(jlk jlkVar, int i) {
        this.f27754b = i;
        this.f27753a = jlkVar;
    }

    public /* synthetic */ hgv(jxd jxdVar, int i) {
        this.f27754b = i;
        this.f27753a = jxdVar;
    }

    public /* synthetic */ hgv(kgr kgrVar, int i) {
        this.f27754b = i;
        this.f27753a = kgrVar;
    }

    public /* synthetic */ hgv(kkq kkqVar, int i) {
        this.f27754b = i;
        this.f27753a = kkqVar;
    }

    public /* synthetic */ hgv(kkr kkrVar, int i) {
        this.f27754b = i;
        this.f27753a = kkrVar;
    }

    public /* synthetic */ hgv(knx knxVar, int i) {
        this.f27754b = i;
        this.f27753a = knxVar;
    }

    public /* synthetic */ hgv(kty ktyVar, int i) {
        this.f27754b = i;
        this.f27753a = ktyVar;
    }

    public /* synthetic */ hgv(ljk ljkVar, int i) {
        this.f27754b = i;
        this.f27753a = ljkVar;
    }

    public /* synthetic */ hgv(nwr nwrVar, int i) {
        this.f27754b = i;
        this.f27753a = nwrVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f27754b) {
            case 0:
                mws mwsVar = (mws) obj;
                hgx hgxVar = (hgx) this.f27753a;
                hgxVar.f27761f.mo10271h(mwsVar);
                hgxVar.f27761f.mo10268e(mwsVar);
                ArrayList arrayList = new ArrayList();
                int size = mwsVar.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) mwsVar.get(i);
                    if (hgxVar.f27758c.mo10046m(hgt.m10253b(resolveInfo.activityInfo.packageName))) {
                        arrayList.add(resolveInfo.activityInfo.applicationInfo.loadLabel(hgxVar.f27766k).toString());
                    }
                }
                return arrayList;
            case 1:
                Object obj2 = this.f27753a;
                List list = (List) obj;
                if (list.size() == 1) {
                    return (String) list.get(0);
                }
                if (list.size() == 2) {
                    return ((hgx) obj2).f27756a.getResources().getString(C0100R.string.pref_social_share_two_apps_summary, list.get(0), list.get(1));
                }
                return list.size() > 2 ? ((hgx) obj2).f27756a.getResources().getString(C0100R.string.pref_social_share_three_apps_summary, list.get(0), list.get(1), list.get(2)) : "";
            case 2:
                ?? r0 = this.f27753a;
                List list2 = (List) obj;
                ((Boolean) list2.get(0)).booleanValue();
                ((Boolean) list2.get(1)).booleanValue();
                dhx dhxVar = diw.f11719a;
                r0.mo6179g();
                return false;
            case 3:
                Object obj3 = this.f27753a;
                ((nbe) ((nbe) hpg.f28767a.m17252c()).mo17276G((char) 3832)).mo17290o("stopRecording() stop camcorder");
                hpg hpgVar = (hpg) obj3;
                hpgVar.f28799af.m13651b();
                hpgVar.f28827t.m10552c();
                return null;
            case 4:
                Object obj4 = this.f27753a;
                klx klxVar = (klx) obj;
                ((nbe) ((nbe) hpg.f28767a.m17252c()).mo17276G((char) 3831)).mo17290o("stopRecording() stop camcorder");
                hpg hpgVar2 = (hpg) obj4;
                hpgVar2.f28799af.m13651b();
                klxVar.getClass();
                klxVar.close();
                hpgVar2.f28827t.m10552c();
                return null;
            case 5:
                Object obj5 = this.f27753a;
                hlr hlrVar = (hlr) obj;
                if (hlrVar != null) {
                    ((hth) obj5).mo10743k(hlrVar.f28275a, hlrVar.f28276b.f35503e);
                }
                return true;
            case 6:
                List list3 = (List) obj;
                boolean z = this.f27753a.mo6184l(did.f11414Y) && list3 != null && list3.get(0) != gdb.OFF && ((Integer) list3.get(2)).intValue() == 1;
                ikw ikwVar = (ikw) list3.get(1);
                return new gly(z, ikwVar.equals(ikw.PHOTO) || ikwVar.equals(ikw.PORTRAIT) || ikwVar.equals(ikw.MOTION_BLUR) || ikwVar.equals(ikw.LONG_EXPOSURE));
            case 7:
                Object obj6 = this.f27753a;
                List list4 = (List) obj;
                if (list4 != null && !list4.isEmpty()) {
                    jlk jlkVar = (jlk) obj6;
                    jlkVar.f34307b.set((nup) ((mrn) list4.get(list4.size() - 1)).f41479a);
                    jlkVar.f34308c.addAndGet(list4.size());
                    synchronized (jlkVar.f34306a) {
                        ((jlk) obj6).f34306a.addAll(list4);
                        break;
                    }
                }
                return null;
            case 8:
                return Boolean.valueOf(((Comparable) obj).compareTo(this.f27753a) >= 0);
            case 9:
                Object obj7 = this.f27753a;
                obj.getClass();
                Object objMo3609b = ((jxd) obj7).mo3609b(obj);
                if (objMo3609b != null) {
                    return objMo3609b;
                }
                throw new NullPointerException("Transforming input value: " + obj.toString() + " resulted in a null output value for: " + obj7.getClass().getName());
            case 10:
                return kkx.m14472e(this.f27753a, (kle) obj);
            case 11:
                return kks.m14455e(this.f27753a, (kle) obj);
            case 12:
                Object obj8 = this.f27753a;
                List<klc> list5 = (List) obj;
                mxi mxiVarM17132D = mxk.m17132D();
                kgr kgrVar = (kgr) obj8;
                for (kho khoVar : kgrVar.f35949c) {
                    djm djmVar = kgrVar.f35950d;
                    mxi mxiVarM17132D2 = mxk.m17132D();
                    for (klc klcVar : list5) {
                        if (khoVar.f36067c.contains(klcVar.mo14461d())) {
                            mxiVarM17132D2.mo17072d(klcVar);
                        }
                    }
                    mxiVarM17132D.mo17072d(khq.m14274p((khb) djmVar.f11787a, khoVar, mxiVarM17132D2.mo17127f()));
                }
                return mxiVarM17132D.mo17127f();
            case 13:
                return new knw((AmbientDelegate) this.f27753a, (knt) obj, null, null);
            case 14:
                return Long.valueOf(Math.min(((Long) obj).longValue(), ((knv) this.f27753a).f36654b));
            case 15:
                return this.f27753a;
            case 16:
                return this.f27753a;
            case 17:
                Object obj9 = this.f27753a;
                ((MediaCodec) obj).setInputSurface((Surface) obj9);
                return obj9;
            case 18:
                Object obj10 = this.f27753a;
                MediaFormat mediaFormat = (MediaFormat) obj;
                if (mediaFormat != null) {
                    MediaFormat mediaFormat2 = (MediaFormat) obj10;
                    kua.m14878q("oo.muxer.drop_initial_non_keyframes", mediaFormat2, mediaFormat);
                    kua.m14878q("oo.muxer.force_sequential", mediaFormat2, mediaFormat);
                }
                return mediaFormat;
            case 19:
                return lhi.m15341h((nwr) this.f27753a, (nwr) obj);
            default:
                try {
                    return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
                } catch (IOException e) {
                    ((ljk) this.f27753a).f38394c = true;
                    return null;
                }
        }
    }
}
