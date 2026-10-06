package p000;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdt implements Runnable {

    /* JADX INFO: renamed from: b */
    private static final String f3007b = ayc.m2100b("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public final ayz f3008a;

    /* JADX INFO: renamed from: c */
    private final azg f3009c;

    public bdt(azg azgVar) {
        ayz ayzVar = new ayz();
        this.f3009c = azgVar;
        this.f3008a = ayzVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x020e  */
    /* JADX WARN: Code duplicated, block: B:115:0x021c A[Catch: all -> 0x03bc, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0243 A[Catch: all -> 0x03bc, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0251  */
    /* JADX WARN: Code duplicated, block: B:128:0x0254  */
    /* JADX WARN: Code duplicated, block: B:133:0x028b A[Catch: all -> 0x03bc, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x028f A[Catch: all -> 0x03bc, TRY_LEAVE, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f8 A[Catch: all -> 0x03bc, TRY_LEAVE, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0337 A[Catch: all -> 0x03bc, TRY_LEAVE, TryCatch #8 {all -> 0x03bc, blocks: (B:164:0x0387, B:112:0x0212, B:113:0x0216, B:115:0x021c, B:119:0x022a, B:125:0x0249, B:129:0x0256, B:131:0x0282, B:133:0x028b, B:135:0x028f, B:137:0x02c3, B:139:0x02d3, B:140:0x02da, B:143:0x02e4, B:144:0x02f2, B:146:0x02f8, B:148:0x0323, B:150:0x032d, B:151:0x0334, B:153:0x0337, B:155:0x0364, B:157:0x036d, B:158:0x0374, B:161:0x037e, B:162:0x0385, B:122:0x0234, B:123:0x023b, B:124:0x0243, B:68:0x015e, B:75:0x0188, B:77:0x0190, B:81:0x019a, B:87:0x01a7, B:90:0x01bb, B:91:0x01c1, B:98:0x01d2, B:99:0x01de, B:101:0x01e4, B:102:0x01f0, B:104:0x01fa, B:136:0x02b3, B:69:0x0177, B:71:0x017d, B:154:0x0354, B:147:0x0313, B:130:0x0272), top: B:197:0x015e, inners: #1, #5, #6, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0392  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:213:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        boolean z5;
        C1058va c1058va;
        Object obj;
        boolean z6;
        boolean z7;
        bcw bcwVarMo1700B;
        boolean z8;
        Iterator it2;
        bdl bdlVarMo1701C;
        String strM19476d;
        Iterator it3;
        bcl bclVarMo1705z;
        int length;
        int i;
        bbv bbvVarMo1702w;
        bdt bdtVar;
        bdt bdtVar2 = this;
        try {
            azg azgVar = bdtVar2.f3009c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(azgVar.f2767d);
            Set setM2121i = azg.m2121i();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                if (setM2121i.contains((String) it4.next())) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + bdtVar2.f3009c + ")");
                }
            }
            hashSet.removeAll(azgVar.f2767d);
            WorkDatabase workDatabase = bdtVar2.f3009c.f2764a.f2782d;
            workDatabase.m1825m();
            try {
                azg azgVar2 = bdtVar2.f3009c;
                Set setM2121i2 = azg.m2121i();
                azp azpVar = azgVar2.f2764a;
                List list = azgVar2.f2766c;
                String[] strArr = (String[]) setM2121i2.toArray(new String[0]);
                String str = azgVar2.f2765b;
                int i2 = azgVar2.f2769f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                WorkDatabase workDatabase2 = azpVar.f2782d;
                boolean z9 = strArr != null && strArr.length > 0;
                if (z9) {
                    int length2 = strArr.length;
                    int i3 = 0;
                    z = false;
                    z2 = false;
                    z3 = true;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr[i3];
                            bcv bcvVarMo2232a = workDatabase2.mo1700B().mo2232a(str2);
                            if (bcvVarMo2232a == null) {
                                ayc.m2099a();
                                Log.e(f3007b, BEeWZPor.SutgX + str2 + " doesn't exist; not enqueuing");
                                workDatabase = workDatabase;
                                z5 = false;
                            } else {
                                int i4 = bcvVarMo2232a.f2981r;
                                z3 &= i4 == 3;
                                if (i4 == 4) {
                                    z = true;
                                } else if (i4 == 6) {
                                    z2 = true;
                                }
                                i3++;
                            }
                        }
                        azgVar2.f2768e = true;
                        workDatabase.m1829q();
                        try {
                            workDatabase.m1827o();
                            if (z5) {
                                bdtVar = this;
                                bdz.m2261a(bdtVar.f3009c.f2764a.f2780b, RescheduleReceiver.class, true);
                                azp azpVar2 = bdtVar.f3009c.f2764a;
                                azf.m2120a(azpVar2.f2781c, azpVar2.f2782d, azpVar2.f2783e);
                            } else {
                                bdtVar = this;
                            }
                            bdtVar.f3008a.m2109a(ayg.f2712a);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bdtVar2 = this;
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                boolean z10 = !TextUtils.isEmpty(str);
                if (!z10 || z9) {
                    workDatabase = workDatabase;
                    z4 = false;
                    it = list.iterator();
                    while (it.hasNext()) {
                        c1058va = (C1058va) it.next();
                        obj = c1058va.f47804c;
                        if (z9 || z3) {
                            ((bcv) obj).f2975l = jCurrentTimeMillis;
                        } else if (z) {
                            ((bcv) obj).f2981r = 4;
                        } else if (z2) {
                            ((bcv) obj).f2981r = 6;
                        } else {
                            ((bcv) obj).f2981r = 5;
                        }
                        if (((bcv) obj).f2981r == 1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z7 = z4 | (!z6);
                        bcwVarMo1700B = workDatabase2.mo1700B();
                        azpVar.f2783e.getClass();
                        ((bdk) bcwVarMo1700B).f2987a.m1824l();
                        ((bdk) bcwVarMo1700B).f2987a.m1825m();
                        try {
                            ((bdk) bcwVarMo1700B).f2988b.m1806a(obj);
                            ((bdk) bcwVarMo1700B).f2987a.m1829q();
                            ((bdk) bcwVarMo1700B).f2987a.m1827o();
                            if (z9) {
                                length = strArr.length;
                                i = 0;
                                while (i < length) {
                                    boolean z11 = z7;
                                    Iterator it5 = it;
                                    bck bckVar = new bck(c1058va.m19476d(), strArr[i], null);
                                    bbvVarMo1702w = workDatabase2.mo1702w();
                                    ((bbx) bbvVarMo1702w).f2929a.m1824l();
                                    ((bbx) bbvVarMo1702w).f2929a.m1825m();
                                    try {
                                        ((bbx) bbvVarMo1702w).f2930b.m1806a(bckVar);
                                        ((bbx) bbvVarMo1702w).f2929a.m1829q();
                                        ((bbx) bbvVarMo1702w).f2929a.m1827o();
                                        i++;
                                        z7 = z11;
                                        it = it5;
                                    } catch (Throwable th2) {
                                        ((bbx) bbvVarMo1702w).f2929a.m1827o();
                                        throw th2;
                                    }
                                }
                                z8 = z7;
                                it2 = it;
                            } else {
                                z8 = z7;
                                it2 = it;
                            }
                            bdlVarMo1701C = workDatabase2.mo1701C();
                            strM19476d = c1058va.m19476d();
                            it3 = c1058va.f47802a.iterator();
                            while (it3.hasNext()) {
                                dsx dsxVar = new dsx((String) it3.next(), strM19476d);
                                ((bdo) bdlVarMo1701C).f2998a.m1824l();
                                ((bdo) bdlVarMo1701C).f2998a.m1825m();
                                try {
                                    ((bdo) bdlVarMo1701C).f2999b.m1806a(dsxVar);
                                    ((bdo) bdlVarMo1701C).f2998a.m1829q();
                                    ((bdo) bdlVarMo1701C).f2998a.m1827o();
                                } catch (Throwable th3) {
                                    ((bdo) bdlVarMo1701C).f2998a.m1827o();
                                    throw th3;
                                }
                            }
                            if (z10) {
                                bclVarMo1705z = workDatabase2.mo1705z();
                                bck bckVar2 = new bck(str, c1058va.m19476d());
                                ((bcn) bclVarMo1705z).f2950a.m1824l();
                                ((bcn) bclVarMo1705z).f2950a.m1825m();
                                try {
                                    ((bcn) bclVarMo1705z).f2951b.m1806a(bckVar2);
                                    ((bcn) bclVarMo1705z).f2950a.m1829q();
                                    ((bcn) bclVarMo1705z).f2950a.m1827o();
                                } catch (Throwable th4) {
                                    ((bcn) bclVarMo1705z).f2950a.m1827o();
                                    throw th4;
                                }
                            }
                            z4 = z8;
                            it = it2;
                        } catch (Throwable th5) {
                            ((bdk) bcwVarMo1700B).f2987a.m1827o();
                            throw th5;
                        }
                    }
                    z5 = z4;
                    azgVar2.f2768e = true;
                    workDatabase.m1829q();
                    workDatabase.m1827o();
                    if (z5) {
                        bdtVar = this;
                        bdz.m2261a(bdtVar.f3009c.f2764a.f2780b, RescheduleReceiver.class, true);
                        azp azpVar3 = bdtVar.f3009c.f2764a;
                        azf.m2120a(azpVar3.f2781c, azpVar3.f2782d, azpVar3.f2783e);
                    } else {
                        bdtVar = this;
                    }
                    bdtVar.f3008a.m2109a(ayg.f2712a);
                    return;
                }
                try {
                    List listMo2235d = workDatabase2.mo1700B().mo2235d(str);
                    if (listMo2235d.isEmpty()) {
                        workDatabase = workDatabase;
                        z4 = false;
                    } else if (i2 == 3 || i2 == 4) {
                        bbv bbvVarMo1702w2 = workDatabase2.mo1702w();
                        List arrayList = new ArrayList();
                        Iterator it6 = listMo2235d.iterator();
                        while (it6.hasNext()) {
                            bct bctVar = (bct) it6.next();
                            it6 = it6;
                            String str3 = bctVar.f2955a;
                            workDatabase = workDatabase;
                            try {
                                apy apyVarM1841a = apy.m1841a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                                apyVarM1841a.mo1847g(1, str3);
                                ((bbx) bbvVarMo1702w2).f2929a.m1824l();
                                Cursor cursorM409e = aey.m409e(((bbx) bbvVarMo1702w2).f2929a, apyVarM1841a, false);
                                try {
                                    boolean z12 = cursorM409e.moveToFirst() && cursorM409e.getInt(0) != 0;
                                    cursorM409e.close();
                                    apyVarM1841a.m1850j();
                                    if (!z12) {
                                        int i5 = bctVar.f2956b;
                                        z3 &= i5 == 3;
                                        if (i5 == 4) {
                                            z = true;
                                        } else if (i5 == 6) {
                                            z2 = true;
                                        }
                                        arrayList.add(bctVar.f2955a);
                                    }
                                } catch (Throwable th6) {
                                    cursorM409e.close();
                                    apyVarM1841a.m1850j();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                workDatabase.m1827o();
                                throw th;
                            }
                        }
                        workDatabase = workDatabase;
                        if (i2 == 4) {
                            if (z2 || z) {
                                bcw bcwVarMo1700B2 = workDatabase2.mo1700B();
                                Iterator it7 = bcwVarMo1700B2.mo2235d(str).iterator();
                                while (it7.hasNext()) {
                                    bcwVarMo1700B2.mo2236e(((bct) it7.next()).f2955a);
                                }
                                arrayList = Collections.emptyList();
                                z = false;
                                z2 = false;
                            } else {
                                z = false;
                                z2 = false;
                            }
                        }
                        strArr = (String[]) arrayList.toArray(strArr);
                        z9 = strArr.length > 0;
                        z4 = false;
                    } else {
                        if (i2 == 2) {
                            Iterator it8 = listMo2235d.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    int i6 = ((bct) it8.next()).f2956b;
                                    if (i6 == 1 || i6 == 2) {
                                        workDatabase = workDatabase;
                                        z5 = false;
                                    }
                                }
                                azgVar2.f2768e = true;
                                workDatabase.m1829q();
                                workDatabase.m1827o();
                                if (z5) {
                                    bdtVar = this;
                                    bdz.m2261a(bdtVar.f3009c.f2764a.f2780b, RescheduleReceiver.class, true);
                                    azp azpVar4 = bdtVar.f3009c.f2764a;
                                    azf.m2120a(azpVar4.f2781c, azpVar4.f2782d, azpVar4.f2783e);
                                } else {
                                    bdtVar = this;
                                }
                                bdtVar.f3008a.m2109a(ayg.f2712a);
                                return;
                            }
                        }
                        bds.m2248b(str, azpVar, false).run();
                        bcw bcwVarMo1700B3 = workDatabase2.mo1700B();
                        Iterator it9 = listMo2235d.iterator();
                        while (it9.hasNext()) {
                            bcwVarMo1700B3.mo2236e(((bct) it9.next()).f2955a);
                        }
                        workDatabase = workDatabase;
                        z4 = true;
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                        c1058va = (C1058va) it.next();
                        obj = c1058va.f47804c;
                        if (z9) {
                            ((bcv) obj).f2975l = jCurrentTimeMillis;
                        } else {
                            ((bcv) obj).f2975l = jCurrentTimeMillis;
                        }
                        if (((bcv) obj).f2981r == 1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        z7 = z4 | (!z6);
                        bcwVarMo1700B = workDatabase2.mo1700B();
                        azpVar.f2783e.getClass();
                        ((bdk) bcwVarMo1700B).f2987a.m1824l();
                        ((bdk) bcwVarMo1700B).f2987a.m1825m();
                        ((bdk) bcwVarMo1700B).f2988b.m1806a(obj);
                        ((bdk) bcwVarMo1700B).f2987a.m1829q();
                        ((bdk) bcwVarMo1700B).f2987a.m1827o();
                        if (z9) {
                            length = strArr.length;
                            i = 0;
                            while (i < length) {
                                boolean z13 = z7;
                                Iterator it10 = it;
                                bck bckVar3 = new bck(c1058va.m19476d(), strArr[i], null);
                                bbvVarMo1702w = workDatabase2.mo1702w();
                                ((bbx) bbvVarMo1702w).f2929a.m1824l();
                                ((bbx) bbvVarMo1702w).f2929a.m1825m();
                                ((bbx) bbvVarMo1702w).f2930b.m1806a(bckVar3);
                                ((bbx) bbvVarMo1702w).f2929a.m1829q();
                                ((bbx) bbvVarMo1702w).f2929a.m1827o();
                                i++;
                                z7 = z13;
                                it = it10;
                            }
                            z8 = z7;
                            it2 = it;
                        } else {
                            z8 = z7;
                            it2 = it;
                        }
                        bdlVarMo1701C = workDatabase2.mo1701C();
                        strM19476d = c1058va.m19476d();
                        it3 = c1058va.f47802a.iterator();
                        while (it3.hasNext()) {
                            dsx dsxVar2 = new dsx((String) it3.next(), strM19476d);
                            ((bdo) bdlVarMo1701C).f2998a.m1824l();
                            ((bdo) bdlVarMo1701C).f2998a.m1825m();
                            ((bdo) bdlVarMo1701C).f2999b.m1806a(dsxVar2);
                            ((bdo) bdlVarMo1701C).f2998a.m1829q();
                            ((bdo) bdlVarMo1701C).f2998a.m1827o();
                        }
                        if (z10) {
                            bclVarMo1705z = workDatabase2.mo1705z();
                            bck bckVar4 = new bck(str, c1058va.m19476d());
                            ((bcn) bclVarMo1705z).f2950a.m1824l();
                            ((bcn) bclVarMo1705z).f2950a.m1825m();
                            ((bcn) bclVarMo1705z).f2951b.m1806a(bckVar4);
                            ((bcn) bclVarMo1705z).f2950a.m1829q();
                            ((bcn) bclVarMo1705z).f2950a.m1827o();
                        }
                        z4 = z8;
                        it = it2;
                    }
                    z5 = z4;
                    azgVar2.f2768e = true;
                    workDatabase.m1829q();
                    workDatabase.m1827o();
                    if (z5) {
                        bdtVar = this;
                        bdz.m2261a(bdtVar.f3009c.f2764a.f2780b, RescheduleReceiver.class, true);
                        azp azpVar5 = bdtVar.f3009c.f2764a;
                        azf.m2120a(azpVar5.f2781c, azpVar5.f2782d, azpVar5.f2783e);
                    } else {
                        bdtVar = this;
                    }
                    bdtVar.f3008a.m2109a(ayg.f2712a);
                    return;
                } catch (Throwable th8) {
                    th = th8;
                    workDatabase = workDatabase;
                    workDatabase.m1827o();
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                workDatabase = workDatabase;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        bdtVar2.f3008a.m2109a(new ayd(th));
    }
}
