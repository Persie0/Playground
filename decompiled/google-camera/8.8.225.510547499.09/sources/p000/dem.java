package p000;

import android.graphics.Point;
import android.graphics.RectF;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dem extends met {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ den f10658a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dem(den denVar, meu meuVar) {
        super(meuVar);
        this.f10658a = denVar;
    }

    @Override // p000.met
    /* JADX INFO: renamed from: a */
    public final void mo6005a(long j) {
        this.f10658a.f10662c.mo5993c(j);
    }

    @Override // p000.met
    /* JADX INFO: renamed from: b */
    public final void mo6006b(final mew mewVar) {
        final dff dffVar = this.f10658a.f10661b;
        dffVar.f10768d.execute(new Runnable() { // from class: dfd
            /* JADX WARN: Code duplicated, block: B:104:0x0307  */
            /* JADX WARN: Code duplicated, block: B:69:0x0227  */
            @Override // java.lang.Runnable
            public final void run() {
                mws mwsVarM17095j;
                mws mwsVarM17097l;
                mfq mfqVar;
                Float f;
                boolean z;
                Iterator it;
                mrm mrmVarM16829i;
                dff dffVar2 = dffVar;
                mew mewVar2 = mewVar;
                der derVarM6021a = des.m6021a();
                derVarM6021a.m6020c(SystemClock.elapsedRealtimeNanos());
                ArrayList arrayList = new ArrayList();
                int i = 4;
                if ((mewVar2.f40256a & 2) == 0) {
                    int i2 = mws.f41739d;
                    mwsVarM17095j = mzr.f41857a;
                } else {
                    mfg mfgVar = mewVar2.f40257b;
                    if (mfgVar == null) {
                        mfgVar = mfg.f40322b;
                    }
                    if (mfgVar.f40324a.size() == 0) {
                        int i3 = mws.f41739d;
                        mwsVarM17095j = mzr.f41857a;
                    } else {
                        mfg mfgVar2 = mewVar2.f40257b;
                        if (mfgVar2 == null) {
                            mfgVar2 = mfg.f40322b;
                        }
                        mfgVar2.f40324a.size();
                        if (dffVar2.f10773i.compareAndSet(false, true)) {
                            Process.setThreadPriority(-1);
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            dffVar2.f10772h.mo13961e("camera_vkp_fetch_repeated");
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            mfg mfgVar3 = mewVar2.f40257b;
                            if (mfgVar3 == null) {
                                mfgVar3 = mfg.f40322b;
                            }
                            Iterator it2 = mfgVar3.f40324a.iterator();
                            while (it2.hasNext()) {
                                mfe mfeVar = (mfe) it2.next();
                                if ((mfeVar.f40313a & 2) != 0) {
                                    deb debVar = (deb) dffVar2.f10774j.get(mfeVar.f40315c);
                                    if (debVar == null) {
                                        arrayList2.add(mfeVar);
                                    } else {
                                        dea deaVar = new dea(debVar);
                                        deaVar.m5973g(SystemClock.elapsedRealtime());
                                        det detVar = dffVar2.f10766b;
                                        if (mfeVar.f40316d.size() != i) {
                                            mrmVarM16829i = mqu.f41450a;
                                            it = it2;
                                        } else {
                                            Iterator it3 = mfeVar.f40316d.iterator();
                                            float fMin = Float.MAX_VALUE;
                                            float fMin2 = Float.MAX_VALUE;
                                            float fMax = Float.MIN_VALUE;
                                            float fMax2 = Float.MIN_VALUE;
                                            while (it3.hasNext()) {
                                                Iterator it4 = it3;
                                                mfd mfdVar = (mfd) it3.next();
                                                fMax = Math.max(mfdVar.f40308a, fMax);
                                                fMin2 = Math.min(mfdVar.f40308a, fMin2);
                                                fMin = Math.min(mfdVar.f40309b, fMin);
                                                fMax2 = Math.max(mfdVar.f40309b, fMax2);
                                                it2 = it2;
                                                it3 = it4;
                                            }
                                            it = it2;
                                            mrmVarM16829i = mrm.m16829i(new RectF(fMin2, fMin, fMax, fMax2));
                                        }
                                        deaVar.m5970d(dez.m6041k(mrmVarM16829i, detVar.f10747k, detVar.f10744h, detVar.f10745i));
                                        deb debVarM5967a = deaVar.m5967a();
                                        dffVar2.f10774j.put(mfeVar.f40315c, debVarM5967a);
                                        arrayList3.add(debVarM5967a);
                                        it2 = it;
                                        i = 4;
                                    }
                                } else {
                                    i = 4;
                                }
                            }
                            dffVar2.f10772h.mo13963g("camera_vkp_semantic_result_convert");
                            det detVar2 = dffVar2.f10766b;
                            ArrayList<luz> arrayList4 = new ArrayList();
                            if (!arrayList2.isEmpty() && detVar2.f10745i != 0 && detVar2.f10744h != 0) {
                                ddx ddxVar = detVar2.f10740d;
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    mfe mfeVar2 = (mfe) it5.next();
                                    int iM15030w = kxk.m15030w(mfeVar2.f40314b);
                                    if (iM15030w == 0) {
                                        iM15030w = 1;
                                    }
                                    Barcode rawValue = Barhopper.parseRawValue(mfeVar2.f40315c, 1 << (iM15030w - 2));
                                    ArrayList arrayList6 = new ArrayList();
                                    for (mfd mfdVar2 : mfeVar2.f40316d) {
                                        arrayList6.add(new Point(mfdVar2.f40308a, mfdVar2.f40309b));
                                        it5 = it5;
                                    }
                                    rawValue.cornerPoints = (Point[]) arrayList6.toArray(new Point[arrayList6.size()]);
                                    arrayList5.add(rawValue);
                                    it5 = it5;
                                }
                                arrayList4.addAll(ddxVar.m5963a((Barcode[]) arrayList5.toArray(new Barcode[arrayList5.size()]), detVar2.f10744h, detVar2.f10745i));
                            }
                            dffVar2.f10772h.mo13962f();
                            for (luz luzVar : arrayList4) {
                                mrm mrmVarM5664k = dffVar2.f10775k.m5664k(luzVar);
                                if (mrmVarM5664k.mo16813g()) {
                                    dffVar2.f10772h.mo13961e("camera_vkp_barcode_convert");
                                    deb debVarM6026a = dffVar2.f10766b.m6026a(luzVar, ((Long) mrmVarM5664k.mo16809c()).longValue());
                                    dffVar2.f10772h.mo13962f();
                                    arrayList3.add(debVarM6026a);
                                    if (luzVar.mo16041d().mo16813g()) {
                                        dffVar2.f10774j.put(((Barcode) luzVar.mo16041d().mo16809c()).rawValue, debVarM6026a);
                                    }
                                }
                            }
                            mwsVarM17095j = mws.m17095j(arrayList3);
                            dff.m6050b(z);
                        } catch (Throwable th) {
                            dff.m6050b(z);
                            throw th;
                        }
                    }
                }
                arrayList.addAll(mwsVarM17095j);
                if ((mewVar2.f40256a & 1024) != 0) {
                    meh mehVar = mewVar2.f40260e;
                    if (mehVar == null) {
                        mehVar = meh.f40172c;
                    }
                    if ((mehVar.f40174a & 2) != 0) {
                        cwd cwdVar = dffVar2.f10775k;
                        lux luxVarM16072C = luz.m16072C();
                        luxVarM16072C.f39341c = Float.valueOf(1.0f);
                        luxVarM16072C.m16071h(lus.DOCUMENT_SCANNING);
                        luxVarM16072C.f39340b = lva.m16083a(dffVar2.f10771g.getString(C0100R.string.scan_document));
                        mrm mrmVarM5664k2 = cwdVar.m5664k(luxVarM16072C.m16064a());
                        if (mrmVarM5664k2.mo16813g()) {
                            det detVar3 = dffVar2.f10766b;
                            long jLongValue = ((Long) mrmVarM5664k2.mo16809c()).longValue();
                            nuy nuyVar = mehVar.f40175b;
                            if (nuyVar == null) {
                                nuyVar = nuy.f44716b;
                            }
                            nvi nviVar = nuyVar.f44718a;
                            if (nviVar == null) {
                                nviVar = nvi.f44746b;
                            }
                            int size = nviVar.f44748a.size();
                            mrm mrmVarM16829i2 = mqu.f41450a;
                            int i4 = detVar3.f10743g.mo6184l(dig.f11484B) ? ((Boolean) detVar3.f10746j.mo6051a()).booleanValue() ? 3 : 0 : 1;
                            if (size == 4 && i4 != 0) {
                                dea deaVarM5974a = deb.m5974a();
                                deaVarM5974a.f10618a = detVar3.f10739c.getString(C0100R.string.scan_document);
                                deaVarM5974a.f10622e = i4;
                                deaVarM5974a.f10620c = detVar3.f10739c.getResources().getDrawable(i4 == 3 ? C0100R.drawable.product_logo_drive_2020q4_color_24 : C0100R.drawable.product_logo_lens_new_color_24, null);
                                deaVarM5974a.m5972f(jLongValue);
                                deaVarM5974a.f10623f = 3;
                                deaVarM5974a.f10621d = mrm.m16829i(nuyVar);
                                ksa ksaVar = detVar3.f10741e;
                                deaVarM5974a.m5973g(SystemClock.elapsedRealtime());
                                mrmVarM16829i2 = mrm.m16829i(deaVarM5974a.m5967a());
                            }
                            if (mrmVarM16829i2.mo16813g()) {
                                mwsVarM17097l = mws.m17097l((deb) mrmVarM16829i2.mo16809c());
                            } else {
                                mwsVarM17097l = mzr.f41857a;
                            }
                        } else {
                            mwsVarM17097l = mzr.f41857a;
                        }
                    } else {
                        mwsVarM17097l = mzr.f41857a;
                    }
                } else {
                    mwsVarM17097l = mzr.f41857a;
                }
                arrayList.addAll(mwsVarM17097l);
                HashMap map = new HashMap();
                if ((mewVar2.f40256a & 8) != 0) {
                    mfn mfnVar = mewVar2.f40258c;
                    if (mfnVar == null) {
                        mfnVar = mfn.f40366b;
                    }
                    for (mfh mfhVar : new mvj(mkv.m16504L(mfnVar.f40368a, ddu.f10586c))) {
                        int i5 = mfhVar.f40327a;
                        if ((i5 & 8) != 0 && (i5 & 2) != 0 && dffVar2.f10769e.containsKey(mfhVar.f40329c) && (f = (Float) dffVar2.f10769e.get(mfhVar.f40329c)) != null && mfhVar.f40328b > f.floatValue()) {
                            map.put(mfhVar.f40329c, Float.valueOf(mfhVar.f40328b));
                        }
                    }
                }
                if ((mewVar2.f40256a & 512) != 0) {
                    mfqVar = mewVar2.f40259d;
                    if (mfqVar == null) {
                        mfqVar = mfq.f40377b;
                    }
                } else {
                    mfqVar = null;
                }
                if (arrayList.isEmpty() && map.isEmpty() && mfqVar == null) {
                    return;
                }
                if (!arrayList.isEmpty()) {
                    derVarM6021a.m6019b(arrayList);
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        dffVar2.f10767c.m6029a(((deb) arrayList.get(i6)).f10631a);
                    }
                }
                ded dedVar = new ded(null);
                dedVar.m5992a(new HashMap());
                dedVar.m5992a(map);
                dedVar.f10652b = mrm.m16828h(mfqVar);
                mwx mwxVar = dedVar.f10651a;
                if (mwxVar == null) {
                    throw new IllegalStateException("Missing required properties: sceneDetectionResults");
                }
                derVarM6021a.f10730a = mrm.m16829i(new dee(mwxVar, dedVar.f10652b));
                dffVar2.f10770f.mo6008k(derVarM6021a.m6018a());
            }
        });
    }
}
