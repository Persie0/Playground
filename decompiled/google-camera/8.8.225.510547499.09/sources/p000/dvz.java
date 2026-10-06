package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.TrafficStats;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionThumbnailView;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedAppSwitchPreference;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p021j$.util.StringJoiner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dvz implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12696b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12697c;

    public /* synthetic */ dvz(WindowManager windowManager, Context context, int i) {
        this.f12697c = i;
        this.f12695a = windowManager;
        this.f12696b = context;
    }

    public /* synthetic */ dvz(coe coeVar, mxk mxkVar, int i) {
        this.f12697c = i;
        this.f12696b = coeVar;
        this.f12695a = mxkVar;
    }

    public /* synthetic */ dvz(dwc dwcVar, chp chpVar, int i) {
        this.f12697c = i;
        this.f12695a = dwcVar;
        this.f12696b = chpVar;
    }

    public /* synthetic */ dvz(foe foeVar, fol folVar, int i) {
        this.f12697c = i;
        this.f12696b = foeVar;
        this.f12695a = folVar;
    }

    public /* synthetic */ dvz(fyf fyfVar, List list, int i) {
        this.f12697c = i;
        this.f12696b = fyfVar;
        this.f12695a = list;
    }

    public /* synthetic */ dvz(hgs hgsVar, PreferenceScreen preferenceScreen, int i) {
        this.f12697c = i;
        this.f12695a = hgsVar;
        this.f12696b = preferenceScreen;
    }

    public /* synthetic */ dvz(hgx hgxVar, android.preference.PreferenceScreen preferenceScreen, int i) {
        this.f12697c = i;
        this.f12695a = hgxVar;
        this.f12696b = preferenceScreen;
    }

    public /* synthetic */ dvz(ixs ixsVar, AbstractC0812ly abstractC0812ly, int i) {
        this.f12697c = i;
        this.f12695a = ixsVar;
        this.f12696b = abstractC0812ly;
    }

    public /* synthetic */ dvz(String str, int i) {
        this.f12697c = i;
        this.f12696b = str;
        this.f12695a = "";
    }

    public /* synthetic */ dvz(String str, String str2, int i) {
        this.f12697c = i;
        this.f12696b = str;
        this.f12695a = str2;
    }

    public /* synthetic */ dvz(String str, List list, int i) {
        this.f12697c = i;
        this.f12696b = str;
        this.f12695a = list;
    }

    public /* synthetic */ dvz(List list, glk glkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12697c = i;
        this.f12695a = list;
        this.f12696b = glkVar;
    }

    public /* synthetic */ dvz(lor lorVar, pat patVar, int i) {
        this.f12697c = i;
        this.f12696b = lorVar;
        this.f12695a = patVar;
    }

    public /* synthetic */ dvz(mrm mrmVar, mrm mrmVar2, int i) {
        this.f12697c = i;
        this.f12696b = mrmVar;
        this.f12695a = mrmVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.WindowManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v1, types: [chp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [gre, java.lang.Object] */
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
        kgi kgiVarM14196a;
        int i;
        int i2 = 4;
        kpw kpwVar = null;
        switch (this.f12697c) {
            case 0:
                Object obj2 = this.f12695a;
                ?? r1 = this.f12696b;
                Bitmap bitmap = (Bitmap) obj;
                nqf nqfVarM17621g = nqf.m17621g();
                dwc dwcVar = (dwc) obj2;
                dwcVar.f12706d.setVisibility(0);
                FilmstripTransitionLayout filmstripTransitionLayout = dwcVar.f12706d;
                filmstripTransitionLayout.f6667f = dwcVar.f12707e;
                filmstripTransitionLayout.f6668g = false;
                dwa dwaVar = new dwa(dwcVar, nqfVarM17621g, r1);
                FilmstripTransitionThumbnailView filmstripTransitionThumbnailView = filmstripTransitionLayout.f6666e;
                synchronized (filmstripTransitionThumbnailView.f6672a) {
                    filmstripTransitionThumbnailView.f6673b = bitmap;
                    filmstripTransitionThumbnailView.setLayoutParams(new FrameLayout.LayoutParams(filmstripTransitionThumbnailView.f6673b.getWidth(), filmstripTransitionThumbnailView.f6673b.getHeight()));
                    filmstripTransitionThumbnailView.requestLayout();
                    Paint paint = new Paint(1);
                    paint.setShader(new BitmapShader(filmstripTransitionThumbnailView.f6673b, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                    filmstripTransitionThumbnailView.f6674c = new Paint(paint);
                    break;
                }
                if (filmstripTransitionLayout.f6662a.isRunning()) {
                    filmstripTransitionLayout.f6669h = filmstripTransitionLayout.m4121a().m6808a();
                }
                filmstripTransitionLayout.f6670i = dwaVar;
                filmstripTransitionLayout.f6669h = filmstripTransitionLayout.m4121a().m6808a();
                float fM6806b = filmstripTransitionLayout.f6669h.m6806b(1.0f);
                filmstripTransitionLayout.f6666e.setScaleX(fM6806b);
                filmstripTransitionLayout.f6666e.setScaleY(fM6806b);
                PointF pointFM6807c = filmstripTransitionLayout.f6669h.m6807c(1.0f);
                filmstripTransitionLayout.f6666e.setTranslationX(pointFM6807c.x);
                filmstripTransitionLayout.f6666e.setTranslationY(pointFM6807c.y);
                filmstripTransitionLayout.f6666e.m4125b(filmstripTransitionLayout.f6669h.m6805a(1.0f));
                filmstripTransitionLayout.m4122b(dwf.m6804d(1.0f));
                filmstripTransitionLayout.f6662a.start();
                return nqfVarM17621g;
            case 1:
                Object obj3 = this.f12696b;
                Object obj4 = this.f12695a;
                djm djmVar = (djm) obj;
                nba it = ((coe) obj3).f6428b.f6376h.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    mxk mxkVar = (mxk) obj4;
                    if (!mxkVar.isEmpty()) {
                        StringJoiner stringJoiner = new StringJoiner(",", "(", TVkaNXnfP.ZHbPjI);
                        String[] strArr = new String[mxkVar.size()];
                        naz nazVarListIterator = mxkVar.listIterator();
                        int i3 = 0;
                        while (nazVarListIterator.hasNext()) {
                            Long l = (Long) nazVarListIterator.next();
                            stringJoiner.add("?");
                            strArr[i3] = String.valueOf(l);
                            i3++;
                        }
                        ((SQLiteDatabase) djmVar.f11789c).delete(str, String.format("%s IN %s", "media_id", stringJoiner), strArr);
                    }
                }
                return null;
            case 2:
                Object obj5 = this.f12696b;
                Object obj6 = this.f12695a;
                ihw ihwVar = (ihw) obj;
                foe foeVar = (foe) obj5;
                foh fohVar = foeVar.f22919d;
                fohVar.f22937g = ihwVar;
                fohVar.f22939i = new jvb();
                if (((Boolean) fohVar.f22932b.mo3831be()).booleanValue()) {
                    kgh kghVarM14208a = kgi.m14208a();
                    kghVarM14208a.m14206k(kgj.f35913a);
                    fol folVar = (fol) obj6;
                    kghVarM14208a.m14197b(folVar.f22946a);
                    kghVarM14208a.m14204i(folVar.f22947b);
                    kghVarM14208a.m14203h(34);
                    kghVarM14208a.m14198c(7);
                    kghVarM14208a.m14207l(256L);
                    kgiVarM14196a = kghVarM14208a.m14196a();
                } else {
                    kgh kghVarM14208a2 = kgi.m14208a();
                    kghVarM14208a2.m14206k(kgj.SURFACE_VIEW);
                    fol folVar2 = (fol) obj6;
                    kghVarM14208a2.m14197b(folVar2.f22946a);
                    kghVarM14208a2.m14204i(folVar2.f22947b);
                    ihwVar.getClass();
                    kghVarM14208a2.m14205j(ihwVar.f31016a);
                    kgiVarM14196a = kghVarM14208a2.m14196a();
                }
                kfm kfmVarM14151a = kfn.m14151a();
                kfmVarM14151a.m14145f(((fol) obj6).f22946a);
                kfmVarM14151a.m14143d(kgiVarM14196a);
                fohVar.f22935e = fohVar.f22940j.mo14178a(kfmVarM14151a.m14140a());
                fohVar.f22939i.m13537d(fohVar.f22935e);
                kfk kfkVar = fohVar.f22935e;
                kfkVar.getClass();
                fohVar.f22936f = kfkVar.mo14116c().mo14137b(kgiVarM14196a);
                foh fohVar2 = foeVar.f22919d;
                kfk kfkVar2 = fohVar2.f22935e;
                kfkVar2.getClass();
                kgg kggVar = fohVar2.f22936f;
                kggVar.getClass();
                ihw ihwVar2 = fohVar2.f22937g;
                ihwVar2.getClass();
                mrm mrmVar = fohVar2.f22933c.f22957e;
                if (mrmVar.mo16813g()) {
                    ((ipp) mrmVar.mo16809c()).mo11592c(ihwVar2.f31016a, ihwVar2.f31017b, ihwVar2.f31018c);
                }
                fohVar2.f22938h = kfkVar2.mo14131r(kfkVar2.mo14132s(kggVar), 1);
                fohVar2.f22939i.m13537d(fohVar2.f22938h);
                if (mrmVar.mo16813g()) {
                    ((ipp) mrmVar.mo16809c()).mo11590a(fohVar2.f22938h, kggVar);
                }
                final nqf nqfVarM17621g2 = nqf.m17621g();
                fohVar2.f22939i.m13537d(new kba() { // from class: fof
                    @Override // p000.kba, java.lang.AutoCloseable
                    public final void close() {
                        nqf nqfVar = nqfVarM17621g2;
                        if (nqfVar.isDone()) {
                            return;
                        }
                        nqfVar.mo8566a(new kec("FrameServer is already closed."));
                    }
                });
                fohVar2.f22934d.set(false);
                kfc kfcVar = fohVar2.f22938h;
                kfcVar.getClass();
                kfcVar.mo9411k(new fog(fohVar2, nqfVarM17621g2));
                return (Boolean) kxk.m14974T(nod.m17553i(nqfVarM17621g2, fod.f22896a, not.INSTANCE));
            case 3:
                Object obj7 = this.f12696b;
                ?? r2 = this.f12695a;
                Integer num = (Integer) obj;
                lku.m15620O(num.intValue(), r2.size());
                for (int i4 = 0; i4 < r2.size(); i4++) {
                    if (i4 == num.intValue()) {
                        kpwVar = (kpw) r2.get(i4);
                    } else {
                        ((fxn) r2.get(i4)).close();
                    }
                }
                kpwVar.getClass();
                fyf fyfVar = (fyf) obj7;
                bkn bknVar = fyfVar.f23886e.f23898j;
                gyh gyhVar = fyfVar.f23882a;
                kay kayVar = fyfVar.f23885d;
                kayVar.getClass();
                nqf nqfVarM17621g3 = nqf.m17621g();
                nqf nqfVarM17621g4 = nqf.m17621g();
                nps npsVarM14964J = kxk.m14964J(new IllegalStateException("Thumbnail generation should not require metadata"));
                fzv fzvVar = new fzv(kpwVar);
                Rect rect = new Rect(0, 0, kpwVar.mo7247c(), kpwVar.mo7246b());
                grl grlVarM9671a = grm.m9671a(fzvVar);
                grlVarM9671a.f26145c = kayVar;
                grlVarM9671a.f26146d = npsVarM14964J;
                grlVarM9671a.f26147e = rect;
                grm grmVarM9669a = grlVarM9671a.m9669a();
                npu npuVarM15033z = kxk.m15033z();
                mxk mxkVarM17138J = mxk.m17138J(grd.CLOSE_ON_ALL_TASKS_RELEASE, grd.CREATE_EARLY_FILMSTRIP_PREVIEW, grd.CONVERT_TO_RGB_PREVIEW);
                fyz fyzVar = new fyz();
                fyzVar.f23951c = new fyx(nqfVarM17621g3, kayVar, nqfVarM17621g4);
                try {
                    bknVar.f3651a.mo9664d(grmVarM9669a, npuVarM15033z, mxkVarM17138J, gyhVar, fyzVar.f23952d);
                    return new gtd(nqfVarM17621g3, nqfVarM17621g4);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            case 4:
                ?? r0 = this.f12695a;
                mrm mrmVarMo9908n = ((glk) this.f12696b).f25502c.mo9908n();
                if (((eqz) ((AmbientModeSupport.AmbientController) obj).f1702a.mo3831be()).equals(eqz.ACTION) && mrmVarMo9908n.mo16813g()) {
                    long jM10428c = ((hkz) mrmVarMo9908n.mo16809c()).m10428c();
                    long j = Long.MAX_VALUE;
                    i = -1;
                    for (int i5 = 0; i5 < ((mzr) r0).f41859c; i5++) {
                        kfd kfdVarMo7041b = ((key) r0.get(i5)).mo7041b();
                        if (kfdVarMo7041b != null) {
                            long jAbs = Math.abs(jM10428c - kfdVarMo7041b.f35811b);
                            if (jAbs < j) {
                                i = i5;
                                j = jAbs;
                            }
                        }
                    }
                } else {
                    i = -1;
                }
                if (i >= 0) {
                    return Integer.valueOf(i);
                }
                return -1;
            case 5:
                Object obj8 = this.f12696b;
                Object obj9 = this.f12695a;
                ihw ihwVar3 = (ihw) obj;
                if (!ihwVar3.f31016a.isValid()) {
                    return false;
                }
                mrm mrmVar2 = (mrm) obj8;
                if (mrmVar2.mo16813g()) {
                    ((ipp) mrmVar2.mo16809c()).mo11592c(ihwVar3.f31016a, ihwVar3.f31017b, ihwVar3.f31018c);
                } else {
                    ((kgg) ((mrm) obj9).mo16809c()).mo14194d(ihwVar3.f31016a);
                }
                return true;
            case 6:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ilk.m11426b(this.f12695a.getDefaultDisplay(), (Context) this.f12696b) == ilk.LANDSCAPE);
            case 7:
                Object obj10 = this.f12695a;
                Object obj11 = this.f12696b;
                ArrayList<mrn> arrayList = (ArrayList) obj;
                hgs hgsVar = (hgs) obj10;
                mwx mwxVarMo10264a = hgsVar.f27735f.mo10264a();
                for (mrn mrnVar : arrayList) {
                    hgt hgtVar = (hgt) mwxVarMo10264a.get(((ResolveInfo) mrnVar.f41479a).activityInfo.packageName);
                    hgtVar.getClass();
                    MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference = new MaterialManagedAppSwitchPreference(hgsVar.f27730a);
                    String string = ((ResolveInfo) mrnVar.f41479a).activityInfo.applicationInfo.loadLabel(hgsVar.f27740k).toString();
                    CharSequence string2 = ((ResolveInfo) mrnVar.f41479a).loadLabel(hgsVar.f27740k).toString();
                    materialManagedAppSwitchPreference.mo1502T(string);
                    if (!string.equals(string2)) {
                        materialManagedAppSwitchPreference.mo1479n(string2);
                    }
                    materialManagedAppSwitchPreference.m1496N(hgtVar.m10255a());
                    materialManagedAppSwitchPreference.f1594v = Boolean.valueOf(hgsVar.f27732c.mo10046m(hgtVar.m10255a()));
                    TrafficStats.setThreadStatsTag(512);
                    box.m2827c(hgsVar.f27730a).m2863c().m2851d((Drawable) mrnVar.f41480b).mo2855h(cab.m3345a()).m2859l(new hgr(materialManagedAppSwitchPreference));
                    materialManagedAppSwitchPreference.f7132e = new ewi(hgsVar, i2);
                    ((PreferenceGroup) obj11).m1531ak(materialManagedAppSwitchPreference);
                    hgsVar.f27737h.m17082g(materialManagedAppSwitchPreference);
                    hgsVar.f27738i.put(materialManagedAppSwitchPreference.f1590r, Boolean.valueOf(hgsVar.f27732c.mo10046m(hgtVar.m10255a())));
                }
                return arrayList;
            case 8:
                Object obj12 = this.f12695a;
                Object obj13 = this.f12696b;
                ArrayList<mrn> arrayList2 = (ArrayList) obj;
                hgx hgxVar = (hgx) obj12;
                mwx mwxVarMo10264a2 = hgxVar.f27761f.mo10264a();
                for (mrn mrnVar2 : arrayList2) {
                    hgt hgtVar2 = (hgt) mwxVarMo10264a2.get(((ResolveInfo) mrnVar2.f41479a).activityInfo.packageName);
                    hgtVar2.getClass();
                    ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(hgxVar.f27756a);
                    String string3 = ((ResolveInfo) mrnVar2.f41479a).activityInfo.applicationInfo.loadLabel(hgxVar.f27766k).toString();
                    CharSequence string4 = ((ResolveInfo) mrnVar2.f41479a).loadLabel(hgxVar.f27766k).toString();
                    managedSwitchPreference.setTitle(string3);
                    if (!string3.equals(string4)) {
                        managedSwitchPreference.setSummary(string4);
                    }
                    managedSwitchPreference.setKey(hgtVar2.m10255a());
                    managedSwitchPreference.setDefaultValue(Boolean.valueOf(hgxVar.f27758c.mo10046m(hgtVar2.m10255a())));
                    managedSwitchPreference.setPersistent(true);
                    int dimensionPixelSize = hgxVar.f27756a.getResources().getDimensionPixelSize(C0100R.dimen.camera_settings_switch_button_icon_size);
                    TrafficStats.setThreadStatsTag(512);
                    ((bpn) box.m2827c(hgxVar.f27756a).m2863c().m2851d((Drawable) mrnVar2.f41480b).mo2855h(cab.m3345a()).m3315u(dimensionPixelSize, dimensionPixelSize)).m2859l(new hgw(managedSwitchPreference));
                    managedSwitchPreference.setLayoutResource(C0100R.layout.preference_with_social_app_margin);
                    managedSwitchPreference.f7110c = new ewn(hgxVar, i2);
                    ((android.preference.PreferenceScreen) obj13).addPreference(managedSwitchPreference);
                    hgxVar.f27763h.m17082g(managedSwitchPreference);
                    hgxVar.f27764i.put(managedSwitchPreference.getKey(), Boolean.valueOf(hgxVar.f27758c.mo10046m(hgtVar2.m10255a())));
                }
                hgxVar.m10263h();
                return arrayList2;
            case 9:
                return ((C0789lb) this.f12695a).mo11872c((AbstractC0812ly) this.f12696b, (View) obj);
            case 10:
                Object obj14 = this.f12696b;
                djm djmVar2 = (djm) obj;
                for (nwr nwrVar : this.f12695a) {
                    ContentValues contentValues = new ContentValues();
                    Object obj15 = djmVar2.f11788b;
                    contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("collection_name", (String) obj14);
                    contentValues.put("selection_key", Integer.valueOf(((Random) djmVar2.f11789c).nextInt(2147483646) + 1));
                    contentValues.put("value", nwrVar.m17804A());
                    ((SQLiteDatabase) djmVar2.f11787a).insertWithOnConflict("collections", null, contentValues, 5);
                    int i6 = jln.f34318e;
                }
                long jQueryNumEntries = DatabaseUtils.queryNumEntries((SQLiteDatabase) djmVar2.f11787a, "collections") - 10000;
                if (jQueryNumEntries > 0) {
                    ((SQLiteDatabase) djmVar2.f11787a).delete("collections", "id IN (SELECT id FROM collections ORDER BY id ASC LIMIT " + jQueryNumEntries + PMZiHihxLGEy.WLPUCtJmKZd, new String[0]);
                    int i7 = jln.f34318e;
                }
                return null;
            case 11:
                Object obj16 = this.f12696b;
                Object obj17 = this.f12695a;
                loe loeVar = (loe) obj;
                nxl nxlVar = (nxl) loeVar.m18143ad(5);
                nxlVar.m18108s(loeVar);
                nxn nxnVar = (nxn) nxlVar;
                if (!nxnVar.f44974b.m18142ac()) {
                    nxnVar.mo18106p();
                }
                loe loeVar2 = (loe) nxnVar.f44974b;
                loe loeVar3 = loe.f38797c;
                obj17.getClass();
                loeVar2.f38800b = (pat) obj17;
                loeVar2.f38799a |= 1;
                loe loeVar4 = (loe) nxnVar.mo18103l();
                lor lorVar = (lor) obj16;
                String[] strArr2 = {lorVar.f38841b.getClass().getName()};
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(lorVar.f38840a, (Class<?>) LifeboatReceiver.class));
                intent.setPackage(lorVar.f38840a.getPackageName());
                intent.putExtra("Transmitters", strArr2);
                intent.putExtra("MetricSnapshot", loeVar4.mo17760J());
                lorVar.f38840a.sendBroadcast(intent);
                return null;
            case 12:
                Object obj18 = this.f12696b;
                Object obj19 = this.f12695a;
                lqg lqgVar = (lqg) obj;
                lpw lpwVar = lqp.f38996a;
                lqe lqeVar = lqe.f38950d;
                nyr nyrVar = lqgVar.f38958a;
                if (nyrVar.containsKey(obj18)) {
                    lqeVar = (lqe) nyrVar.get(obj18);
                }
                nxl nxlVar2 = (nxl) lqeVar.m18143ad(5);
                nxlVar2.m18108s(lqeVar);
                if (!Collections.unmodifiableList(((lqe) nxlVar2.f44974b).f38953b).contains(obj19)) {
                    nxlVar2.m18111v((String) obj19);
                }
                nxl nxlVar3 = (nxl) lqgVar.m18143ad(5);
                nxlVar3.m18108s(lqgVar);
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                lqe lqeVar2 = (lqe) nxlVar2.f44974b;
                lqeVar2.f38952a |= 1;
                lqeVar2.f38954c = (String) obj19;
                nxlVar3.m18112w((String) obj18, (lqe) nxlVar2.mo18103l());
                return (lqg) nxlVar3.mo18103l();
            default:
                return ((String) this.f12696b) + ((String) obj) + ((String) this.f12695a);
        }
    }
}
