package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.measurement.internal.C1045d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mhb extends h8d {

    /* JADX INFO: renamed from: d */
    public String f51337d;

    /* JADX INFO: renamed from: e */
    public HashSet f51338e;

    /* JADX INFO: renamed from: f */
    public C3275kv f51339f;

    /* JADX INFO: renamed from: g */
    public Long f51340g;

    /* JADX INFO: renamed from: h */
    public Long f51341h;

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #5 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #5 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:480:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x043f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0450  */
    /* JADX WARN: Code duplicated, block: B:196:0x0470  */
    /* JADX WARN: Code duplicated, block: B:202:0x0487  */
    /* JADX WARN: Code duplicated, block: B:206:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:207:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:223:0x0507  */
    /* JADX WARN: Code duplicated, block: B:226:0x0510  */
    /* JADX WARN: Code duplicated, block: B:228:0x051c  */
    /* JADX WARN: Code duplicated, block: B:230:0x053e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0542  */
    /* JADX WARN: Code duplicated, block: B:236:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x057a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0596  */
    /* JADX WARN: Code duplicated, block: B:252:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:265:0x0611  */
    /* JADX WARN: Code duplicated, block: B:271:0x0644  */
    /* JADX WARN: Code duplicated, block: B:275:0x0685  */
    /* JADX WARN: Code duplicated, block: B:282:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:288:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06e9 A[LOOP:3: B:276:0x0687->B:299:0x06e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:315:0x071c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0727  */
    /* JADX WARN: Code duplicated, block: B:322:0x072b  */
    /* JADX WARN: Code duplicated, block: B:326:0x073d  */
    /* JADX WARN: Code duplicated, block: B:332:0x076c  */
    /* JADX WARN: Code duplicated, block: B:334:0x0797  */
    /* JADX WARN: Code duplicated, block: B:336:0x079e  */
    /* JADX WARN: Code duplicated, block: B:339:0x07b1 A[LOOP:5: B:330:0x0766->B:339:0x07b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:354:0x0802  */
    /* JADX WARN: Code duplicated, block: B:358:0x083d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0865  */
    /* JADX WARN: Code duplicated, block: B:371:0x0876  */
    /* JADX WARN: Code duplicated, block: B:382:0x08a5 A[LOOP:7: B:359:0x083f->B:382:0x08a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:400:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:404:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:406:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:410:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:414:0x091f  */
    /* JADX WARN: Code duplicated, block: B:417:0x0930  */
    /* JADX WARN: Code duplicated, block: B:419:0x0947  */
    /* JADX WARN: Code duplicated, block: B:421:0x0955  */
    /* JADX WARN: Code duplicated, block: B:423:0x0960  */
    /* JADX WARN: Code duplicated, block: B:425:0x098b  */
    /* JADX WARN: Code duplicated, block: B:428:0x0995  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a1e A[PHI: r16 r20 r21
      0x0a1e: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a1c, B:443:0x0a0c] A[DONT_GENERATE, DONT_INLINE]
      0x0a1e: PHI (r20v9 l79) = (r20v10 l79), (r2v41 l79) binds: [B:445:0x0a1c, B:443:0x0a0c] A[DONT_GENERATE, DONT_INLINE]
      0x0a1e: PHI (r21v8 java.util.Iterator) = (r21v9 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a1c, B:443:0x0a0c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:464:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:536:0x061f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x060b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06e4 A[EDGE_INSN: B:542:0x06e4->B:298:0x06e4 BREAK  A[LOOP:3: B:276:0x0687->B:299:0x06e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x075b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x074f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08a0 A[EDGE_INSN: B:553:0x08a0->B:381:0x08a0 BREAK  A[LOOP:7: B:359:0x083f->B:382:0x08a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0910 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a16 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aa3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:478:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:478:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v31, types: [kv, l79] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [kv, l79] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [kjc] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [kjc] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [occ] */
    /* JADX WARN: Type inference failed for: r3v83, types: [occ] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: H */
    public final ArrayList m16836H(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        kjc kjcVar;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        mkc mkcVar;
        BitSet bitSet;
        BitSet bitSet2;
        C3275kv c3275kv;
        mkc mkcVar2;
        C3275kv c3275kv2;
        List<k5c> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        wkc wkcVar;
        Long lValueOf;
        nnb nnbVarM5920g0;
        String str6;
        ?? c3275kv3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        C3275kv c3275kv4;
        Iterator it2;
        Integer num;
        mkc mkcVar3;
        List list4;
        ?? r18;
        Iterator it3;
        kjc kjcVar2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        nnb nnbVarM5920g1;
        kjc kjcVar3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        l79 l79Var;
        String strM14550u;
        Map map6;
        Iterator it5;
        Iterator it6;
        l79 l79Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zM19119b;
        l79 l79Var3;
        Map map7;
        f7c f7cVar;
        Integer numValueOf3;
        pfb pfbVar;
        int i2;
        Integer numValueOf4;
        kjc kjcVar4;
        String str9;
        C3275kv c3275kv5;
        Cursor cursor;
        kjc kjcVar5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        xo2 xo2Var;
        ?? c3275kv6;
        ohc ohcVarM24623a;
        zob zobVarM17553n0;
        long j;
        String strM18026x;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zM19118a;
        Map map9;
        xo2 xo2Var2;
        Integer num3;
        pfb pfbVar2;
        int iM14869t;
        ymd ymdVar;
        boolean z5;
        String str11;
        C3275kv c3275kv7;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        C3275kv c3275kv8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        kjc kjcVar6 = (kjc) this.f60774a;
        lda.m16127m(str);
        lda.m16130p(list);
        lda.m16130p(list2);
        this.f51337d = str;
        this.f51338e = new HashSet();
        this.f51339f = new C3275kv();
        this.f51340g = l;
        this.f51341h = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((ohc) it9.next()).m18026x())) {
                z2 = true;
                break;
            }
        }
        mkb.m16883a();
        boolean zM4869O = kjcVar6.f47436d.m4869O(this.f51337d, z8c.f71112F0);
        mkb.m16883a();
        boolean zM4869O2 = kjcVar6.f47436d.m4869O(this.f51337d, z8c.f71110E0);
        C1045d c1045d = this.f55716b;
        if (z2) {
            nnb nnbVarM5920g2 = c1045d.m5920g0();
            String str13 = this.f51337d;
            nnbVarM5920g2.m13144E();
            nnbVarM5920g2.mo12359D();
            lda.m16127m(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                nnbVarM5920g2.m17559u0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((kjc) nnbVarM5920g2.f60774a).mo5909b().m24452H().m17925c("Error resetting session-scoped event counts. appId", xcc.m24449L(str13), e);
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objM24449L = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zM4869O2 && zM4869O) {
                        nnb nnbVarM5920g3 = c1045d.m5920g0();
                        kjc kjcVar7 = (kjc) nnbVarM5920g3.f60774a;
                        String str16 = this.f51337d;
                        lda.m16127m(str16);
                        z3 = z2;
                        C3275kv c3275kv9 = new C3275kv();
                        try {
                            ?? Query2 = nnbVarM5920g3.m17559u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    k5c k5cVar = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query2.getBlob(1))).m22741d();
                                                    if (k5cVar.m14874y()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c3275kv9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c3275kv9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(k5cVar);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    kjcVar7.mo5909b().m24452H().m17925c("Failed to merge filter. appId", xcc.m24449L(str16), e2);
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        kjcVar7.mo5909b().m24452H().m17925c("Database error querying filters. appId", xcc.m24449L(str16), e);
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                kjcVar7.mo5909b().m24452H().m17925c("Database error querying filters. appId", xcc.m24449L(str16), e);
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                nnb nnbVarM5920g4 = c1045d.m5920g0();
                                                obj = (kjc) nnbVarM5920g4.f60774a;
                                                r5 = this.f51337d;
                                                nnbVarM5920g4.m13144E();
                                                nnbVarM5920g4.mo12359D();
                                                lda.m16127m(r5);
                                                cursorQuery = nnbVarM5920g4.m17559u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c3275kv8 = new C3275kv();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                mkc mkcVar4 = (mkc) ((ikc) dad.m10238o0(mkc.m16884A(), cursorQuery.getBlob(1))).m22741d();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                c3275kv8.put(objValueOf, mkcVar4);
                                                                str3 = str14;
                                                                obj2 = objM24449L;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                occ occVarM24452H = r17.mo5909b().m24452H();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM24449L;
                                                                try {
                                                                    objM24449L = xcc.m24449L(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    occVarM24452H.m17926d("Failed to merge filter results. appId, audienceId, error", objM24449L, numValueOf8, e5);
                                                                    obj3 = occVarM24452H;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.mo5909b().m24452H().m17925c("Database error querying filter results. appId", xcc.m24449L(r21), e);
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        kjcVar = kjcVar6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.f51337d;
                                                                            nnbVarM5920g0 = c1045d.m5920g0();
                                                                            str6 = this.f51337d;
                                                                            nnbVarM5920g0.m13144E();
                                                                            nnbVarM5920g0.mo12359D();
                                                                            lda.m16127m(str6);
                                                                            c3275kv3 = new C3275kv();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = nnbVarM5920g0.m17559u0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c3275kv3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c3275kv3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c3275kv3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((kjc) nnbVarM5920g0.f60774a).mo5909b().m24452H().m17925c("Database error querying scoped filters. appId", xcc.m24449L(str6), e);
                                                                                        c3275kv3 = Collections.EMPTY_MAP;
                                                                                        r0 = c3275kv3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        lda.m16127m(str17);
                                                                                        c3275kv4 = new C3275kv();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                mkcVar3 = (mkc) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                kjcVar2 = kjcVar6;
                                                                                                c3275kv4.put(num, mkcVar3);
                                                                                                r0 = r18;
                                                                                                it2 = it3;
                                                                                                str15 = str15;
                                                                                                kjcVar6 = kjcVar2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        kjcVar = kjcVar6;
                                                                                        map3 = c3275kv4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            mkcVar = (mkc) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c3275kv = new C3275kv();
                                                                                            if (mkcVar != null) {
                                                                                                for (fhc fhcVar : mkcVar.m16899w()) {
                                                                                                    if (fhcVar.m11832s()) {
                                                                                                        mkc mkcVar5 = mkcVar;
                                                                                                        Integer numValueOf9 = Integer.valueOf(fhcVar.m11833t());
                                                                                                        if (fhcVar.m11834u()) {
                                                                                                            lValueOf = Long.valueOf(fhcVar.m11835v());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c3275kv.put(numValueOf9, lValueOf);
                                                                                                        mkcVar = mkcVar5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            mkcVar2 = mkcVar;
                                                                                            c3275kv2 = new C3275kv();
                                                                                            if (mkcVar2 != null) {
                                                                                                it = mkcVar2.m16901y().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    wkcVar = (wkc) it.next();
                                                                                                    if (!wkcVar.m24032s()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (mkcVar2 != null) {
                                                                                                i = 0;
                                                                                                while (i < mkcVar2.m16896t() * 64) {
                                                                                                    if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                                                                                                        z4 = zM4869O;
                                                                                                        kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                                        bitSet2.set(i);
                                                                                                        if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zM4869O = z4;
                                                                                                    } else {
                                                                                                        z4 = zM4869O;
                                                                                                    }
                                                                                                    c3275kv.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zM4869O = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zM4869O;
                                                                                            mkc mkcVar6 = (mkc) map4.get(num4);
                                                                                            if (zM4869O2) {
                                                                                                for (k5c k5cVar2 : list3) {
                                                                                                    int iM14869t2 = k5cVar2.m14869t();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f51341h.longValue() / 1000;
                                                                                                    if (k5cVar2.m14863B()) {
                                                                                                        jLongValue = this.f51340g.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iM14869t2);
                                                                                                    if (c3275kv.containsKey(numValueOf)) {
                                                                                                        c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c3275kv2.containsKey(numValueOf)) {
                                                                                                        c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar6, bitSet, bitSet2, c3275kv, c3275kv2));
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str2 = str2;
                                                                                            zM4869O = z6;
                                                                                            map5 = map12;
                                                                                            map4 = map4;
                                                                                            zM4869O2 = zM4869O2;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            xo2Var = new xo2(this);
                                                                                            c3275kv6 = new C3275kv();
                                                                                            for (ohc ohcVar : list) {
                                                                                                ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                                                                                                if (ohcVarM24623a != null) {
                                                                                                    zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                                                                                                    c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = zobVarM17553n0.f71914c;
                                                                                                        strM18026x = ohcVarM24623a.m18026x();
                                                                                                        map8 = (Map) c3275kv6.get(strM18026x);
                                                                                                        if (map8 == null) {
                                                                                                            nnb nnbVarM5920g5 = c1045d.m5920g0();
                                                                                                            kjc kjcVar8 = (kjc) nnbVarM5920g5.f60774a;
                                                                                                            str11 = this.f51337d;
                                                                                                            nnbVarM5920g5.m13144E();
                                                                                                            nnbVarM5920g5.mo12359D();
                                                                                                            lda.m16127m(str11);
                                                                                                            lda.m16127m(strM18026x);
                                                                                                            c3275kv7 = new C3275kv();
                                                                                                            try {
                                                                                                                Query = nnbVarM5920g5.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        k5c k5cVar3 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c3275kv7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c3275kv7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    kjcVar8.mo5909b().m24452H().m17925c(r10, xcc.m24449L(str12), e);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(k5cVar3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        kjcVar8.mo5909b().m24452H().m17925c(str18, xcc.m24449L(str12), e9);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    kjcVar8.mo5909b().m24452H().m17925c(r10, xcc.m24449L(str12), e);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    c3275kv6.put(strM18026x, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f51338e.contains(num6)) {
                                                                                                                                            kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zM19118a = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    xo2Var2 = xo2Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                k5c k5cVar4 = (k5c) it8.next();
                                                                                                                                                xo2Var2 = xo2Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar4, 0);
                                                                                                                                                Long l3 = this.f51340g;
                                                                                                                                                Long l4 = this.f51341h;
                                                                                                                                                iM14869t = k5cVar4.m14869t();
                                                                                                                                                ymdVar = (ymd) this.f51339f.get(num3);
                                                                                                                                                if (ymdVar == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = ymdVar.m25206c().get(iM14869t);
                                                                                                                                                }
                                                                                                                                                zM19118a = pfbVar2.m19118a(l3, l4, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                                                                                                                if (!zM19118a) {
                                                                                                                                                    this.f51338e.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                m16837I(num3).m25204a(pfbVar2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                xo2Var = xo2Var2;
                                                                                                                                            }
                                                                                                                                            if (!zM19118a) {
                                                                                                                                                this.f51338e.add(num3);
                                                                                                                                            }
                                                                                                                                            xo2Var = xo2Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = c3275kv7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e11) {
                                                                                                                        e = e11;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    r44 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            c3275kv6.put(strM18026x, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r18.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f51338e.contains(num6)) {
                                                                                                                kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zM19118a = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        xo2Var2 = xo2Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    k5c k5cVar5 = (k5c) it8.next();
                                                                                                                    xo2Var2 = xo2Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar5, 0);
                                                                                                                    Long l5 = this.f51340g;
                                                                                                                    Long l6 = this.f51341h;
                                                                                                                    iM14869t = k5cVar5.m14869t();
                                                                                                                    ymdVar = (ymd) this.f51339f.get(num3);
                                                                                                                    if (ymdVar == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = ymdVar.m25206c().get(iM14869t);
                                                                                                                    }
                                                                                                                    zM19118a = pfbVar2.m19118a(l5, l6, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                                                                                    if (!zM19118a) {
                                                                                                                        this.f51338e.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    m16837I(num3).m25204a(pfbVar2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    xo2Var = xo2Var2;
                                                                                                                }
                                                                                                                if (!zM19118a) {
                                                                                                                    this.f51338e.add(num3);
                                                                                                                }
                                                                                                                xo2Var = xo2Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C3275kv c3275kv10 = new C3275kv();
                                                                                            it4 = list2.iterator();
                                                                                            l79Var = c3275kv10;
                                                                                            while (it4.hasNext()) {
                                                                                                jmc jmcVar = (jmc) it4.next();
                                                                                                strM14550u = jmcVar.m14550u();
                                                                                                map6 = (Map) l79Var.get(strM14550u);
                                                                                                if (map6 == null) {
                                                                                                    nnb nnbVarM5920g6 = c1045d.m5920g0();
                                                                                                    kjcVar4 = (kjc) nnbVarM5920g6.f60774a;
                                                                                                    str9 = this.f51337d;
                                                                                                    nnbVarM5920g6.m13144E();
                                                                                                    nnbVarM5920g6.mo12359D();
                                                                                                    lda.m16127m(str9);
                                                                                                    lda.m16127m(strM14550u);
                                                                                                    c3275kv5 = new C3275kv();
                                                                                                    try {
                                                                                                        cursorQuery2 = nnbVarM5920g6.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                f7c f7cVar2 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c3275kv5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    kjcVar5 = kjcVar4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c3275kv5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            kjcVar5.mo5909b().m24452H().m17925c(r10, xcc.m24449L(str10), e);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            l79Var.put(strM14550u, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            l79Var2 = l79Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f51338e.contains(num2)) {
                                                                                                                                                    kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zM19119b = true;
                                                                                                                                                l79Var3 = l79Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        f7cVar = (f7c) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                                                                                                            occ occVarM24455K = kjcVar.mo5909b().m24455K();
                                                                                                                                                            if (f7cVar.m11582s()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            occVarM24455K.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                                                                                                            kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (f7cVar.m11582s()) {
                                                                                                                                                        }
                                                                                                                                                        occ occVarM24453I = kjcVar.mo5909b().m24453I();
                                                                                                                                                        scc sccVarM24449L = xcc.m24449L(this.f51337d);
                                                                                                                                                        if (f7cVar.m11582s()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        occVarM24453I.m17925c("Invalid property filter ID. appId, id", sccVarM24449L, String.valueOf(numValueOf3));
                                                                                                                                                        this.f51338e.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        l79Var2 = l79Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        l79Var3 = l79Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zM19119b) {
                                                                                                                                                        this.f51338e.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    l79Var2 = l79Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    m16837I(num2).m25204a(pfbVar);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    l79Var3 = l79Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            l79Var = l79Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    kjcVar5 = kjcVar4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(f7cVar2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                kjcVar5 = kjcVar4;
                                                                                                                                str10 = str9;
                                                                                                                                kjcVar5.mo5909b().m24452H().m17925c("Failed to merge filter", xcc.m24449L(str10), e14);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                kjcVar4 = kjcVar5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                kjcVar5.mo5909b().m24452H().m17925c(r10, xcc.m24449L(str10), e);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            kjcVar5 = kjcVar4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            kjcVar5.mo5909b().m24452H().m17925c(r10, xcc.m24449L(str10), e);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            l79Var.put(strM14550u, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            l79Var2 = l79Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f51338e.contains(num2)) {
                                                                                                                                    kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zM19119b = true;
                                                                                                                                l79Var3 = l79Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        f7cVar = (f7c) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                                                                                            occ occVarM24455K2 = kjcVar.mo5909b().m24455K();
                                                                                                                                            if (f7cVar.m11582s()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            occVarM24455K2.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                                                                                            kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (f7cVar.m11582s()) {
                                                                                                                                        }
                                                                                                                                        occ occVarM24453I2 = kjcVar.mo5909b().m24453I();
                                                                                                                                        scc sccVarM24449L2 = xcc.m24449L(this.f51337d);
                                                                                                                                        if (f7cVar.m11582s()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        occVarM24453I2.m17925c("Invalid property filter ID. appId, id", sccVarM24449L2, String.valueOf(numValueOf3));
                                                                                                                                        this.f51338e.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        l79Var2 = l79Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        l79Var3 = l79Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zM19119b) {
                                                                                                                                        this.f51338e.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    l79Var2 = l79Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    m16837I(num2).m25204a(pfbVar);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    l79Var3 = l79Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            l79Var = l79Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c3275kv5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e17) {
                                                                                                            e = e17;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        kjcVar5 = kjcVar4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    l79Var.put(strM14550u, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                l79Var2 = l79Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f51338e.contains(num2)) {
                                                                                                        kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zM19119b = true;
                                                                                                    l79Var3 = l79Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            f7cVar = (f7c) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                                                                occ occVarM24455K3 = kjcVar.mo5909b().m24455K();
                                                                                                                if (f7cVar.m11582s()) {
                                                                                                                    numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                occVarM24455K3.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                                                                kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                                                            }
                                                                                                            if (f7cVar.m11582s()) {
                                                                                                            }
                                                                                                            occ occVarM24453I3 = kjcVar.mo5909b().m24453I();
                                                                                                            scc sccVarM24449L3 = xcc.m24449L(this.f51337d);
                                                                                                            if (f7cVar.m11582s()) {
                                                                                                                numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            occVarM24453I3.m17925c("Invalid property filter ID. appId, id", sccVarM24449L3, String.valueOf(numValueOf3));
                                                                                                            this.f51338e.add(num2);
                                                                                                            map6 = map7;
                                                                                                            l79Var2 = l79Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            l79Var3 = l79Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zM19119b) {
                                                                                                            this.f51338e.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        l79Var2 = l79Var3;
                                                                                                        it6 = it6;
                                                                                                        m16837I(num2).m25204a(pfbVar);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        l79Var3 = l79Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                l79Var = l79Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C3089hv<Integer> c3089hv = (C3089hv) this.f51339f.keySet();
                                                                                        c3089hv.removeAll(this.f51338e);
                                                                                        for (Integer num7 : c3089hv) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            ymd ymdVar2 = (ymd) this.f51339f.get(num7);
                                                                                            lda.m16130p(ymdVar2);
                                                                                            lfc lfcVarM25205b = ymdVar2.m25205b(iIntValue3);
                                                                                            arrayList2.add(lfcVarM25205b);
                                                                                            nnbVarM5920g1 = c1045d.m5920g0();
                                                                                            kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
                                                                                            str8 = this.f51337d;
                                                                                            mkc mkcVarM16172u = lfcVarM25205b.m16172u();
                                                                                            nnbVarM5920g1.m13144E();
                                                                                            nnbVarM5920g1.mo12359D();
                                                                                            lda.m16127m(str8);
                                                                                            lda.m16130p(mkcVarM16172u);
                                                                                            byte[] bArrM3725a = mkcVarM16172u.m3725a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrM3725a);
                                                                                            try {
                                                                                                try {
                                                                                                    if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    kjcVar3.mo5909b().m24452H().m17925c("Error storing filter results. appId", xcc.m24449L(str8), e);
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = c3275kv3;
                                                                                lda.m16127m(str17);
                                                                                c3275kv4 = new C3275kv();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        mkcVar3 = (mkc) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        kjcVar2 = kjcVar6;
                                                                                        c3275kv4.put(num, mkcVar3);
                                                                                        r0 = r18;
                                                                                        it2 = it3;
                                                                                        str15 = str15;
                                                                                        kjcVar6 = kjcVar2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                kjcVar = kjcVar6;
                                                                                map3 = c3275kv4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            kjcVar = kjcVar6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            mkcVar = (mkc) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c3275kv = new C3275kv();
                                                                            if (mkcVar != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (fhcVar.m11832s()) {
                                                                                        mkc mkcVar7 = mkcVar;
                                                                                        Integer numValueOf10 = Integer.valueOf(fhcVar.m11833t());
                                                                                        if (fhcVar.m11834u()) {
                                                                                            lValueOf = Long.valueOf(fhcVar.m11835v());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c3275kv.put(numValueOf10, lValueOf);
                                                                                        mkcVar = mkcVar7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            mkcVar2 = mkcVar;
                                                                            c3275kv2 = new C3275kv();
                                                                            if (mkcVar2 != null) {
                                                                                it = mkcVar2.m16901y().iterator();
                                                                                while (it.hasNext()) {
                                                                                    wkcVar = (wkc) it.next();
                                                                                    if (!wkcVar.m24032s()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (mkcVar2 != null) {
                                                                                i = 0;
                                                                                while (i < mkcVar2.m16896t() * 64) {
                                                                                    if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                                                                                        z4 = zM4869O;
                                                                                        kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                        bitSet2.set(i);
                                                                                        if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zM4869O = z4;
                                                                                    } else {
                                                                                        z4 = zM4869O;
                                                                                    }
                                                                                    c3275kv.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zM4869O = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zM4869O;
                                                                            mkc mkcVar8 = (mkc) map4.get(num4);
                                                                            if (zM4869O2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iM14869t3 = k5cVar2.m14869t();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f51341h.longValue() / 1000;
                                                                                    if (k5cVar2.m14863B()) {
                                                                                        jLongValue = this.f51340g.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iM14869t3);
                                                                                    if (c3275kv.containsKey(numValueOf)) {
                                                                                        c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c3275kv2.containsKey(numValueOf)) {
                                                                                        c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar8, bitSet, bitSet2, c3275kv, c3275kv2));
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str2 = str2;
                                                                            zM4869O = z7;
                                                                            map5 = map13;
                                                                            map4 = map4;
                                                                            zM4869O2 = zM4869O2;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        xo2Var = new xo2(this);
                                                                        c3275kv6 = new C3275kv();
                                                                        while (r17.hasNext()) {
                                                                            ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                                                                            if (ohcVarM24623a != null) {
                                                                                zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                                                                                c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                                                                                if (z) {
                                                                                    j = zobVarM17553n0.f71914c;
                                                                                    strM18026x = ohcVarM24623a.m18026x();
                                                                                    map8 = (Map) c3275kv6.get(strM18026x);
                                                                                    if (map8 == null) {
                                                                                        nnb nnbVarM5920g7 = c1045d.m5920g0();
                                                                                        kjc kjcVar9 = (kjc) nnbVarM5920g7.f60774a;
                                                                                        str11 = this.f51337d;
                                                                                        nnbVarM5920g7.m13144E();
                                                                                        nnbVarM5920g7.mo12359D();
                                                                                        lda.m16127m(str11);
                                                                                        lda.m16127m(strM18026x);
                                                                                        c3275kv7 = new C3275kv();
                                                                                        Query = nnbVarM5920g7.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                k5c k5cVar6 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c3275kv7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c3275kv7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(k5cVar6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = c3275kv7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        c3275kv6.put(strM18026x, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r18.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f51338e.contains(num6)) {
                                                                                            kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zM19118a = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    xo2Var2 = xo2Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                k5c k5cVar7 = (k5c) it8.next();
                                                                                                xo2Var2 = xo2Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar7, 0);
                                                                                                Long l7 = this.f51340g;
                                                                                                Long l8 = this.f51341h;
                                                                                                iM14869t = k5cVar7.m14869t();
                                                                                                ymdVar = (ymd) this.f51339f.get(num3);
                                                                                                if (ymdVar == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = ymdVar.m25206c().get(iM14869t);
                                                                                                }
                                                                                                zM19118a = pfbVar2.m19118a(l7, l8, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                                                                if (!zM19118a) {
                                                                                                    this.f51338e.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                m16837I(num3).m25204a(pfbVar2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                xo2Var = xo2Var2;
                                                                                            }
                                                                                            if (!zM19118a) {
                                                                                                this.f51338e.add(num3);
                                                                                            }
                                                                                            xo2Var = xo2Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C3275kv c3275kv11 = new C3275kv();
                                                                        it4 = list2.iterator();
                                                                        l79Var = c3275kv11;
                                                                        while (it4.hasNext()) {
                                                                            jmc jmcVar2 = (jmc) it4.next();
                                                                            strM14550u = jmcVar2.m14550u();
                                                                            map6 = (Map) l79Var.get(strM14550u);
                                                                            if (map6 == null) {
                                                                                nnb nnbVarM5920g8 = c1045d.m5920g0();
                                                                                kjcVar4 = (kjc) nnbVarM5920g8.f60774a;
                                                                                str9 = this.f51337d;
                                                                                nnbVarM5920g8.m13144E();
                                                                                nnbVarM5920g8.mo12359D();
                                                                                lda.m16127m(str9);
                                                                                lda.m16127m(strM14550u);
                                                                                c3275kv5 = new C3275kv();
                                                                                cursorQuery2 = nnbVarM5920g8.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        f7c f7cVar3 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c3275kv5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            kjcVar5 = kjcVar4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c3275kv5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            kjcVar5 = kjcVar4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(f7cVar3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        kjcVar4 = kjcVar5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c3275kv5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                l79Var.put(strM14550u, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            l79Var2 = l79Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f51338e.contains(num2)) {
                                                                                    kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zM19119b = true;
                                                                                l79Var3 = l79Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        f7cVar = (f7c) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                                            occ occVarM24455K4 = kjcVar.mo5909b().m24455K();
                                                                                            if (f7cVar.m11582s()) {
                                                                                                numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            occVarM24455K4.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                                            kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                                        }
                                                                                        if (f7cVar.m11582s()) {
                                                                                        }
                                                                                        occ occVarM24453I4 = kjcVar.mo5909b().m24453I();
                                                                                        scc sccVarM24449L4 = xcc.m24449L(this.f51337d);
                                                                                        if (f7cVar.m11582s()) {
                                                                                            numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        occVarM24453I4.m17925c("Invalid property filter ID. appId, id", sccVarM24449L4, String.valueOf(numValueOf3));
                                                                                        this.f51338e.add(num2);
                                                                                        map6 = map7;
                                                                                        l79Var2 = l79Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        l79Var3 = l79Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zM19119b) {
                                                                                        this.f51338e.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    l79Var2 = l79Var3;
                                                                                    it6 = it6;
                                                                                    m16837I(num2).m25204a(pfbVar);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    l79Var3 = l79Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            l79Var = l79Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C3089hv<Integer> c3089hv2 = (C3089hv) this.f51339f.keySet();
                                                                    c3089hv2.removeAll(this.f51338e);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        ymd ymdVar3 = (ymd) this.f51339f.get(num7);
                                                                        lda.m16130p(ymdVar3);
                                                                        lfc lfcVarM25205b2 = ymdVar3.m25205b(iIntValue4);
                                                                        arrayList2.add(lfcVarM25205b2);
                                                                        nnbVarM5920g1 = c1045d.m5920g0();
                                                                        kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
                                                                        str8 = this.f51337d;
                                                                        mkc mkcVarM16172u2 = lfcVarM25205b2.m16172u();
                                                                        nnbVarM5920g1.m13144E();
                                                                        nnbVarM5920g1.mo12359D();
                                                                        lda.m16127m(str8);
                                                                        lda.m16130p(mkcVarM16172u2);
                                                                        byte[] bArrM3725a2 = mkcVarM16172u2.m3725a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrM3725a2);
                                                                        if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objM24449L = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.mo5909b().m24452H().m17925c("Database error querying filter results. appId", xcc.m24449L(r21), e);
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objM24449L;
                                                            r21 = r21;
                                                            r17.mo5909b().m24452H().m17925c("Database error querying filter results. appId", xcc.m24449L(r21), e);
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                kjcVar = kjcVar6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.f51337d;
                                                                    nnbVarM5920g0 = c1045d.m5920g0();
                                                                    str6 = this.f51337d;
                                                                    nnbVarM5920g0.m13144E();
                                                                    nnbVarM5920g0.mo12359D();
                                                                    lda.m16127m(str6);
                                                                    c3275kv3 = new C3275kv();
                                                                    cursorRawQuery = nnbVarM5920g0.m17559u0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c3275kv3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c3275kv3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c3275kv3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = c3275kv3;
                                                                    lda.m16127m(str110);
                                                                    c3275kv4 = new C3275kv();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            mkcVar3 = (mkc) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            kjcVar2 = kjcVar6;
                                                                            c3275kv4.put(num, mkcVar3);
                                                                            r0 = r18;
                                                                            it2 = it3;
                                                                            str15 = str15;
                                                                            kjcVar6 = kjcVar2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    kjcVar = kjcVar6;
                                                                    map3 = c3275kv4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    kjcVar = kjcVar6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    mkcVar = (mkc) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c3275kv = new C3275kv();
                                                                    if (mkcVar != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (fhcVar.m11832s()) {
                                                                                mkc mkcVar9 = mkcVar;
                                                                                Integer numValueOf11 = Integer.valueOf(fhcVar.m11833t());
                                                                                if (fhcVar.m11834u()) {
                                                                                    lValueOf = Long.valueOf(fhcVar.m11835v());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c3275kv.put(numValueOf11, lValueOf);
                                                                                mkcVar = mkcVar9;
                                                                            }
                                                                        }
                                                                    }
                                                                    mkcVar2 = mkcVar;
                                                                    c3275kv2 = new C3275kv();
                                                                    if (mkcVar2 != null) {
                                                                        it = mkcVar2.m16901y().iterator();
                                                                        while (it.hasNext()) {
                                                                            wkcVar = (wkc) it.next();
                                                                            if (!wkcVar.m24032s()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (mkcVar2 != null) {
                                                                        i = 0;
                                                                        while (i < mkcVar2.m16896t() * 64) {
                                                                            if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                                                                                z4 = zM4869O;
                                                                                kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                bitSet2.set(i);
                                                                                if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM4869O = z4;
                                                                            } else {
                                                                                z4 = zM4869O;
                                                                            }
                                                                            c3275kv.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM4869O = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zM4869O;
                                                                    mkc mkcVar10 = (mkc) map4.get(num4);
                                                                    if (zM4869O2) {
                                                                        while (r2.hasNext()) {
                                                                            int iM14869t4 = k5cVar2.m14869t();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f51341h.longValue() / 1000;
                                                                            if (k5cVar2.m14863B()) {
                                                                                jLongValue = this.f51340g.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iM14869t4);
                                                                            if (c3275kv.containsKey(numValueOf)) {
                                                                                c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c3275kv2.containsKey(numValueOf)) {
                                                                                c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar10, bitSet, bitSet2, c3275kv, c3275kv2));
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str2 = str2;
                                                                    zM4869O = z8;
                                                                    map5 = map16;
                                                                    map4 = map4;
                                                                    zM4869O2 = zM4869O2;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                xo2Var = new xo2(this);
                                                                c3275kv6 = new C3275kv();
                                                                while (r17.hasNext()) {
                                                                    ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                                                                    if (ohcVarM24623a != null) {
                                                                        zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                                                                        c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                                                                        if (z) {
                                                                            j = zobVarM17553n0.f71914c;
                                                                            strM18026x = ohcVarM24623a.m18026x();
                                                                            map8 = (Map) c3275kv6.get(strM18026x);
                                                                            if (map8 == null) {
                                                                                nnb nnbVarM5920g9 = c1045d.m5920g0();
                                                                                kjc kjcVar10 = (kjc) nnbVarM5920g9.f60774a;
                                                                                str11 = this.f51337d;
                                                                                nnbVarM5920g9.m13144E();
                                                                                nnbVarM5920g9.mo12359D();
                                                                                lda.m16127m(str11);
                                                                                lda.m16127m(strM18026x);
                                                                                c3275kv7 = new C3275kv();
                                                                                Query = nnbVarM5920g9.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        k5c k5cVar8 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c3275kv7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c3275kv7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(k5cVar8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = c3275kv7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                c3275kv6.put(strM18026x, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r18.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f51338e.contains(num6)) {
                                                                                    kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zM19118a = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            xo2Var2 = xo2Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        k5c k5cVar9 = (k5c) it8.next();
                                                                                        xo2Var2 = xo2Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar9, 0);
                                                                                        Long l9 = this.f51340g;
                                                                                        Long l10 = this.f51341h;
                                                                                        iM14869t = k5cVar9.m14869t();
                                                                                        ymdVar = (ymd) this.f51339f.get(num3);
                                                                                        if (ymdVar == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = ymdVar.m25206c().get(iM14869t);
                                                                                        }
                                                                                        zM19118a = pfbVar2.m19118a(l9, l10, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                                                        if (!zM19118a) {
                                                                                            this.f51338e.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        m16837I(num3).m25204a(pfbVar2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        xo2Var = xo2Var2;
                                                                                    }
                                                                                    if (!zM19118a) {
                                                                                        this.f51338e.add(num3);
                                                                                    }
                                                                                    xo2Var = xo2Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C3275kv c3275kv12 = new C3275kv();
                                                                it4 = list2.iterator();
                                                                l79Var = c3275kv12;
                                                                while (it4.hasNext()) {
                                                                    jmc jmcVar3 = (jmc) it4.next();
                                                                    strM14550u = jmcVar3.m14550u();
                                                                    map6 = (Map) l79Var.get(strM14550u);
                                                                    if (map6 == null) {
                                                                        nnb nnbVarM5920g10 = c1045d.m5920g0();
                                                                        kjcVar4 = (kjc) nnbVarM5920g10.f60774a;
                                                                        str9 = this.f51337d;
                                                                        nnbVarM5920g10.m13144E();
                                                                        nnbVarM5920g10.mo12359D();
                                                                        lda.m16127m(str9);
                                                                        lda.m16127m(strM14550u);
                                                                        c3275kv5 = new C3275kv();
                                                                        cursorQuery2 = nnbVarM5920g10.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                f7c f7cVar4 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c3275kv5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    kjcVar5 = kjcVar4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c3275kv5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    kjcVar5 = kjcVar4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(f7cVar4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                kjcVar4 = kjcVar5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c3275kv5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        l79Var.put(strM14550u, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    l79Var2 = l79Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f51338e.contains(num2)) {
                                                                            kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zM19119b = true;
                                                                        l79Var3 = l79Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                f7cVar = (f7c) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                                    occ occVarM24455K5 = kjcVar.mo5909b().m24455K();
                                                                                    if (f7cVar.m11582s()) {
                                                                                        numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    occVarM24455K5.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                                    kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                                }
                                                                                if (f7cVar.m11582s()) {
                                                                                }
                                                                                occ occVarM24453I5 = kjcVar.mo5909b().m24453I();
                                                                                scc sccVarM24449L5 = xcc.m24449L(this.f51337d);
                                                                                if (f7cVar.m11582s()) {
                                                                                    numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                occVarM24453I5.m17925c("Invalid property filter ID. appId, id", sccVarM24449L5, String.valueOf(numValueOf3));
                                                                                this.f51338e.add(num2);
                                                                                map6 = map7;
                                                                                l79Var2 = l79Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                l79Var3 = l79Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zM19119b) {
                                                                                this.f51338e.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            l79Var2 = l79Var3;
                                                                            it6 = it6;
                                                                            m16837I(num2).m25204a(pfbVar);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            l79Var3 = l79Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    l79Var = l79Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C3089hv<Integer> c3089hv3 = (C3089hv) this.f51339f.keySet();
                                                            c3089hv3.removeAll(this.f51338e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                ymd ymdVar4 = (ymd) this.f51339f.get(num7);
                                                                lda.m16130p(ymdVar4);
                                                                lfc lfcVarM25205b3 = ymdVar4.m25205b(iIntValue5);
                                                                arrayList2.add(lfcVarM25205b3);
                                                                nnbVarM5920g1 = c1045d.m5920g0();
                                                                kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
                                                                str8 = this.f51337d;
                                                                mkc mkcVarM16172u3 = lfcVarM25205b3.m16172u();
                                                                nnbVarM5920g1.m13144E();
                                                                nnbVarM5920g1.mo12359D();
                                                                lda.m16127m(str8);
                                                                lda.m16130p(mkcVarM16172u3);
                                                                byte[] bArrM3725a3 = mkcVarM16172u3.m3725a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrM3725a3);
                                                                if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = c3275kv8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    kjcVar = kjcVar6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.f51337d;
                                                        nnbVarM5920g0 = c1045d.m5920g0();
                                                        str6 = this.f51337d;
                                                        nnbVarM5920g0.m13144E();
                                                        nnbVarM5920g0.mo12359D();
                                                        lda.m16127m(str6);
                                                        c3275kv3 = new C3275kv();
                                                        cursorRawQuery = nnbVarM5920g0.m17559u0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c3275kv3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c3275kv3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c3275kv3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c3275kv3;
                                                        lda.m16127m(str112);
                                                        c3275kv4 = new C3275kv();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                mkcVar3 = (mkc) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                kjcVar2 = kjcVar6;
                                                                c3275kv4.put(num, mkcVar3);
                                                                r0 = r18;
                                                                it2 = it3;
                                                                str15 = str15;
                                                                kjcVar6 = kjcVar2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        kjcVar = kjcVar6;
                                                        map3 = c3275kv4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        kjcVar = kjcVar6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        mkcVar = (mkc) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c3275kv = new C3275kv();
                                                        if (mkcVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (fhcVar.m11832s()) {
                                                                    mkc mkcVar11 = mkcVar;
                                                                    Integer numValueOf12 = Integer.valueOf(fhcVar.m11833t());
                                                                    if (fhcVar.m11834u()) {
                                                                        lValueOf = Long.valueOf(fhcVar.m11835v());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c3275kv.put(numValueOf12, lValueOf);
                                                                    mkcVar = mkcVar11;
                                                                }
                                                            }
                                                        }
                                                        mkcVar2 = mkcVar;
                                                        c3275kv2 = new C3275kv();
                                                        if (mkcVar2 != null) {
                                                            it = mkcVar2.m16901y().iterator();
                                                            while (it.hasNext()) {
                                                                wkcVar = (wkc) it.next();
                                                                if (!wkcVar.m24032s()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (mkcVar2 != null) {
                                                            i = 0;
                                                            while (i < mkcVar2.m16896t() * 64) {
                                                                if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                                                                    z4 = zM4869O;
                                                                    kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                    bitSet2.set(i);
                                                                    if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zM4869O = z4;
                                                                } else {
                                                                    z4 = zM4869O;
                                                                }
                                                                c3275kv.remove(Integer.valueOf(i));
                                                                i++;
                                                                zM4869O = z4;
                                                            }
                                                        }
                                                        boolean z9 = zM4869O;
                                                        mkc mkcVar12 = (mkc) map4.get(num4);
                                                        if (zM4869O2) {
                                                            while (r2.hasNext()) {
                                                                int iM14869t5 = k5cVar2.m14869t();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f51341h.longValue() / 1000;
                                                                if (k5cVar2.m14863B()) {
                                                                    jLongValue = this.f51340g.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iM14869t5);
                                                                if (c3275kv.containsKey(numValueOf)) {
                                                                    c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c3275kv2.containsKey(numValueOf)) {
                                                                    c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar12, bitSet, bitSet2, c3275kv, c3275kv2));
                                                        obj2 = obj2;
                                                        map = map;
                                                        str2 = str2;
                                                        zM4869O = z9;
                                                        map5 = map18;
                                                        map4 = map4;
                                                        zM4869O2 = zM4869O2;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    xo2Var = new xo2(this);
                                                    c3275kv6 = new C3275kv();
                                                    while (r17.hasNext()) {
                                                        ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                                                        if (ohcVarM24623a != null) {
                                                            zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                                                            c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                                                            if (z) {
                                                                j = zobVarM17553n0.f71914c;
                                                                strM18026x = ohcVarM24623a.m18026x();
                                                                map8 = (Map) c3275kv6.get(strM18026x);
                                                                if (map8 == null) {
                                                                    nnb nnbVarM5920g11 = c1045d.m5920g0();
                                                                    kjc kjcVar11 = (kjc) nnbVarM5920g11.f60774a;
                                                                    str11 = this.f51337d;
                                                                    nnbVarM5920g11.m13144E();
                                                                    nnbVarM5920g11.mo12359D();
                                                                    lda.m16127m(str11);
                                                                    lda.m16127m(strM18026x);
                                                                    c3275kv7 = new C3275kv();
                                                                    Query = nnbVarM5920g11.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            k5c k5cVar10 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c3275kv7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c3275kv7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(k5cVar10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = c3275kv7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    c3275kv6.put(strM18026x, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r18.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f51338e.contains(num6)) {
                                                                        kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zM19118a = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                xo2Var2 = xo2Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            k5c k5cVar11 = (k5c) it8.next();
                                                                            xo2Var2 = xo2Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar11, 0);
                                                                            Long l11 = this.f51340g;
                                                                            Long l12 = this.f51341h;
                                                                            iM14869t = k5cVar11.m14869t();
                                                                            ymdVar = (ymd) this.f51339f.get(num3);
                                                                            if (ymdVar == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = ymdVar.m25206c().get(iM14869t);
                                                                            }
                                                                            zM19118a = pfbVar2.m19118a(l11, l12, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                                            if (!zM19118a) {
                                                                                this.f51338e.add(num3);
                                                                                break;
                                                                            }
                                                                            m16837I(num3).m25204a(pfbVar2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            xo2Var = xo2Var2;
                                                                        }
                                                                        if (!zM19118a) {
                                                                            this.f51338e.add(num3);
                                                                        }
                                                                        xo2Var = xo2Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C3275kv c3275kv13 = new C3275kv();
                                                    it4 = list2.iterator();
                                                    l79Var = c3275kv13;
                                                    while (it4.hasNext()) {
                                                        jmc jmcVar4 = (jmc) it4.next();
                                                        strM14550u = jmcVar4.m14550u();
                                                        map6 = (Map) l79Var.get(strM14550u);
                                                        if (map6 == null) {
                                                            nnb nnbVarM5920g12 = c1045d.m5920g0();
                                                            kjcVar4 = (kjc) nnbVarM5920g12.f60774a;
                                                            str9 = this.f51337d;
                                                            nnbVarM5920g12.m13144E();
                                                            nnbVarM5920g12.mo12359D();
                                                            lda.m16127m(str9);
                                                            lda.m16127m(strM14550u);
                                                            c3275kv5 = new C3275kv();
                                                            cursorQuery2 = nnbVarM5920g12.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    f7c f7cVar5 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c3275kv5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        kjcVar5 = kjcVar4;
                                                                        arrayList3 = new ArrayList();
                                                                        c3275kv5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        kjcVar5 = kjcVar4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(f7cVar5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    kjcVar4 = kjcVar5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c3275kv5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            l79Var.put(strM14550u, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        l79Var2 = l79Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f51338e.contains(num2)) {
                                                                kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zM19119b = true;
                                                            l79Var3 = l79Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    f7cVar = (f7c) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                                        occ occVarM24455K6 = kjcVar.mo5909b().m24455K();
                                                                        if (f7cVar.m11582s()) {
                                                                            numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        occVarM24455K6.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                                        kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                                                    }
                                                                    if (f7cVar.m11582s()) {
                                                                    }
                                                                    occ occVarM24453I6 = kjcVar.mo5909b().m24453I();
                                                                    scc sccVarM24449L6 = xcc.m24449L(this.f51337d);
                                                                    if (f7cVar.m11582s()) {
                                                                        numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    occVarM24453I6.m17925c("Invalid property filter ID. appId, id", sccVarM24449L6, String.valueOf(numValueOf3));
                                                                    this.f51338e.add(num2);
                                                                    map6 = map7;
                                                                    l79Var2 = l79Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    l79Var3 = l79Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zM19119b) {
                                                                    this.f51338e.add(num2);
                                                                }
                                                                map6 = map7;
                                                                l79Var2 = l79Var3;
                                                                it6 = it6;
                                                                m16837I(num2).m25204a(pfbVar);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                l79Var3 = l79Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        l79Var = l79Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C3089hv<Integer> c3089hv4 = (C3089hv) this.f51339f.keySet();
                                                c3089hv4.removeAll(this.f51338e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    ymd ymdVar5 = (ymd) this.f51339f.get(num7);
                                                    lda.m16130p(ymdVar5);
                                                    lfc lfcVarM25205b4 = ymdVar5.m25205b(iIntValue6);
                                                    arrayList2.add(lfcVarM25205b4);
                                                    nnbVarM5920g1 = c1045d.m5920g0();
                                                    kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
                                                    str8 = this.f51337d;
                                                    mkc mkcVarM16172u4 = lfcVarM25205b4.m16172u();
                                                    nnbVarM5920g1.m13144E();
                                                    nnbVarM5920g1.mo12359D();
                                                    lda.m16127m(str8);
                                                    lda.m16130p(mkcVarM16172u4);
                                                    byte[] bArrM3725a4 = mkcVarM16172u4.m3725a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrM3725a4);
                                                    if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c3275kv9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        nnb nnbVarM5920g13 = c1045d.m5920g0();
                        obj = (kjc) nnbVarM5920g13.f60774a;
                        r5 = this.f51337d;
                        nnbVarM5920g13.m13144E();
                        nnbVarM5920g13.mo12359D();
                        lda.m16127m(r5);
                        cursorQuery = nnbVarM5920g13.m17559u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            c3275kv8 = new C3275kv();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                mkc mkcVar13 = (mkc) ((ikc) dad.m10238o0(mkc.m16884A(), cursorQuery.getBlob(1))).m22741d();
                                Object objValueOf2 = Integer.valueOf(i3);
                                c3275kv8.put(objValueOf2, mkcVar13);
                                str3 = str14;
                                obj2 = objM24449L;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objM24449L = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = c3275kv8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            kjcVar = kjcVar6;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str114 = this.f51337d;
                                nnbVarM5920g0 = c1045d.m5920g0();
                                str6 = this.f51337d;
                                nnbVarM5920g0.m13144E();
                                nnbVarM5920g0.mo12359D();
                                lda.m16127m(str6);
                                c3275kv3 = new C3275kv();
                                cursorRawQuery = nnbVarM5920g0.m17559u0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c3275kv3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c3275kv3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c3275kv3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = c3275kv3;
                                lda.m16127m(str114);
                                c3275kv4 = new C3275kv();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        mkcVar3 = (mkc) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            kjcVar2 = kjcVar6;
                                            c3275kv4.put(num, mkcVar3);
                                            r0 = r18;
                                            it2 = it3;
                                            str15 = str15;
                                            kjcVar6 = kjcVar2;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listM10253k0 = c1045d.m5926j0().m10253k0((lib) mkcVar3.m16897u(), list4);
                                            if (listM10253k0.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                ikc ikcVar = (ikc) mkcVar3.m23966j();
                                                ikcVar.m14005j();
                                                ikcVar.m14004i(listM10253k0);
                                                List listM10253k1 = c1045d.m5926j0().m10253k0((lib) mkcVar3.m16895s(), list4);
                                                ikcVar.m14003h();
                                                ikcVar.m14002g(listM10253k1);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = mkcVar3.m16899w().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    fhc fhcVar2 = (fhc) it10.next();
                                                    kjc kjcVar12 = kjcVar6;
                                                    if (!list4.contains(Integer.valueOf(fhcVar2.m11833t()))) {
                                                        arrayList6.add(fhcVar2);
                                                    }
                                                    it10 = it11;
                                                    kjcVar6 = kjcVar12;
                                                }
                                                kjcVar2 = kjcVar6;
                                                ikcVar.m14007l();
                                                ikcVar.m14006k(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (wkc wkcVar2 : mkcVar3.m16901y()) {
                                                    if (!list4.contains(Integer.valueOf(wkcVar2.m24033t()))) {
                                                        arrayList7.add(wkcVar2);
                                                    }
                                                }
                                                ikcVar.m14009o();
                                                ikcVar.m14008m(arrayList7);
                                                c3275kv4.put(num, (mkc) ikcVar.m22741d());
                                                r18 = r112;
                                                r0 = r18;
                                                it2 = it3;
                                                str15 = str15;
                                                kjcVar6 = kjcVar2;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                kjcVar = kjcVar6;
                                map3 = c3275kv4;
                            } else {
                                str4 = "audience_id";
                                kjcVar = kjcVar6;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                mkcVar = (mkc) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c3275kv = new C3275kv();
                                if (mkcVar != null && mkcVar.m16900x() != 0) {
                                    while (r3.hasNext()) {
                                        if (fhcVar.m11832s()) {
                                            mkc mkcVar14 = mkcVar;
                                            Integer numValueOf13 = Integer.valueOf(fhcVar.m11833t());
                                            if (fhcVar.m11834u()) {
                                                lValueOf = Long.valueOf(fhcVar.m11835v());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c3275kv.put(numValueOf13, lValueOf);
                                            mkcVar = mkcVar14;
                                        }
                                    }
                                }
                                mkcVar2 = mkcVar;
                                c3275kv2 = new C3275kv();
                                if (mkcVar2 != null && mkcVar2.m16902z() != 0) {
                                    it = mkcVar2.m16901y().iterator();
                                    while (it.hasNext()) {
                                        wkcVar = (wkc) it.next();
                                        if (!wkcVar.m24032s() && wkcVar.m24035v() > 0) {
                                            c3275kv2.put(Integer.valueOf(wkcVar.m24033t()), Long.valueOf(wkcVar.m24036w(wkcVar.m24035v() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (mkcVar2 != null) {
                                    i = 0;
                                    while (i < mkcVar2.m16896t() * 64) {
                                        if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                                            z4 = zM4869O;
                                            kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                            bitSet2.set(i);
                                            if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zM4869O = z4;
                                        } else {
                                            z4 = zM4869O;
                                        }
                                        c3275kv.remove(Integer.valueOf(i));
                                        i++;
                                        zM4869O = z4;
                                    }
                                }
                                boolean z10 = zM4869O;
                                mkc mkcVar15 = (mkc) map4.get(num4);
                                if (zM4869O2 && z10 && (list3 = (List) map.get(num4)) != null && this.f51341h != null && this.f51340g != null) {
                                    while (r2.hasNext()) {
                                        int iM14869t6 = k5cVar2.m14869t();
                                        Integer num11 = num4;
                                        jLongValue = this.f51341h.longValue() / 1000;
                                        if (k5cVar2.m14863B()) {
                                            jLongValue = this.f51340g.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iM14869t6);
                                        if (c3275kv.containsKey(numValueOf)) {
                                            c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (c3275kv2.containsKey(numValueOf)) {
                                            c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar15, bitSet, bitSet2, c3275kv, c3275kv2));
                                obj2 = obj2;
                                map = map;
                                str2 = str2;
                                zM4869O = z10;
                                map5 = map110;
                                map4 = map4;
                                zM4869O2 = zM4869O2;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r14 = obj2;
                        if (!list.isEmpty()) {
                            xo2Var = new xo2(this);
                            c3275kv6 = new C3275kv();
                            while (r17.hasNext()) {
                                ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                                if (ohcVarM24623a != null) {
                                    zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                                    c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                                    if (z) {
                                        j = zobVarM17553n0.f71914c;
                                        strM18026x = ohcVarM24623a.m18026x();
                                        map8 = (Map) c3275kv6.get(strM18026x);
                                        if (map8 == null) {
                                            nnb nnbVarM5920g14 = c1045d.m5920g0();
                                            kjc kjcVar13 = (kjc) nnbVarM5920g14.f60774a;
                                            str11 = this.f51337d;
                                            nnbVarM5920g14.m13144E();
                                            nnbVarM5920g14.mo12359D();
                                            lda.m16127m(str11);
                                            lda.m16127m(strM18026x);
                                            c3275kv7 = new C3275kv();
                                            Query = nnbVarM5920g14.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    k5c k5cVar12 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) c3275kv7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        c3275kv7.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(k5cVar12);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = c3275kv7;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            c3275kv6.put(strM18026x, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r18.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.f51338e.contains(num6)) {
                                                kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zM19118a = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        xo2Var2 = xo2Var;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    k5c k5cVar13 = (k5c) it8.next();
                                                    xo2Var2 = xo2Var;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar13, 0);
                                                    Long l13 = this.f51340g;
                                                    Long l14 = this.f51341h;
                                                    iM14869t = k5cVar13.m14869t();
                                                    ymdVar = (ymd) this.f51339f.get(num3);
                                                    if (ymdVar == null) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = ymdVar.m25206c().get(iM14869t);
                                                    }
                                                    zM19118a = pfbVar2.m19118a(l13, l14, ohcVarM24623a, j, zobVarM17553n0, z5);
                                                    if (!zM19118a) {
                                                        this.f51338e.add(num3);
                                                        break;
                                                    }
                                                    m16837I(num3).m25204a(pfbVar2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    xo2Var = xo2Var2;
                                                }
                                                if (!zM19118a) {
                                                    this.f51338e.add(num3);
                                                }
                                                xo2Var = xo2Var2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            C3275kv c3275kv14 = new C3275kv();
                            it4 = list2.iterator();
                            l79Var = c3275kv14;
                            while (it4.hasNext()) {
                                jmc jmcVar5 = (jmc) it4.next();
                                strM14550u = jmcVar5.m14550u();
                                map6 = (Map) l79Var.get(strM14550u);
                                if (map6 == null) {
                                    nnb nnbVarM5920g15 = c1045d.m5920g0();
                                    kjcVar4 = (kjc) nnbVarM5920g15.f60774a;
                                    str9 = this.f51337d;
                                    nnbVarM5920g15.m13144E();
                                    nnbVarM5920g15.mo12359D();
                                    lda.m16127m(str9);
                                    lda.m16127m(strM14550u);
                                    c3275kv5 = new C3275kv();
                                    cursorQuery2 = nnbVarM5920g15.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            f7c f7cVar6 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c3275kv5.get(numValueOf5);
                                            if (list5 == null) {
                                                kjcVar5 = kjcVar4;
                                                arrayList3 = new ArrayList();
                                                c3275kv5.put(numValueOf5, arrayList3);
                                            } else {
                                                kjcVar5 = kjcVar4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(f7cVar6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            kjcVar4 = kjcVar5;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = c3275kv5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    l79Var.put(strM14550u, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                l79Var2 = l79Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.f51338e.contains(num2)) {
                                        kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zM19119b = true;
                                    l79Var3 = l79Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            f7cVar = (f7c) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                                occ occVarM24455K7 = kjcVar.mo5909b().m24455K();
                                                if (f7cVar.m11582s()) {
                                                    numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                occVarM24455K7.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                                kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                                            }
                                            if (f7cVar.m11582s() || f7cVar.m11583t() > 256) {
                                                occ occVarM24453I7 = kjcVar.mo5909b().m24453I();
                                                scc sccVarM24449L7 = xcc.m24449L(this.f51337d);
                                                if (f7cVar.m11582s()) {
                                                    numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                occVarM24453I7.m17925c("Invalid property filter ID. appId, id", sccVarM24449L7, String.valueOf(numValueOf3));
                                                this.f51338e.add(num2);
                                                map6 = map7;
                                                l79Var2 = l79Var3;
                                                it6 = it6;
                                            } else {
                                                i2 = iIntValue;
                                                pfbVar = new pfb(this, this.f51337d, i2, f7cVar, 1);
                                                Long l15 = this.f51340g;
                                                Long l16 = this.f51341h;
                                                int iM11583t = f7cVar.m11583t();
                                                ymd ymdVar6 = (ymd) this.f51339f.get(num2);
                                                zM19119b = pfbVar.m19119b(l15, l16, jmcVar5, ymdVar6 == null ? false : ymdVar6.m25206c().get(iM11583t));
                                                if (zM19119b) {
                                                    m16837I(num2).m25204a(pfbVar);
                                                    iIntValue = i2;
                                                    map6 = map7;
                                                    l79Var3 = l79Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.f51338e.add(num2);
                                                    l79Var3 = l79Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            l79Var3 = l79Var3;
                                            it6 = it6;
                                        }
                                        if (!zM19119b) {
                                            this.f51338e.add(num2);
                                        }
                                        map6 = map7;
                                        l79Var2 = l79Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                l79Var = l79Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        C3089hv<Integer> c3089hv5 = (C3089hv) this.f51339f.keySet();
                        c3089hv5.removeAll(this.f51338e);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            ymd ymdVar7 = (ymd) this.f51339f.get(num7);
                            lda.m16130p(ymdVar7);
                            lfc lfcVarM25205b5 = ymdVar7.m25205b(iIntValue7);
                            arrayList2.add(lfcVarM25205b5);
                            nnbVarM5920g1 = c1045d.m5920g0();
                            kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
                            str8 = this.f51337d;
                            mkc mkcVarM16172u5 = lfcVarM25205b5.m16172u();
                            nnbVarM5920g1.m13144E();
                            nnbVarM5920g1.mo12359D();
                            lda.m16127m(str8);
                            lda.m16130p(mkcVarM16172u5);
                            byte[] bArrM3725a5 = mkcVarM16172u5.m3725a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrM3725a5);
                            if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        c3275kv8 = new C3275kv();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            mkc mkcVar16 = (mkc) ((ikc) dad.m10238o0(mkc.m16884A(), cursorQuery.getBlob(1))).m22741d();
                            Object objValueOf3 = Integer.valueOf(i3);
                            c3275kv8.put(objValueOf3, mkcVar16);
                            str3 = str14;
                            obj2 = objM24449L;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objM24449L = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = c3275kv8;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r17 = obj;
                    r21 = r5;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = nnbVarM5920g13.m17559u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        nnb nnbVarM5920g16 = c1045d.m5920g0();
        obj = (kjc) nnbVarM5920g16.f60774a;
        r5 = this.f51337d;
        nnbVarM5920g16.m13144E();
        nnbVarM5920g16.mo12359D();
        lda.m16127m(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            kjcVar = kjcVar6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.f51337d;
                nnbVarM5920g0 = c1045d.m5920g0();
                str6 = this.f51337d;
                nnbVarM5920g0.m13144E();
                nnbVarM5920g0.mo12359D();
                lda.m16127m(str6);
                c3275kv3 = new C3275kv();
                cursorRawQuery = nnbVarM5920g0.m17559u0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c3275kv3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c3275kv3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c3275kv3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c3275kv3;
                lda.m16127m(str116);
                c3275kv4 = new C3275kv();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        mkcVar3 = (mkc) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        kjcVar2 = kjcVar6;
                        c3275kv4.put(num, mkcVar3);
                        r0 = r18;
                        it2 = it3;
                        str15 = str15;
                        kjcVar6 = kjcVar2;
                    }
                }
                str4 = str15;
                kjcVar = kjcVar6;
                map3 = c3275kv4;
            } else {
                str4 = "audience_id";
                kjcVar = kjcVar6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                mkcVar = (mkc) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c3275kv = new C3275kv();
                if (mkcVar != null) {
                    while (r3.hasNext()) {
                        if (fhcVar.m11832s()) {
                            mkc mkcVar17 = mkcVar;
                            Integer numValueOf14 = Integer.valueOf(fhcVar.m11833t());
                            if (fhcVar.m11834u()) {
                                lValueOf = Long.valueOf(fhcVar.m11835v());
                            } else {
                                lValueOf = null;
                            }
                            c3275kv.put(numValueOf14, lValueOf);
                            mkcVar = mkcVar17;
                        }
                    }
                }
                mkcVar2 = mkcVar;
                c3275kv2 = new C3275kv();
                if (mkcVar2 != null) {
                    it = mkcVar2.m16901y().iterator();
                    while (it.hasNext()) {
                        wkcVar = (wkc) it.next();
                        if (!wkcVar.m24032s()) {
                        }
                    }
                }
                Map map112 = map5;
                if (mkcVar2 != null) {
                    i = 0;
                    while (i < mkcVar2.m16896t() * 64) {
                        if (dad.m10236i0((lib) mkcVar2.m16895s(), i)) {
                            z4 = zM4869O;
                            kjcVar.mo5909b().m24455K().m17925c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (dad.m10236i0((lib) mkcVar2.m16897u(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zM4869O = z4;
                        } else {
                            z4 = zM4869O;
                        }
                        c3275kv.remove(Integer.valueOf(i));
                        i++;
                        zM4869O = z4;
                    }
                }
                boolean z11 = zM4869O;
                mkc mkcVar18 = (mkc) map4.get(num4);
                if (zM4869O2) {
                    while (r2.hasNext()) {
                        int iM14869t7 = k5cVar2.m14869t();
                        Integer num12 = num4;
                        jLongValue = this.f51341h.longValue() / 1000;
                        if (k5cVar2.m14863B()) {
                            jLongValue = this.f51340g.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iM14869t7);
                        if (c3275kv.containsKey(numValueOf)) {
                            c3275kv.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c3275kv2.containsKey(numValueOf)) {
                            c3275kv2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f51339f.put(num4, new ymd(this, this.f51337d, mkcVar18, bitSet, bitSet2, c3275kv, c3275kv2));
                obj2 = obj2;
                map = map;
                str2 = str2;
                zM4869O = z11;
                map5 = map112;
                map4 = map4;
                zM4869O2 = zM4869O2;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            xo2Var = new xo2(this);
            c3275kv6 = new C3275kv();
            while (r17.hasNext()) {
                ohcVarM24623a = xo2Var.m24623a(this.f51337d, ohcVar);
                if (ohcVarM24623a != null) {
                    zobVarM17553n0 = c1045d.m5920g0().m17553n0(this.f51337d, ohcVar, ohcVarM24623a.m18026x());
                    c1045d.m5920g0().m17545e0("events", zobVarM17553n0);
                    if (z) {
                        j = zobVarM17553n0.f71914c;
                        strM18026x = ohcVarM24623a.m18026x();
                        map8 = (Map) c3275kv6.get(strM18026x);
                        if (map8 == null) {
                            nnb nnbVarM5920g17 = c1045d.m5920g0();
                            kjc kjcVar14 = (kjc) nnbVarM5920g17.f60774a;
                            str11 = this.f51337d;
                            nnbVarM5920g17.m13144E();
                            nnbVarM5920g17.mo12359D();
                            lda.m16127m(str11);
                            lda.m16127m(strM18026x);
                            c3275kv7 = new C3275kv();
                            Query = nnbVarM5920g17.m17559u0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM18026x}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    k5c k5cVar14 = (k5c) ((d5c) dad.m10238o0(k5c.m14861E(), Query.getBlob(1))).m22741d();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c3275kv7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        c3275kv7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(k5cVar14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = c3275kv7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            c3275kv6.put(strM18026x, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r18.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f51338e.contains(num6)) {
                                kjcVar.mo5909b().m24455K().m17924b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zM19118a = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        xo2Var2 = xo2Var;
                                        num3 = num6;
                                        break;
                                    }
                                    k5c k5cVar15 = (k5c) it8.next();
                                    xo2Var2 = xo2Var;
                                    num3 = num6;
                                    map9 = map8;
                                    pfbVar2 = new pfb(this, this.f51337d, iIntValue2, k5cVar15, 0);
                                    Long l17 = this.f51340g;
                                    Long l18 = this.f51341h;
                                    iM14869t = k5cVar15.m14869t();
                                    ymdVar = (ymd) this.f51339f.get(num3);
                                    if (ymdVar == null) {
                                        z5 = false;
                                    } else {
                                        z5 = ymdVar.m25206c().get(iM14869t);
                                    }
                                    zM19118a = pfbVar2.m19118a(l17, l18, ohcVarM24623a, j, zobVarM17553n0, z5);
                                    if (!zM19118a) {
                                        this.f51338e.add(num3);
                                        break;
                                    }
                                    m16837I(num3).m25204a(pfbVar2);
                                    num6 = num3;
                                    map8 = map9;
                                    xo2Var = xo2Var2;
                                }
                                if (!zM19118a) {
                                    this.f51338e.add(num3);
                                }
                                xo2Var = xo2Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C3275kv c3275kv15 = new C3275kv();
            it4 = list2.iterator();
            l79Var = c3275kv15;
            while (it4.hasNext()) {
                jmc jmcVar6 = (jmc) it4.next();
                strM14550u = jmcVar6.m14550u();
                map6 = (Map) l79Var.get(strM14550u);
                if (map6 == null) {
                    nnb nnbVarM5920g18 = c1045d.m5920g0();
                    kjcVar4 = (kjc) nnbVarM5920g18.f60774a;
                    str9 = this.f51337d;
                    nnbVarM5920g18.m13144E();
                    nnbVarM5920g18.mo12359D();
                    lda.m16127m(str9);
                    lda.m16127m(strM14550u);
                    c3275kv5 = new C3275kv();
                    cursorQuery2 = nnbVarM5920g18.m17559u0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM14550u}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            f7c f7cVar7 = (f7c) ((a7c) dad.m10238o0(f7c.m11580A(), cursorQuery2.getBlob(1))).m22741d();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c3275kv5.get(numValueOf5);
                            if (list5 == null) {
                                kjcVar5 = kjcVar4;
                                arrayList3 = new ArrayList();
                                c3275kv5.put(numValueOf5, arrayList3);
                            } else {
                                kjcVar5 = kjcVar4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(f7cVar7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            kjcVar4 = kjcVar5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = c3275kv5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    l79Var.put(strM14550u, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                l79Var2 = l79Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f51338e.contains(num2)) {
                        kjcVar.mo5909b().m24455K().m17924b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zM19119b = true;
                    l79Var3 = l79Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            f7cVar = (f7c) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(kjcVar.mo5909b().m24457N(), 2)) {
                                occ occVarM24455K8 = kjcVar.mo5909b().m24455K();
                                if (f7cVar.m11582s()) {
                                    numValueOf4 = Integer.valueOf(f7cVar.m11583t());
                                } else {
                                    numValueOf4 = null;
                                }
                                occVarM24455K8.m17926d("Evaluating filter. audience, filter, property", num2, numValueOf4, kjcVar.m15285m().m20574c(f7cVar.m11584u()));
                                kjcVar.mo5909b().m24455K().m17924b(c1045d.m5926j0().m10251f0(f7cVar), "Filter definition");
                            }
                            if (f7cVar.m11582s()) {
                            }
                            occ occVarM24453I8 = kjcVar.mo5909b().m24453I();
                            scc sccVarM24449L8 = xcc.m24449L(this.f51337d);
                            if (f7cVar.m11582s()) {
                                numValueOf3 = Integer.valueOf(f7cVar.m11583t());
                            } else {
                                numValueOf3 = null;
                            }
                            occVarM24453I8.m17925c("Invalid property filter ID. appId, id", sccVarM24449L8, String.valueOf(numValueOf3));
                            this.f51338e.add(num2);
                            map6 = map7;
                            l79Var2 = l79Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            l79Var3 = l79Var3;
                            it6 = it6;
                        }
                        if (!zM19119b) {
                            this.f51338e.add(num2);
                        }
                        map6 = map7;
                        l79Var2 = l79Var3;
                        it6 = it6;
                        m16837I(num2).m25204a(pfbVar);
                        iIntValue = i2;
                        map6 = map7;
                        l79Var3 = l79Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                l79Var = l79Var2;
            }
        }
        arrayList2 = new ArrayList();
        C3089hv<Integer> c3089hv6 = (C3089hv) this.f51339f.keySet();
        c3089hv6.removeAll(this.f51338e);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            ymd ymdVar8 = (ymd) this.f51339f.get(num7);
            lda.m16130p(ymdVar8);
            lfc lfcVarM25205b6 = ymdVar8.m25205b(iIntValue8);
            arrayList2.add(lfcVarM25205b6);
            nnbVarM5920g1 = c1045d.m5920g0();
            kjcVar3 = (kjc) nnbVarM5920g1.f60774a;
            str8 = this.f51337d;
            mkc mkcVarM16172u6 = lfcVarM25205b6.m16172u();
            nnbVarM5920g1.m13144E();
            nnbVarM5920g1.mo12359D();
            lda.m16127m(str8);
            lda.m16130p(mkcVarM16172u6);
            byte[] bArrM3725a6 = mkcVarM16172u6.m3725a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrM3725a6);
            if (nnbVarM5920g1.m17559u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                kjcVar3.mo5909b().m24452H().m17924b(xcc.m24449L(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I */
    public final ymd m16837I(Integer num) {
        if (this.f51339f.containsKey(num)) {
            return (ymd) this.f51339f.get(num);
        }
        ymd ymdVar = new ymd(this, this.f51337d);
        this.f51339f.put(num, ymdVar);
        return ymdVar;
    }
}
