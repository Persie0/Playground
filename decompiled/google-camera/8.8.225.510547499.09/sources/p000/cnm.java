package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;
import p021j$.util.Comparator$CC;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cnm implements nol {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6354a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6355b;

    public /* synthetic */ cnm(cit citVar, int i) {
        this.f6355b = i;
        this.f6354a = citVar;
    }

    public /* synthetic */ cnm(cnr cnrVar, int i) {
        this.f6355b = i;
        this.f6354a = cnrVar;
    }

    public /* synthetic */ cnm(fcc fccVar, int i) {
        this.f6355b = i;
        this.f6354a = fccVar;
    }

    public /* synthetic */ cnm(ggn ggnVar, int i) {
        this.f6355b = i;
        this.f6354a = ggnVar;
    }

    public /* synthetic */ cnm(hgs hgsVar, int i) {
        this.f6355b = i;
        this.f6354a = hgsVar;
    }

    public /* synthetic */ cnm(hgx hgxVar, int i) {
        this.f6355b = i;
        this.f6354a = hgxVar;
    }

    public /* synthetic */ cnm(jzu jzuVar, int i) {
        this.f6355b = i;
        this.f6354a = jzuVar;
    }

    public /* synthetic */ cnm(ljs ljsVar, int i) {
        this.f6355b = i;
        this.f6354a = ljsVar;
    }

    public /* synthetic */ cnm(lkb lkbVar, int i) {
        this.f6355b = i;
        this.f6354a = lkbVar;
    }

    public /* synthetic */ cnm(llz llzVar, int i) {
        this.f6355b = i;
        this.f6354a = llzVar;
    }

    public /* synthetic */ cnm(ltn ltnVar, int i) {
        this.f6355b = i;
        this.f6354a = ltnVar;
    }

    public /* synthetic */ cnm(nps npsVar, int i) {
        this.f6355b = i;
        this.f6354a = npsVar;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0392 A[PHI: r3 r4
      0x0392: PHI (r3v24 java.lang.String) = (r3v67 java.lang.String), (r3v29 java.lang.String) binds: [B:130:0x0390, B:123:0x036e] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r4v21 android.database.Cursor) = (r4v20 android.database.Cursor), (r4v22 android.database.Cursor) binds: [B:130:0x0390, B:123:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x03a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kbz] */
    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() throws Throwable {
        nps npsVarM14964J;
        Cursor cursorQuery;
        int i = 17;
        int i2 = 8;
        int i3 = 16;
        switch (this.f6355b) {
            case 0:
                SQLiteDatabase readableDatabase = ((cnr) this.f6354a).f6370b.getReadableDatabase();
                try {
                    Cursor cursorQuery2 = readableDatabase.query(true, "media_record", new String[]{"source_id"}, null, null, null, null, null, null);
                    try {
                        cursorQuery2.getCount();
                        mxi mxiVarM17132D = mxk.m17132D();
                        while (cursorQuery2.moveToNext()) {
                            mxiVarM17132D.mo17072d(cursorQuery2.getString(cursorQuery2.getColumnIndex("source_id")));
                        }
                        nps npsVarM14965K = kxk.m14965K(mxiVarM17132D.mo17127f());
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return npsVarM14965K;
                    } catch (Throwable th) {
                        if (cursorQuery2 == null) {
                            throw th;
                        }
                        try {
                            cursorQuery2.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    if (readableDatabase == null) {
                        throw th3;
                    }
                    try {
                        readableDatabase.close();
                        throw th3;
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        throw th3;
                    }
                }
            case 1:
                ?? r2 = this.f6354a;
                try {
                    try {
                        ((cit) r2).f5893c.mo13961e("bindPhotosService");
                        jra jraVar = new jra(1);
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
                        ((cit) r2).f5892b.bindService(intent, jraVar, 5);
                        npsVarM14964J = kxk.m14965K(jraVar);
                        r2 = ((cit) r2).f5893c;
                    } catch (SecurityException e) {
                        ((nbe) ((nbe) ((nbe) cit.f5891a.m17252c()).mo17283h(e)).mo17276G(197)).mo17290o("Either Photos service does not exist or does not have permission to connect.");
                        npsVarM14964J = kxk.m14964J(e);
                        r2 = ((cit) r2).f5893c;
                    }
                    r2.mo13962f();
                    return npsVarM14964J;
                } catch (Throwable th5) {
                    ((cit) r2).f5893c.mo13962f();
                    throw th5;
                }
            case 2:
                fcc fccVar = (fcc) this.f6354a;
                fccVar.f21230d.mo13961e("Location#isLocationEnabled");
                fbz fbyVar = null;
                string = null;
                string = null;
                fbyVar = null;
                string = null;
                String string = null;
                Cursor cursor = null;
                if ((fccVar.f21227a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || fccVar.f21227a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) && ((Boolean) fccVar.f21228b.mo10031c(gzy.f27043b)).booleanValue()) {
                    fccVar.f21230d.mo13961e("connectLocationProvider");
                    if (jcy.f33766a.m12902f(fccVar.f21227a, 0) == 0) {
                        Context context = fccVar.f21227a;
                        nbh nbhVar = fbw.f21205a;
                        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
                            try {
                                cursorQuery = context.getContentResolver().query(fbw.f21208d, new String[]{"value"}, "name=?", new String[]{"use_location_for_services"}, null);
                                if (cursorQuery != null) {
                                    try {
                                        if (cursorQuery.moveToNext()) {
                                            string = cursorQuery.getString(0);
                                        }
                                        break;
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        try {
                                            ((nbe) ((nbe) ((nbe) fbw.f21205a.m17252c()).mo17283h(e)).mo17276G(2070)).mo17290o("Failed to get 'Use My Location' setting");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                cursorQuery = null;
                            } catch (Throwable th8) {
                                th = th8;
                            }
                            if (string != null) {
                                try {
                                    if (Integer.parseInt(string) == 1) {
                                    }
                                } catch (NumberFormatException e4) {
                                }
                            }
                            fbyVar = new fby(fccVar.f21229c);
                        }
                        fbyVar = new fbw(fccVar.f21227a, fccVar.f21231e);
                    } else {
                        fbyVar = new fby(fccVar.f21229c);
                    }
                    fbyVar.mo8113c(true);
                    fccVar.f21230d.mo13962f();
                }
                nps npsVarM14965K2 = kxk.m14965K(fbyVar);
                fccVar.f21230d.mo13962f();
                return npsVarM14965K2;
            case 3:
                ggn ggnVar = (ggn) this.f6354a;
                ggnVar.f24677a.mo13960d("orientation#enable", new fzz(ggnVar.f24678b, i3));
                return kxk.m14965K(Boolean.TRUE);
            case 4:
                hgs hgsVar = (hgs) this.f6354a;
                List listMo10266c = hgsVar.f27735f.mo10266c("image/*");
                List listMo10266c2 = hgsVar.f27735f.mo10266c("video/*");
                mwn mwnVarM17090e = mws.m17090e();
                mwnVarM17090e.m17083h(listMo10266c);
                mwnVarM17090e.m17083h(listMo10266c2);
                return kxk.m14965K(mws.m17095j((ArrayList) Collection$EL.stream(mwnVarM17090e.m17081f()).filter(new gek(new ConcurrentHashMap(), hgq.f27709c, i2)).map(new cwp(hgsVar, i3)).sorted(Comparator$CC.comparing(hgq.f27710d)).map(hgq.f27707a).collect(Collectors.toCollection(drv.f12451e))));
            case 5:
                hgx hgxVar = (hgx) this.f6354a;
                List listMo10266c3 = hgxVar.f27761f.mo10266c("image/*");
                List listMo10266c4 = hgxVar.f27761f.mo10266c("video/*");
                mwn mwnVarM17090e2 = mws.m17090e();
                mwnVarM17090e2.m17083h(listMo10266c3);
                mwnVarM17090e2.m17083h(listMo10266c4);
                return kxk.m14965K(mws.m17095j((ArrayList) Collection$EL.stream(mwnVarM17090e2.m17081f()).filter(new gek(new ConcurrentHashMap(), hgq.f27713g, 9)).map(new cwp(hgxVar, i)).sorted(Comparator$CC.comparing(hgq.f27711e)).map(hgq.f27712f).collect(Collectors.toCollection(drv.f12452f))));
            case 6:
                Object obj = this.f6354a;
                jzu jzuVar = (jzu) obj;
                synchronized (jzuVar.f35389a) {
                    ((jzu) obj).f35400l = 2;
                    break;
                }
                jzh jzhVar = jzuVar.f35391c;
                if (!jzhVar.f35283e) {
                    boolean z = jzhVar.f35284f;
                    synchronized (jzhVar.f35281c) {
                        jzhVar.f35287i = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                        jzhVar.m13794c();
                        break;
                    }
                }
                return npp.f44031a;
            case 7:
                Object obj2 = this.f6354a;
                jzu jzuVar2 = (jzu) obj2;
                jzuVar2.f35390b.mo13728i();
                jyt jytVar = jzuVar2.f35395g;
                if (jytVar != null) {
                    jzuVar2.f35390b.mo13726g(jytVar);
                }
                jyw jywVar = jzuVar2.f35392d;
                if (jywVar != null) {
                    jywVar.close();
                }
                jza jzaVar = jzuVar2.f35393e;
                if (jzaVar != null) {
                    jzaVar.close();
                }
                for (jyr jyrVar : jzuVar2.f35394f.values()) {
                    jyrVar.mo5577c();
                    jyrVar.close();
                }
                jzuVar2.f35390b.close();
                synchronized (jzuVar2.f35389a) {
                    ((jzu) obj2).f35400l = 4;
                    break;
                }
                return npp.f44031a;
            case 8:
                ljs ljsVar = (ljs) this.f6354a;
                Object objMo6051a = ljsVar.f38420a.mo6051a();
                Object objMo6051a2 = ljsVar.f38421b.mo6051a();
                mrm mrmVar = (mrm) objMo6051a;
                if (mrmVar.mo16813g()) {
                    mrm mrmVar2 = (mrm) objMo6051a2;
                    if (mrmVar2.mo16813g()) {
                        ljr ljrVar = new ljr((File) mrmVar.mo16809c(), (String) mrmVar2.mo16809c());
                        int iM15544a = ljrVar.m15544a();
                        ljrVar.m15545b().delete();
                        ljrVar.f38416c = 0;
                        ljrVar.f38417d = true;
                        if (iM15544a < ((lju) ljsVar.f38423d.get()).f38434b) {
                            return npp.f44031a;
                        }
                        mbl mblVar = ljsVar.f38426g;
                        lja ljaVarM15522a = ljb.m15522a();
                        nxl nxlVarM18137O = pat.f47274u.m18137O();
                        nxl nxlVarM18137O2 = par.f47262d.m18137O();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        par parVar = (par) nxlVarM18137O2.f44974b;
                        parVar.f47265b = 6;
                        parVar.f47264a |= 1;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        pat patVar = (pat) nxlVarM18137O.f44974b;
                        par parVar2 = (par) nxlVarM18137O2.mo18103l();
                        parVar2.getClass();
                        patVar.f47292q = parVar2;
                        patVar.f47276a |= 33554432;
                        ljaVarM15522a.m15515e((pat) nxlVarM18137O.mo18103l());
                        return mblVar.m16298b(ljaVarM15522a.m15511a());
                    }
                }
                return npp.f44031a;
            case 9:
                lkb lkbVar = (lkb) this.f6354a;
                lju ljuVar = (lju) lkbVar.f38455g.get();
                return (!ljuVar.f38433a || lkbVar.f38453e.getAndSet(true)) ? npp.f44031a : lkbVar.m15554h(6, (ljq) lkbVar.f38451c.get(), ljuVar.f38437e);
            case 10:
                lkb lkbVar2 = (lkb) this.f6354a;
                if (((lju) lkbVar2.f38455g.get()).f38433a) {
                    ljs ljsVar2 = lkbVar2.f38456h;
                    if (ljsVar2.f38424e.getAndSet(false)) {
                        kxk.m14970P(new cnm(ljsVar2, i2), ljsVar2.f38422c);
                    } else {
                        nps npsVar = npp.f44031a;
                    }
                }
                return npp.f44031a;
            case 11:
                return ((llz) this.f6354a).m15714a();
            case 12:
                ltn ltnVar = (ltn) this.f6354a;
                return kxk.m14966L(nod.m17554j(ltnVar.f39179b, mov.m16716b(new cnc(ltnVar, i3)), ltnVar.f39180c));
            case 13:
                Object obj3 = this.f6354a;
                ltn ltnVar2 = (ltn) obj3;
                try {
                    return kxk.m14965K(((ltn) obj3).m15974b((Uri) kxk.m14973S(ltnVar2.f39179b)));
                } catch (IOException e5) {
                    return ((e5 instanceof lsi) || (e5.getCause() instanceof lsi)) ? kxk.m14964J(e5) : nod.m17554j(ltnVar2.f39181d.mo15962a(e5, new lhz(ltnVar2)), mov.m16716b(new cnc(ltnVar2, i)), ltnVar2.f39180c);
                }
            default:
                return this.f6354a;
        }
    }
}
