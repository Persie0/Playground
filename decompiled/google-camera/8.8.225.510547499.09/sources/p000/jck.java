package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.util.LruCache;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jck extends jey {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jcl f33728a;

    /* JADX INFO: renamed from: b */
    private final jbz f33729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jck(jcl jclVar, jbz jbzVar, jec jecVar) {
        super(jecVar);
        this.f33728a = jclVar;
        List list = jcb.f33699j;
        this.f33729b = jbzVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return status;
    }

    @Override // p000.jey, p000.jez
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12841c(Object obj) {
        super.m4649i((jel) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:202:0x03c7 A[Catch: all -> 0x03c9, DONT_GENERATE, TryCatch #6 {, blocks: (B:139:0x02e1, B:141:0x02e5, B:142:0x02eb, B:152:0x0305, B:154:0x030e, B:156:0x031a, B:158:0x0326, B:192:0x03b3, B:194:0x03b7, B:195:0x03be, B:159:0x032c, B:161:0x0334, B:162:0x0338, B:164:0x033e, B:186:0x03a6, B:188:0x03aa, B:166:0x034a, B:167:0x0354, B:169:0x035c, B:170:0x0362, B:172:0x0366, B:175:0x036d, B:177:0x0384, B:179:0x0388, B:181:0x0390, B:183:0x039a, B:185:0x03a2, B:191:0x03af, B:197:0x03c0, B:201:0x03c6, B:202:0x03c7, B:143:0x02ec, B:145:0x02f0, B:147:0x02f2, B:151:0x0304, B:150:0x02fa), top: B:503:0x02e1, inners: #0, #11 }] */
    /* JADX WARN: Code duplicated, block: B:372:0x0716 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0727 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:377:0x072b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0733 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:383:0x073a  */
    /* JADX WARN: Code duplicated, block: B:388:0x074f A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:389:0x0754 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:393:0x0764 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:397:0x0772 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:399:0x077c A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:403:0x0788 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:405:0x0792 A[Catch: IOException -> 0x07dd, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:407:0x07a6 A[Catch: IOException -> 0x07dd, LOOP:3: B:391:0x075e->B:407:0x07a6, LOOP_END, TryCatch #18 {IOException -> 0x07dd, blocks: (B:256:0x050d, B:259:0x0519, B:388:0x074f, B:391:0x075e, B:393:0x0764, B:395:0x076c, B:397:0x0772, B:399:0x077c, B:401:0x0782, B:403:0x0788, B:405:0x0792, B:407:0x07a6, B:389:0x0754, B:260:0x0524, B:262:0x052a, B:264:0x0539, B:266:0x0541, B:276:0x055a, B:278:0x0560, B:280:0x0568, B:282:0x056e, B:364:0x06f5, B:366:0x06fb, B:368:0x0701, B:370:0x0707, B:372:0x0716, B:375:0x0727, B:379:0x072e, B:380:0x0733, B:286:0x0589, B:299:0x05ab, B:301:0x05b3, B:303:0x05b9, B:306:0x05d0, B:307:0x05da, B:331:0x065a, B:333:0x0660, B:335:0x0672, B:336:0x0675, B:338:0x0689, B:344:0x069e, B:346:0x06a8, B:348:0x06b2, B:354:0x06c3, B:358:0x06d0, B:360:0x06e2, B:343:0x0695, B:311:0x05fc, B:314:0x0606, B:315:0x0610, B:317:0x061e, B:319:0x0622, B:320:0x0628, B:322:0x0632, B:323:0x0646, B:324:0x064b, B:326:0x064d, B:339:0x068e, B:290:0x0594, B:410:0x07d7, B:411:0x07dc), top: B:520:0x050d }] */
    /* JADX WARN: Code duplicated, block: B:430:0x0803  */
    /* JADX WARN: Code duplicated, block: B:432:0x0819  */
    /* JADX WARN: Code duplicated, block: B:435:0x083b  */
    /* JADX WARN: Code duplicated, block: B:438:0x0857  */
    /* JADX WARN: Code duplicated, block: B:441:0x086e  */
    /* JADX WARN: Code duplicated, block: B:444:0x088d  */
    /* JADX WARN: Code duplicated, block: B:447:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:450:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:452:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:453:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:456:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:460:0x0919  */
    /* JADX WARN: Code duplicated, block: B:461:0x092a  */
    /* JADX WARN: Code duplicated, block: B:473:0x0960  */
    /* JADX WARN: Code duplicated, block: B:475:0x0970  */
    /* JADX WARN: Code duplicated, block: B:541:0x0724 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x074d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x073e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0782 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07b6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.jey
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void mo12838b(jcm jcmVar) throws Throwable {
        jbz jbzVar;
        List<ogz> listEmptyList;
        ArrayList arrayList;
        int i;
        jcj jcjVar;
        jcf jcfVar;
        int i2;
        jcf jcfVar2;
        boolean z;
        nxn nxnVar;
        obf obfVar;
        mrm mrmVar;
        String strM14862a;
        int i3;
        boolean z2;
        int i4;
        Integer numValueOf;
        pcb pcbVarM14829d;
        int iIntValue;
        int i5;
        int i6;
        jdl jdlVarM12928b;
        jdl jdlVarM12927a;
        long jLongValue;
        long jLongValue2;
        long jM12983g;
        jcj jcjVar2 = new jcj(this);
        try {
            jbz jbzVarM12887a = this.f33729b;
            Iterator it = ((jcb) jbzVarM12887a.f33690a).f33700k.iterator();
            while (true) {
                if (it.hasNext()) {
                    jbzVarM12887a = ((jca) it.next()).m12887a();
                    if (jbzVarM12887a == null) {
                        jbzVar = null;
                        break;
                    }
                } else {
                    Iterator it2 = jcb.f33699j.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jbzVar = jbzVarM12887a;
                            break;
                        }
                        jbzVarM12887a = ((jca) it2.next()).m12887a();
                        if (jbzVarM12887a == null) {
                            jbzVar = null;
                            break;
                        }
                    }
                }
            }
            if (jbzVar == null) {
                jcjVar2.mo12891c(Status.f7601a);
                return;
            }
            jce jceVar = jbzVar.f33690a.f33684c;
            String str = jbzVar.f33695f;
            int i7 = ((ogy) jbzVar.f33698i.f44974b).f45979d;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            if (str == null) {
                arrayList = new ArrayList();
            } else {
                if (((jcq) jceVar).f33738f == null) {
                    listEmptyList = Collections.emptyList();
                } else {
                    lpv lpvVar = (lpv) jcq.f33735c.get(str);
                    if (lpvVar == null) {
                        lps lpsVar = new lps(jcq.f33734b, str, oha.f46004b);
                        lpvVar = (lpv) jcq.f33735c.putIfAbsent(str, lpsVar);
                        if (lpvVar == null) {
                            lpvVar = lpsVar;
                        }
                    }
                    listEmptyList = ((oha) lpvVar.m15845e()).f46006a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ogz ogzVar : listEmptyList) {
                    if ((ogzVar.f45987a & 1) == 0 || (i = ogzVar.f45988b) == 0 || i == i7) {
                        arrayList2.add(ogzVar);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    try {
                        nxn nxnVar2 = jbzVar.f33698i;
                        nwr nwrVarMo17758H = jbzVar.f33696g.mo17758H();
                        if (!nxnVar2.f44974b.m18142ac()) {
                            nxnVar2.mo18106p();
                        }
                        ogy ogyVar = (ogy) nxnVar2.f44974b;
                        ogyVar.f45976a |= 2048;
                        ogyVar.f45980e = nwrVarMo17758H;
                        ogy ogyVar2 = (ogy) jbzVar.f33698i.mo18103l();
                        jby jbyVar = jbzVar.f33690a;
                        String str2 = ((jcb) jbyVar).f33688g;
                        Context context = ((jcb) jbyVar).f33685d;
                        if (jby.f33680a == -1) {
                            synchronized (jby.class) {
                                if (jby.f33680a == -1) {
                                    try {
                                        jby.f33680a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                                    }
                                }
                            }
                        }
                        int i8 = jby.f33680a;
                        String str3 = jbzVar.f33695f;
                        String str4 = jbzVar.f33694e;
                        EnumSet enumSet = ((jcb) jbzVar.f33690a).f33689h;
                        boolean zContains = enumSet.contains(jcg.ANDROID_ID);
                        boolean zEquals = enumSet.equals(jcg.f33721f);
                        if (enumSet.equals(jcg.f33720e)) {
                            i2 = 0;
                        } else {
                            Iterator it4 = enumSet.iterator();
                            int i9 = -1;
                            while (it4.hasNext()) {
                                i9 &= ((jcg) it4.next()).f33724h ^ (-1);
                            }
                            i2 = i9;
                        }
                        jcs jcsVar = new jcs(str2, i8, -1, str4, zContains, str3, zEquals, 0, null, false, i2);
                        byte[] bArrMo17760J = ogyVar2.mo17760J();
                        int[] iArrM12880d = jby.m12880d(null);
                        ArrayList arrayList3 = jbzVar.f33692c;
                        jcf jcfVar3 = new jcf(jcsVar, ogyVar2, bArrMo17760J, iArrM12880d, arrayList3 != null ? (String[]) arrayList3.toArray(jby.f33681b) : null, jby.m12880d(jbzVar.f33693d), ogyVar2.f45979d);
                        ktr ktrVar = jbzVar.f33697h;
                        if (ktrVar != null) {
                            ogy ogyVar3 = jcfVar3.f33714k;
                            ogyVar3.getClass();
                            nwr nwrVar = ogyVar3.f45980e;
                            ksz kszVar = ktrVar.f37185b;
                            ksr ksrVar = ktrVar.f37184a;
                            byte[] bArrM17804A = nwrVar.m17804A();
                            ksp kspVar = kszVar.f37150a;
                            ksw kswVar = ksv.f37139b;
                            kss kssVar = ksv.f37138a;
                            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                                throw new NetworkOnMainThreadException();
                            }
                            ktp ktpVar = ((ksx) kswVar).f37144d;
                            nax naxVar = ksx.f37141e;
                            Context context2 = ksrVar.f37126a;
                            if (!ktp.f37178a) {
                                synchronized (ktp.f37179b) {
                                    if (!ktp.f37178a) {
                                        ktp.f37178a = true;
                                        synchronized (lpj.f38889a) {
                                            if (lpj.f38890b == null) {
                                                try {
                                                    lpj.f38890b = context2.getApplicationContext();
                                                } catch (NullPointerException e2) {
                                                    lpj.m15825c();
                                                    Log.w("PhenotypeContext", "context.getApplicationContext() yielded NullPointerException");
                                                }
                                            }
                                        }
                                        lpv.m15843h(context2);
                                        if (!kua.m14865d(context2)) {
                                            if (oib.f46086a.mo6051a().mo18532f()) {
                                                jdn jdnVarM12933a = jdn.m12933a(context2);
                                                String packageName = context2.getPackageName();
                                                Set set = jdn.f33805a;
                                                if (packageName == null) {
                                                    jdlVarM12928b = jdl.m12927a();
                                                } else if (packageName.equals(jdnVarM12933a.f33808c)) {
                                                    jdlVarM12928b = jdl.f33798a;
                                                } else {
                                                    if (jdh.m12921b()) {
                                                        jdlVarM12927a = jdh.m12923d(packageName, jdm.m12930b(jdnVarM12933a.f33807b));
                                                    } else {
                                                        try {
                                                            PackageInfo packageInfo = jdnVarM12933a.f33807b.getPackageManager().getPackageInfo(packageName, 64);
                                                            boolean zM12930b = jdm.m12930b(jdnVarM12933a.f33807b);
                                                            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                                                                jdlVarM12927a = jdl.m12927a();
                                                            } else {
                                                                jde jdeVar = new jde(packageInfo.signatures[0].toByteArray());
                                                                String str5 = packageInfo.packageName;
                                                                jdl jdlVarM12922c = jdh.m12922c(str5, jdeVar, zM12930b, false);
                                                                jdlVarM12927a = (!jdlVarM12922c.f33799b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !jdh.m12922c(str5, jdeVar, false, true).f33799b) ? jdlVarM12922c : jdl.m12927a();
                                                            }
                                                        } catch (PackageManager.NameNotFoundException e3) {
                                                            jdlVarM12928b = jdl.m12928b();
                                                        }
                                                    }
                                                    if (jdlVarM12927a.f33799b) {
                                                        jdnVarM12933a.f33808c = packageName;
                                                    }
                                                    jdlVarM12928b = jdlVarM12927a;
                                                }
                                                if (!jdlVarM12928b.f33799b) {
                                                    Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                                                }
                                            }
                                            ktp.m14841a(ksrVar, naxVar);
                                        }
                                    }
                                }
                            }
                            oie.m18542b();
                            if (oib.f46086a.mo6051a().mo18531e()) {
                                Context context3 = ksrVar.f37126a;
                                nax naxVar2 = ksx.f37141e;
                                if (ktt.f37186a == null || ktt.f37188c != ktt.m14844a(context3, naxVar2)) {
                                    synchronized (ktt.f37187b) {
                                        boolean zM14844a = ktt.m14844a(context3, naxVar2);
                                        if (ktt.f37186a == null || ktt.f37188c != zM14844a) {
                                            if (zM14844a) {
                                                mrm mrmVarM16829i = mqu.f41450a;
                                                if (oib.f46086a.mo6051a().mo18538l() && (oib.f46086a.mo6051a().mo18539m() || Objects.equals(context3.getPackageName(), "com.google.android.gms"))) {
                                                    ffw ffwVar = ffw.f21760f;
                                                    EnumSet enumSet2 = jcg.f33720e;
                                                    jib.m13205j(context3);
                                                    jib.m13203h("COLLECTION_BASIS_VERIFIER_CLIENT_ERROR_LOGGING");
                                                    mrmVarM16829i = mrm.m16829i(jbx.m12857b(context3, "COLLECTION_BASIS_VERIFIER_CLIENT_ERROR_LOGGING", ffwVar, enumSet2));
                                                }
                                                ffw ffwVar2 = ffw.f21760f;
                                                EnumSet enumSet3 = jcg.f33720e;
                                                jib.m13205j(context3);
                                                jib.m13203h("COLLECTION_BASIS_VERIFIER");
                                                ktt.f37186a = new ktq(jbx.m12857b(context3, "COLLECTION_BASIS_VERIFIER", ffwVar2, enumSet3), mrmVarM16829i, context3);
                                            } else {
                                                ktt.f37186a = new kud();
                                            }
                                            ktt.f37188c = zM14844a;
                                        }
                                    }
                                }
                                mrm mrmVarM16829i2 = mrm.m16829i(ktt.f37186a);
                                try {
                                    ksu ksuVar = new ksu(ksrVar.f37126a, kspVar.f37120b, ((ksx) kswVar).f37142b, ((ksx) kswVar).f37143c);
                                    int iIntValue2 = kspVar.f37119a;
                                    kts ktsVar = (kts) ((mrq) mrmVarM16829i2).f41482a;
                                    nww nwwVarM17878K = nww.m17878K(bArrM17804A);
                                    ArrayDeque arrayDeque = new ArrayDeque();
                                    kuc kucVar = new kuc(ksx.f37141e, ktz.m14846a(ksrVar), ktsVar, ksrVar, iIntValue2, bArrM17804A.length, arrayDeque, null, null);
                                    pce pceVarM14822a = ksuVar.m14822a(iIntValue2);
                                    if (pceVarM14822a == null) {
                                        if (kua.m14864c()) {
                                            kucVar.m14884a(kucVar.m14885b(7));
                                        }
                                        jcjVar = jcjVar2;
                                        jcfVar3 = jcfVar3;
                                        z = false;
                                    } else if (nwwVarM17878K.mo17811C() || ksx.m14826a(ksrVar, ksx.m14830e(pceVarM14822a), kssVar, kucVar, mqu.f41450a)) {
                                        boolean zM14827b = ksx.m14827b(ksx.m14830e(pceVarM14822a));
                                        jcjVar = jcjVar2;
                                        String strMo17837x = null;
                                        Object obj = null;
                                        int i10 = 0;
                                        loop2: while (true) {
                                            try {
                                                if (nwwVarM17878K.mo17811C()) {
                                                    jcfVar3 = jcfVar3;
                                                    z = true;
                                                    break;
                                                }
                                                int iMo17826m = nwwVarM17878K.mo17826m();
                                                jcfVar3 = jcfVar3;
                                                try {
                                                    int iM18386a = oal.m18386a(iMo17826m);
                                                    mrmVarM16829i2 = mrmVarM16829i2;
                                                    try {
                                                        int iM18387b = oal.m18387b(iMo17826m);
                                                        bArrM17804A = bArrM17804A;
                                                        try {
                                                            Map mapUnmodifiableMap = Collections.unmodifiableMap(pceVarM14822a.f47396b);
                                                            kssVar = kssVar;
                                                            arrayDeque = arrayDeque;
                                                            long j = iM18386a;
                                                            kspVar = kspVar;
                                                            try {
                                                                Long lValueOf = Long.valueOf(j);
                                                                if (mapUnmodifiableMap.containsKey(lValueOf)) {
                                                                    nyr nyrVar = pceVarM14822a.f47396b;
                                                                    if (!nyrVar.containsKey(lValueOf)) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    pca pcaVar = (pca) nyrVar.get(lValueOf);
                                                                    if (iM18387b == 2 || iM18387b == 3) {
                                                                        i3 = iM18387b;
                                                                        z2 = false;
                                                                    } else if (iM18387b != 4) {
                                                                        i3 = iM18387b;
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                        i3 = 4;
                                                                    }
                                                                    if (z2) {
                                                                        if ((pcaVar.f47382a & 2) != 0 && ksuVar.m14825d(pcaVar.f47383b)) {
                                                                            if (kua.m14864c()) {
                                                                                nxn nxnVarM14885b = kucVar.m14885b(10);
                                                                                nxnVarM14885b.m18118aI(j);
                                                                                kucVar.m14884a(nxnVarM14885b);
                                                                            }
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        pcbVarM14829d = ksx.m14829d(pcaVar);
                                                                        if (!zM14827b && !ksx.m14827b(pcbVarM14829d)) {
                                                                            if (kua.m14864c()) {
                                                                                nxn nxnVarM14885b2 = kucVar.m14885b(8);
                                                                                nxnVarM14885b2.m18118aI(j);
                                                                                kucVar.m14884a(nxnVarM14885b2);
                                                                            }
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        if (!ksx.m14826a(ksrVar, pcbVarM14829d, kssVar, kucVar, mrm.m16829i(Integer.valueOf(iM18386a)))) {
                                                                            z = false;
                                                                            break;
                                                                        }
                                                                        if (iIntValue2 == ksx.f37140a || iM18386a != 1) {
                                                                            nwwVarM17878K.mo17813E(iMo17826m);
                                                                            strMo17837x = null;
                                                                            obj = obj;
                                                                        } else {
                                                                            strMo17837x = nwwVarM17878K.mo17837x();
                                                                        }
                                                                        if (obj == null) {
                                                                            obj = obj;
                                                                            obj = obj;
                                                                            obj = obj;
                                                                            if (i3 == 4) {
                                                                                obj = obj;
                                                                            } else {
                                                                                obj = obj;
                                                                            }
                                                                        } else {
                                                                            obj = obj;
                                                                            obj = obj;
                                                                            obj = obj;
                                                                        }
                                                                        if (obj == null) {
                                                                            obj = obj;
                                                                            iIntValue = nwwVarM17878K.mo17817d();
                                                                        } else {
                                                                            obj = obj;
                                                                            iIntValue = i10 + ((Integer) obj).intValue();
                                                                        }
                                                                        while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                            if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                if (kua.m14864c()) {
                                                                                    kucVar.m14884a(kucVar.m14885b(11));
                                                                                }
                                                                                z = false;
                                                                                break loop2;
                                                                            }
                                                                            if (arrayDeque.isEmpty()) {
                                                                                if (kua.m14864c()) {
                                                                                    kucVar.m14884a(kucVar.m14885b(11));
                                                                                }
                                                                                z = false;
                                                                                break loop2;
                                                                            }
                                                                            ksy ksyVar = (ksy) arrayDeque.pop();
                                                                            i5 = ksyVar.f37145a;
                                                                            obj = ksyVar.f37149e;
                                                                            i6 = ksyVar.f37146b;
                                                                            zM14827b = ksyVar.f37147c;
                                                                            pceVarM14822a = ksuVar.m14823b(i5);
                                                                            if (obj == null) {
                                                                                iIntValue2 = i5;
                                                                                i10 = i6;
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                i10 = i6;
                                                                                iIntValue = ((Integer) obj).intValue() + i6;
                                                                                iIntValue2 = i5;
                                                                            }
                                                                        }
                                                                    } else if ((pcaVar.f47382a & 2) == 0 && (strMo17837x == null || !ksx.m14828c(iIntValue2, iM18386a))) {
                                                                        pcbVarM14829d = ksx.m14829d(pcaVar);
                                                                        if (!zM14827b) {
                                                                            if (!ksx.m14826a(ksrVar, pcbVarM14829d, kssVar, kucVar, mrm.m16829i(Integer.valueOf(iM18386a)))) {
                                                                                z = false;
                                                                                break;
                                                                            }
                                                                            if (iIntValue2 == ksx.f37140a) {
                                                                                nwwVarM17878K.mo17813E(iMo17826m);
                                                                                strMo17837x = null;
                                                                                obj = obj;
                                                                            } else {
                                                                                nwwVarM17878K.mo17813E(iMo17826m);
                                                                                strMo17837x = null;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                if (i3 == 4) {
                                                                                    obj = obj;
                                                                                } else {
                                                                                    obj = obj;
                                                                                }
                                                                            } else {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                iIntValue = nwwVarM17878K.mo17817d();
                                                                            } else {
                                                                                obj = obj;
                                                                                iIntValue = i10 + ((Integer) obj).intValue();
                                                                            }
                                                                            while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                                if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                ksy ksyVar2 = (ksy) arrayDeque.pop();
                                                                                i5 = ksyVar2.f37145a;
                                                                                obj = ksyVar2.f37149e;
                                                                                i6 = ksyVar2.f37146b;
                                                                                zM14827b = ksyVar2.f37147c;
                                                                                pceVarM14822a = ksuVar.m14823b(i5);
                                                                                if (obj == null) {
                                                                                    iIntValue2 = i5;
                                                                                    i10 = i6;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i10 = i6;
                                                                                    iIntValue = ((Integer) obj).intValue() + i6;
                                                                                    iIntValue2 = i5;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (!ksx.m14826a(ksrVar, pcbVarM14829d, kssVar, kucVar, mrm.m16829i(Integer.valueOf(iM18386a)))) {
                                                                                z = false;
                                                                                break;
                                                                            }
                                                                            if (iIntValue2 == ksx.f37140a) {
                                                                                nwwVarM17878K.mo17813E(iMo17826m);
                                                                                strMo17837x = null;
                                                                                obj = obj;
                                                                            } else {
                                                                                nwwVarM17878K.mo17813E(iMo17826m);
                                                                                strMo17837x = null;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                if (i3 == 4) {
                                                                                    obj = obj;
                                                                                } else {
                                                                                    obj = obj;
                                                                                }
                                                                            } else {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                iIntValue = nwwVarM17878K.mo17817d();
                                                                            } else {
                                                                                obj = obj;
                                                                                iIntValue = i10 + ((Integer) obj).intValue();
                                                                            }
                                                                            while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                                if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                ksy ksyVar3 = (ksy) arrayDeque.pop();
                                                                                i5 = ksyVar3.f37145a;
                                                                                obj = ksyVar3.f37149e;
                                                                                i6 = ksyVar3.f37146b;
                                                                                zM14827b = ksyVar3.f37147c;
                                                                                pceVarM14822a = ksuVar.m14823b(i5);
                                                                                if (obj == null) {
                                                                                    iIntValue2 = i5;
                                                                                    i10 = i6;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i10 = i6;
                                                                                    iIntValue = ((Integer) obj).intValue() + i6;
                                                                                    iIntValue2 = i5;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (i3 != 2) {
                                                                            if (i3 == 3) {
                                                                                i4 = 3;
                                                                                i3 = 3;
                                                                            } else {
                                                                                strMo17837x = strMo17837x;
                                                                                kssVar = kssVar;
                                                                                arrayDeque = arrayDeque;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                if (i3 == 4) {
                                                                                    obj = obj;
                                                                                } else {
                                                                                    obj = obj;
                                                                                }
                                                                            } else {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                iIntValue = nwwVarM17878K.mo17817d();
                                                                            } else {
                                                                                obj = obj;
                                                                                iIntValue = i10 + ((Integer) obj).intValue();
                                                                            }
                                                                            while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                                if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                ksy ksyVar4 = (ksy) arrayDeque.pop();
                                                                                i5 = ksyVar4.f37145a;
                                                                                obj = ksyVar4.f37149e;
                                                                                i6 = ksyVar4.f37146b;
                                                                                zM14827b = ksyVar4.f37147c;
                                                                                pceVarM14822a = ksuVar.m14823b(i5);
                                                                                if (obj == null) {
                                                                                    iIntValue2 = i5;
                                                                                    i10 = i6;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i10 = i6;
                                                                                    iIntValue = ((Integer) obj).intValue() + i6;
                                                                                    iIntValue2 = i5;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i4 = i3;
                                                                        }
                                                                        if (!ksuVar.m14825d(pcaVar.f47383b) && !ksx.m14828c(iIntValue2, iM18386a)) {
                                                                            if (!ksx.m14826a(ksrVar, ksx.m14829d(pcaVar), kssVar, kucVar, mrm.m16829i(Integer.valueOf(iM18386a)))) {
                                                                                z = false;
                                                                                break;
                                                                            }
                                                                            nwwVarM17878K.mo17813E(iMo17826m);
                                                                            strMo17837x = strMo17837x;
                                                                            i3 = i4;
                                                                            kssVar = kssVar;
                                                                            arrayDeque = arrayDeque;
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                if (i3 == 4) {
                                                                                    obj = obj;
                                                                                } else {
                                                                                    obj = obj;
                                                                                }
                                                                            } else {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                iIntValue = nwwVarM17878K.mo17817d();
                                                                            } else {
                                                                                obj = obj;
                                                                                iIntValue = i10 + ((Integer) obj).intValue();
                                                                            }
                                                                            while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                                if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                ksy ksyVar5 = (ksy) arrayDeque.pop();
                                                                                i5 = ksyVar5.f37145a;
                                                                                obj = ksyVar5.f37149e;
                                                                                i6 = ksyVar5.f37146b;
                                                                                zM14827b = ksyVar5.f37147c;
                                                                                pceVarM14822a = ksuVar.m14823b(i5);
                                                                                if (obj == null) {
                                                                                    iIntValue2 = i5;
                                                                                    i10 = i6;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i10 = i6;
                                                                                    iIntValue = ((Integer) obj).intValue() + i6;
                                                                                    iIntValue2 = i5;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayDeque = arrayDeque;
                                                                            arrayDeque.push(new ksy(iIntValue2, (Integer) obj, i10, zM14827b, iM18386a));
                                                                            if (ksx.m14828c(iIntValue2, iM18386a)) {
                                                                                if (strMo17837x != null && strMo17837x.startsWith("type.googleapis.com/")) {
                                                                                    int iM17709R = ntw.m17709R(strMo17837x.substring(20));
                                                                                    try {
                                                                                        LruCache lruCache = ksuVar.f37133a;
                                                                                        Integer numValueOf2 = Integer.valueOf(iM17709R);
                                                                                        Integer numValueOf3 = (Integer) lruCache.get(numValueOf2);
                                                                                        if (numValueOf3 == null) {
                                                                                            if (ksuVar.f37134b == null) {
                                                                                                ksuVar.f37134b = ksuVar.m14824c();
                                                                                            }
                                                                                            nyr nyrVar2 = ksuVar.f37134b.f47407b;
                                                                                            if (!nyrVar2.containsKey(numValueOf2)) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            numValueOf3 = Integer.valueOf(((Integer) nyrVar2.get(numValueOf2)).intValue());
                                                                                            ksuVar.f37133a.put(numValueOf2, numValueOf3);
                                                                                        }
                                                                                        numValueOf = Integer.valueOf(numValueOf3.intValue());
                                                                                    } catch (IllegalArgumentException e4) {
                                                                                        numValueOf = null;
                                                                                    }
                                                                                } else {
                                                                                    numValueOf = null;
                                                                                }
                                                                                if (numValueOf == null) {
                                                                                    if (kua.m14864c()) {
                                                                                        nxn nxnVarM14885b3 = kucVar.m14885b(9);
                                                                                        String strM16831a = mro.m16831a(strMo17837x);
                                                                                        if (!nxnVarM14885b3.f44974b.m18142ac()) {
                                                                                            nxnVarM14885b3.mo18106p();
                                                                                        }
                                                                                        obf obfVar2 = (obf) nxnVarM14885b3.f44974b;
                                                                                        obf obfVar3 = obf.f45245n;
                                                                                        obfVar2.f45247a |= 32;
                                                                                        obfVar2.f45253g = strM16831a;
                                                                                        kucVar.m14884a(nxnVarM14885b3);
                                                                                    }
                                                                                    z = false;
                                                                                    break;
                                                                                }
                                                                                iIntValue2 = numValueOf.intValue();
                                                                            } else {
                                                                                iIntValue2 = pcaVar.f47383b;
                                                                            }
                                                                            Integer numValueOf4 = i3 == 3 ? null : Integer.valueOf(nwwVarM17878K.mo17823j());
                                                                            int iMo17817d = nwwVarM17878K.mo17817d();
                                                                            pce pceVarM14823b = ksuVar.m14823b(iIntValue2);
                                                                            zM14827b = zM14827b || ksx.m14827b(ksx.m14829d(pcaVar)) || ksx.m14827b(ksx.m14830e(pceVarM14823b));
                                                                            if (numValueOf4 == null || numValueOf4.intValue() > 0) {
                                                                                if (!ksx.m14826a(ksrVar, ksx.m14829d(pcaVar), kssVar, kucVar, mrm.m16829i(Integer.valueOf(iM18386a))) || !ksx.m14826a(ksrVar, ksx.m14830e(pceVarM14823b), kssVar, kucVar, mqu.f41450a)) {
                                                                                    z = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            i10 = iMo17817d;
                                                                            pceVarM14822a = pceVarM14823b;
                                                                            kssVar = kssVar;
                                                                            strMo17837x = null;
                                                                            obj = numValueOf4;
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                if (i3 == 4) {
                                                                                    obj = obj;
                                                                                } else {
                                                                                    obj = obj;
                                                                                }
                                                                            } else {
                                                                                obj = obj;
                                                                                obj = obj;
                                                                                obj = obj;
                                                                            }
                                                                            if (obj == null) {
                                                                                obj = obj;
                                                                                iIntValue = nwwVarM17878K.mo17817d();
                                                                            } else {
                                                                                obj = obj;
                                                                                iIntValue = i10 + ((Integer) obj).intValue();
                                                                            }
                                                                            while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                                if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                if (arrayDeque.isEmpty()) {
                                                                                    if (kua.m14864c()) {
                                                                                        kucVar.m14884a(kucVar.m14885b(11));
                                                                                    }
                                                                                    z = false;
                                                                                    break loop2;
                                                                                }
                                                                                ksy ksyVar6 = (ksy) arrayDeque.pop();
                                                                                i5 = ksyVar6.f37145a;
                                                                                obj = ksyVar6.f37149e;
                                                                                i6 = ksyVar6.f37146b;
                                                                                zM14827b = ksyVar6.f37147c;
                                                                                pceVarM14822a = ksuVar.m14823b(i5);
                                                                                if (obj == null) {
                                                                                    iIntValue2 = i5;
                                                                                    i10 = i6;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i10 = i6;
                                                                                    iIntValue = ((Integer) obj).intValue() + i6;
                                                                                    iIntValue2 = i5;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!zM14827b) {
                                                                        if (kua.m14864c()) {
                                                                            nxn nxnVarM14885b4 = kucVar.m14885b(8);
                                                                            nxnVarM14885b4.m18118aI(j);
                                                                            kucVar.m14884a(nxnVarM14885b4);
                                                                        }
                                                                        z = false;
                                                                        break;
                                                                    }
                                                                    nwwVarM17878K.mo17813E(iMo17826m);
                                                                    strMo17837x = strMo17837x;
                                                                    i3 = iM18387b;
                                                                    kssVar = kssVar;
                                                                    arrayDeque = arrayDeque;
                                                                    if (obj == null) {
                                                                        obj = obj;
                                                                        obj = obj;
                                                                        obj = obj;
                                                                        if (i3 == 4) {
                                                                            obj = obj;
                                                                        } else {
                                                                            obj = obj;
                                                                        }
                                                                    } else {
                                                                        obj = obj;
                                                                        obj = obj;
                                                                        obj = obj;
                                                                    }
                                                                    if (obj == null) {
                                                                        obj = obj;
                                                                        iIntValue = nwwVarM17878K.mo17817d();
                                                                    } else {
                                                                        obj = obj;
                                                                        iIntValue = i10 + ((Integer) obj).intValue();
                                                                    }
                                                                    while (nwwVarM17878K.mo17817d() >= iIntValue) {
                                                                        if (nwwVarM17878K.mo17817d() > iIntValue) {
                                                                            if (kua.m14864c()) {
                                                                                kucVar.m14884a(kucVar.m14885b(11));
                                                                            }
                                                                            z = false;
                                                                            break loop2;
                                                                        }
                                                                        if (arrayDeque.isEmpty()) {
                                                                            if (kua.m14864c()) {
                                                                                kucVar.m14884a(kucVar.m14885b(11));
                                                                            }
                                                                            z = false;
                                                                            break loop2;
                                                                        }
                                                                        ksy ksyVar7 = (ksy) arrayDeque.pop();
                                                                        i5 = ksyVar7.f37145a;
                                                                        obj = ksyVar7.f37149e;
                                                                        i6 = ksyVar7.f37146b;
                                                                        zM14827b = ksyVar7.f37147c;
                                                                        pceVarM14822a = ksuVar.m14823b(i5);
                                                                        if (obj == null) {
                                                                            iIntValue2 = i5;
                                                                            i10 = i6;
                                                                            break;
                                                                        } else {
                                                                            i10 = i6;
                                                                            iIntValue = ((Integer) obj).intValue() + i6;
                                                                            iIntValue2 = i5;
                                                                        }
                                                                    }
                                                                }
                                                            } catch (IOException e5) {
                                                                e = e5;
                                                                if (kua.m14864c()) {
                                                                    nxnVar = (nxn) obf.f45245n.m18137O();
                                                                    String packageName2 = ksrVar.f37126a.getPackageName();
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar4 = (obf) nxnVar.f44974b;
                                                                    packageName2.getClass();
                                                                    obfVar4.f45247a |= 1;
                                                                    obfVar4.f45248b = packageName2;
                                                                    int iM17235f = ksx.f37141e.m17235f(ksrVar.f37126a);
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar5 = (obf) nxnVar.f44974b;
                                                                    obfVar5.f45247a |= 2;
                                                                    obfVar5.f45249c = iM17235f;
                                                                    long j2 = kspVar.f37119a;
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar6 = (obf) nxnVar.f44974b;
                                                                    obfVar6.f45247a |= 4;
                                                                    obfVar6.f45250d = j2;
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar7 = (obf) nxnVar.f44974b;
                                                                    obfVar7.f45247a |= 8;
                                                                    obfVar7.f45251e = -2032180703L;
                                                                    long length = bArrM17804A.length;
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar8 = (obf) nxnVar.f44974b;
                                                                    obfVar8.f45247a |= 16;
                                                                    obfVar8.f45252f = length;
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar9 = (obf) nxnVar.f44974b;
                                                                    obfVar9.f45254h = lij.m15407P(5);
                                                                    obfVar9.f45247a |= 64;
                                                                    if (oib.f46086a.mo6051a().mo18533g()) {
                                                                        String strM14862a2 = kua.m14862a(e);
                                                                        mrmVar = ksrVar.f37127b;
                                                                        if (mrmVar.mo16813g()) {
                                                                            strM14862a = kua.m14862a((Throwable) mrmVar.mo16809c());
                                                                        } else {
                                                                            strM14862a = "";
                                                                        }
                                                                        String str6 = strM14862a2 + "\n\n" + strM14862a;
                                                                        if (!nxnVar.f44974b.m18142ac()) {
                                                                            nxnVar.mo18106p();
                                                                        }
                                                                        obf obfVar10 = (obf) nxnVar.f44974b;
                                                                        obfVar10.f45247a |= 2048;
                                                                        obfVar10.f45258m = str6;
                                                                    }
                                                                    obfVar = (obf) nxnVar.mo18103l();
                                                                    if (ktz.m14846a(ksrVar).m14850b(obfVar)) {
                                                                        ((kts) ((mrq) mrmVarM16829i2).f41482a).mo14842a(obfVar, mrm.m16829i(e));
                                                                        z = false;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                } else {
                                                                    z = false;
                                                                }
                                                            }
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            kspVar = kspVar;
                                                            if (kua.m14864c()) {
                                                                nxnVar = (nxn) obf.f45245n.m18137O();
                                                                String packageName3 = ksrVar.f37126a.getPackageName();
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar11 = (obf) nxnVar.f44974b;
                                                                packageName3.getClass();
                                                                obfVar11.f45247a |= 1;
                                                                obfVar11.f45248b = packageName3;
                                                                int iM17235f2 = ksx.f37141e.m17235f(ksrVar.f37126a);
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar12 = (obf) nxnVar.f44974b;
                                                                obfVar12.f45247a |= 2;
                                                                obfVar12.f45249c = iM17235f2;
                                                                long j3 = kspVar.f37119a;
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar13 = (obf) nxnVar.f44974b;
                                                                obfVar13.f45247a |= 4;
                                                                obfVar13.f45250d = j3;
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar14 = (obf) nxnVar.f44974b;
                                                                obfVar14.f45247a |= 8;
                                                                obfVar14.f45251e = -2032180703L;
                                                                long length2 = bArrM17804A.length;
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar15 = (obf) nxnVar.f44974b;
                                                                obfVar15.f45247a |= 16;
                                                                obfVar15.f45252f = length2;
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar16 = (obf) nxnVar.f44974b;
                                                                obfVar16.f45254h = lij.m15407P(5);
                                                                obfVar16.f45247a |= 64;
                                                                if (oib.f46086a.mo6051a().mo18533g()) {
                                                                    String strM14862a3 = kua.m14862a(e);
                                                                    mrmVar = ksrVar.f37127b;
                                                                    if (mrmVar.mo16813g()) {
                                                                        strM14862a = kua.m14862a((Throwable) mrmVar.mo16809c());
                                                                    } else {
                                                                        strM14862a = "";
                                                                    }
                                                                    String str7 = strM14862a3 + "\n\n" + strM14862a;
                                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                                        nxnVar.mo18106p();
                                                                    }
                                                                    obf obfVar17 = (obf) nxnVar.f44974b;
                                                                    obfVar17.f45247a |= 2048;
                                                                    obfVar17.f45258m = str7;
                                                                }
                                                                obfVar = (obf) nxnVar.mo18103l();
                                                                if (ktz.m14846a(ksrVar).m14850b(obfVar)) {
                                                                    ((kts) ((mrq) mrmVarM16829i2).f41482a).mo14842a(obfVar, mrm.m16829i(e));
                                                                    z = false;
                                                                } else {
                                                                    z = false;
                                                                }
                                                            } else {
                                                                z = false;
                                                            }
                                                            oie.m18542b();
                                                            jcfVar2 = jcfVar3;
                                                            jcfVar2.f33712i = new jcr(z | (!oib.f46086a.mo6051a().mo18541o()));
                                                            jcfVar = jcfVar2;
                                                            if (jcfVar == null) {
                                                                m13008f(new Status(10, BEeWZPor.Qtc));
                                                                return;
                                                            }
                                                            try {
                                                                jco jcoVar = (jco) jcmVar.m13169u();
                                                                Parcel parcelM3398a = jcoVar.m3398a();
                                                                cbs.m3405d(parcelM3398a, jcjVar);
                                                                cbs.m3404c(parcelM3398a, jcfVar);
                                                                jcoVar.m3397A(1, parcelM3398a);
                                                                jbx.m12856a().booleanValue();
                                                                return;
                                                            } catch (TransactionTooLargeException e7) {
                                                                Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e7);
                                                                jcp jcpVar = new jcp(jcfVar.f33704a.f33745f, 31004, 1);
                                                                jcl jclVar = this.f33728a;
                                                                jch jchVar = new jch(Arrays.asList(jcpVar));
                                                                if (jchVar.f33725a.isEmpty()) {
                                                                    jvh.m13566n(Status.f7601a);
                                                                    return;
                                                                }
                                                                jgg jggVarM13132a = jgh.m13132a();
                                                                jggVarM13132a.f33956a = new jin(jchVar, 1);
                                                                jggVarM13132a.f33957b = new jcw[]{jcd.f33701a};
                                                                jggVarM13132a.m13131b();
                                                                jclVar.m12964j(jggVarM13132a.m13130a());
                                                                return;
                                                            } catch (RemoteException e8) {
                                                                e = e8;
                                                                Log.w("ClearcutLoggerApiImpl", "logEvent exception", e);
                                                                jbx.m12856a().booleanValue();
                                                                throw e;
                                                            } catch (RuntimeException e9) {
                                                                e = e9;
                                                                Log.w("ClearcutLoggerApiImpl", "logEvent exception", e);
                                                                jbx.m12856a().booleanValue();
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        bArrM17804A = bArrM17804A;
                                                        kspVar = kspVar;
                                                        if (kua.m14864c()) {
                                                            nxnVar = (nxn) obf.f45245n.m18137O();
                                                            String packageName4 = ksrVar.f37126a.getPackageName();
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar18 = (obf) nxnVar.f44974b;
                                                            packageName4.getClass();
                                                            obfVar18.f45247a |= 1;
                                                            obfVar18.f45248b = packageName4;
                                                            int iM17235f3 = ksx.f37141e.m17235f(ksrVar.f37126a);
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar19 = (obf) nxnVar.f44974b;
                                                            obfVar19.f45247a |= 2;
                                                            obfVar19.f45249c = iM17235f3;
                                                            long j4 = kspVar.f37119a;
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar110 = (obf) nxnVar.f44974b;
                                                            obfVar110.f45247a |= 4;
                                                            obfVar110.f45250d = j4;
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar111 = (obf) nxnVar.f44974b;
                                                            obfVar111.f45247a |= 8;
                                                            obfVar111.f45251e = -2032180703L;
                                                            long length3 = bArrM17804A.length;
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar112 = (obf) nxnVar.f44974b;
                                                            obfVar112.f45247a |= 16;
                                                            obfVar112.f45252f = length3;
                                                            if (!nxnVar.f44974b.m18142ac()) {
                                                                nxnVar.mo18106p();
                                                            }
                                                            obf obfVar113 = (obf) nxnVar.f44974b;
                                                            obfVar113.f45254h = lij.m15407P(5);
                                                            obfVar113.f45247a |= 64;
                                                            if (oib.f46086a.mo6051a().mo18533g()) {
                                                                String strM14862a4 = kua.m14862a(e);
                                                                mrmVar = ksrVar.f37127b;
                                                                if (mrmVar.mo16813g()) {
                                                                    strM14862a = kua.m14862a((Throwable) mrmVar.mo16809c());
                                                                } else {
                                                                    strM14862a = "";
                                                                }
                                                                String str8 = strM14862a4 + "\n\n" + strM14862a;
                                                                if (!nxnVar.f44974b.m18142ac()) {
                                                                    nxnVar.mo18106p();
                                                                }
                                                                obf obfVar114 = (obf) nxnVar.f44974b;
                                                                obfVar114.f45247a |= 2048;
                                                                obfVar114.f45258m = str8;
                                                            }
                                                            obfVar = (obf) nxnVar.mo18103l();
                                                            if (ktz.m14846a(ksrVar).m14850b(obfVar)) {
                                                                ((kts) ((mrq) mrmVarM16829i2).f41482a).mo14842a(obfVar, mrm.m16829i(e));
                                                                z = false;
                                                            } else {
                                                                z = false;
                                                            }
                                                        } else {
                                                            z = false;
                                                        }
                                                        oie.m18542b();
                                                        jcfVar2 = jcfVar3;
                                                        jcfVar2.f33712i = new jcr(z | (!oib.f46086a.mo6051a().mo18541o()));
                                                        jcfVar = jcfVar2;
                                                        if (jcfVar == null) {
                                                            m13008f(new Status(10, BEeWZPor.Qtc));
                                                            return;
                                                        }
                                                        jco jcoVar2 = (jco) jcmVar.m13169u();
                                                        Parcel parcelM3398a2 = jcoVar2.m3398a();
                                                        cbs.m3405d(parcelM3398a2, jcjVar);
                                                        cbs.m3404c(parcelM3398a2, jcfVar);
                                                        jcoVar2.m3397A(1, parcelM3398a2);
                                                        jbx.m12856a().booleanValue();
                                                        return;
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    mrmVarM16829i2 = mrmVarM16829i2;
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                                mrmVarM16829i2 = mrmVarM16829i2;
                                                bArrM17804A = bArrM17804A;
                                                kspVar = kspVar;
                                                jcfVar3 = jcfVar3;
                                                if (kua.m14864c()) {
                                                    nxnVar = (nxn) obf.f45245n.m18137O();
                                                    String packageName5 = ksrVar.f37126a.getPackageName();
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar115 = (obf) nxnVar.f44974b;
                                                    packageName5.getClass();
                                                    obfVar115.f45247a |= 1;
                                                    obfVar115.f45248b = packageName5;
                                                    int iM17235f4 = ksx.f37141e.m17235f(ksrVar.f37126a);
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar116 = (obf) nxnVar.f44974b;
                                                    obfVar116.f45247a |= 2;
                                                    obfVar116.f45249c = iM17235f4;
                                                    long j5 = kspVar.f37119a;
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar117 = (obf) nxnVar.f44974b;
                                                    obfVar117.f45247a |= 4;
                                                    obfVar117.f45250d = j5;
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar118 = (obf) nxnVar.f44974b;
                                                    obfVar118.f45247a |= 8;
                                                    obfVar118.f45251e = -2032180703L;
                                                    long length4 = bArrM17804A.length;
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar119 = (obf) nxnVar.f44974b;
                                                    obfVar119.f45247a |= 16;
                                                    obfVar119.f45252f = length4;
                                                    if (!nxnVar.f44974b.m18142ac()) {
                                                        nxnVar.mo18106p();
                                                    }
                                                    obf obfVar1110 = (obf) nxnVar.f44974b;
                                                    obfVar1110.f45254h = lij.m15407P(5);
                                                    obfVar1110.f45247a |= 64;
                                                    if (oib.f46086a.mo6051a().mo18533g()) {
                                                        String strM14862a5 = kua.m14862a(e);
                                                        mrmVar = ksrVar.f37127b;
                                                        if (mrmVar.mo16813g()) {
                                                            strM14862a = kua.m14862a((Throwable) mrmVar.mo16809c());
                                                        } else {
                                                            strM14862a = "";
                                                        }
                                                        String str9 = strM14862a5 + "\n\n" + strM14862a;
                                                        if (!nxnVar.f44974b.m18142ac()) {
                                                            nxnVar.mo18106p();
                                                        }
                                                        obf obfVar1111 = (obf) nxnVar.f44974b;
                                                        obfVar1111.f45247a |= 2048;
                                                        obfVar1111.f45258m = str9;
                                                    }
                                                    obfVar = (obf) nxnVar.mo18103l();
                                                    if (ktz.m14846a(ksrVar).m14850b(obfVar)) {
                                                        ((kts) ((mrq) mrmVarM16829i2).f41482a).mo14842a(obfVar, mrm.m16829i(e));
                                                        z = false;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                oie.m18542b();
                                                jcfVar2 = jcfVar3;
                                                jcfVar2.f33712i = new jcr(z | (!oib.f46086a.mo6051a().mo18541o()));
                                                jcfVar = jcfVar2;
                                                if (jcfVar == null) {
                                                    m13008f(new Status(10, BEeWZPor.Qtc));
                                                    return;
                                                }
                                                jco jcoVar3 = (jco) jcmVar.m13169u();
                                                Parcel parcelM3398a3 = jcoVar3.m3398a();
                                                cbs.m3405d(parcelM3398a3, jcjVar);
                                                cbs.m3404c(parcelM3398a3, jcfVar);
                                                jcoVar3.m3397A(1, parcelM3398a3);
                                                jbx.m12856a().booleanValue();
                                                return;
                                            }
                                        }
                                    } else {
                                        jcjVar = jcjVar2;
                                        jcfVar3 = jcfVar3;
                                        z = false;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    jcjVar = jcjVar2;
                                }
                            } else {
                                jcjVar = jcjVar2;
                                jcfVar3 = jcfVar3;
                                z = true;
                            }
                            oie.m18542b();
                            jcfVar2 = jcfVar3;
                            jcfVar2.f33712i = new jcr(z | (!oib.f46086a.mo6051a().mo18541o()));
                        } else {
                            jcjVar = jcjVar2;
                            jcfVar2 = jcfVar3;
                        }
                        jcfVar = jcfVar2;
                    } catch (RuntimeException e14) {
                        jcjVar = jcjVar2;
                        Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e14);
                        jcfVar = null;
                    }
                    if (jcfVar == null) {
                        m13008f(new Status(10, BEeWZPor.Qtc));
                        return;
                    }
                    jco jcoVar4 = (jco) jcmVar.m13169u();
                    Parcel parcelM3398a4 = jcoVar4.m3398a();
                    cbs.m3405d(parcelM3398a4, jcjVar);
                    cbs.m3404c(parcelM3398a4, jcfVar);
                    jcoVar4.m3397A(1, parcelM3398a4);
                    jbx.m12856a().booleanValue();
                    return;
                }
                ogz ogzVar2 = (ogz) it3.next();
                String str10 = ogzVar2.f45989c;
                Context context4 = ((jcq) jceVar).f33738f;
                if (kuh.m14888c(context4)) {
                    jLongValue = 0;
                } else if (jcq.f33737e != null) {
                    jLongValue = jcq.f33737e.longValue();
                } else if (context4 != null) {
                    if (jcq.f33736d == null) {
                        jcq.f33736d = Boolean.valueOf(jiz.m13300b(context4).m14246l("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                    }
                    if (jcq.f33736d.booleanValue()) {
                        ContentResolver contentResolver = context4.getContentResolver();
                        Object objM13514c = jum.m13514c(contentResolver);
                        Long lValueOf2 = (Long) jum.m13513b(jum.f34844i, "android_id", 0L);
                        if (lValueOf2 != null) {
                            jLongValue2 = lValueOf2.longValue();
                        } else {
                            String strM13517f = jum.m13517f(contentResolver, "android_id");
                            if (strM13517f == null) {
                                jLongValue2 = 0;
                            } else {
                                try {
                                    jLongValue2 = Long.parseLong(strM13517f);
                                    lValueOf2 = Long.valueOf(jLongValue2);
                                } catch (NumberFormatException e15) {
                                    jLongValue2 = 0;
                                }
                            }
                            jum.m13516e(objM13514c, jum.f34844i, "android_id", lValueOf2);
                        }
                        jcq.f33737e = Long.valueOf(jLongValue2);
                    } else {
                        jcq.f33737e = 0L;
                    }
                    jLongValue = jcq.f33737e.longValue();
                } else {
                    jLongValue = 0;
                }
                if (str10 == null || str10.isEmpty()) {
                    jM12983g = jeu.m12983g(ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str10.getBytes(jcq.f33733a);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jM12983g = jeu.m12983g(byteBufferAllocate.array());
                }
                long j6 = ogzVar2.f45990d;
                long j7 = ogzVar2.f45991e;
                if (j6 >= 0 && j7 > 0) {
                    if ((jM12983g >= 0 ? jM12983g % j7 : (((Long.MAX_VALUE % j7) + 1) + ((jM12983g & Long.MAX_VALUE) % j7)) % j7) >= j6) {
                        m4649i(Status.f7601a);
                        return;
                    }
                }
                it3 = it3;
            }
        } catch (RuntimeException e16) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e16);
            m13008f(new Status(10, "EventModifier"));
        }
    }
}
