package p000;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.C0738c;
import androidx.room.RoomDatabase$JournalMode;
import androidx.work.impl.C0773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lingq.core.achievements.delegate.C1238a;
import com.lingq.core.achievements.delegate.C1239b;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.chat.C1265a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.data.repository.C1285a;
import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1288d;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1291g;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.data.repository.C1298n;
import com.lingq.core.data.repository.C1299o;
import com.lingq.core.data.repository.C1300p;
import com.lingq.core.data.repository.C1301q;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.data.repository.C1304t;
import com.lingq.core.data.repository.C1305u;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.data.repository.C1309y;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.data.web2wave.C1312a;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.AbstractC1323k;
import com.lingq.core.database.dao.C1313a;
import com.lingq.core.database.dao.C1314b;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1316d;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.datastore.C1372e;
import com.lingq.core.domain.lesson.C1385g;
import com.lingq.core.domain.web2wave.C1545b;
import com.lingq.core.download.C1547b;
import com.lingq.core.download.C1549d;
import com.lingq.core.download.downloader.C1550a;
import com.lingq.core.navigation.C1552a;
import com.lingq.core.network.interceptors.C1798a;
import com.lingq.core.notifications.C1799a;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.tts.C1819c;
import com.lingq.core.premium.delegate.C1844a;
import com.lingq.core.premium.delegate.C1845b;
import com.lingq.core.user.C1939a;
import com.lingq.feature.reader.rating.p016ui.C2475b;
import com.lingq.feature.widget.C2864b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor$Level;

/* JADX INFO: loaded from: classes.dex */
public final class jy1 implements ro7 {

    /* JADX INFO: renamed from: a */
    public final ky1 f46382a;

    /* JADX INFO: renamed from: b */
    public final int f46383b;

    public jy1(ky1 ky1Var, int i) {
        this.f46382a = ky1Var;
        this.f46383b = i;
    }

    /* JADX INFO: renamed from: a */
    public final Object m14745a() {
        int i = this.f46383b;
        int i2 = 3;
        int i3 = 5;
        int i4 = 6;
        int i5 = 7;
        int i6 = 9;
        int i7 = 13;
        int i8 = 16;
        int i9 = 20;
        int i10 = 22;
        int i11 = 23;
        int i12 = 24;
        int i13 = 4;
        int i14 = 8;
        int i15 = 1;
        switch (i) {
            case 0:
                return new C1939a((km7) this.f46382a.f48744t.get(), (lm4) this.f46382a.f48752v.get(), (aq6) this.f46382a.f48764y.get(), (nm7) this.f46382a.f48688f.get(), (C3509qs) this.f46382a.f48768z.get(), (hm5) this.f46382a.f48736r.get(), (si7) this.f46382a.f48692g.get(), (C1307w) this.f46382a.f48592C.get(), (un1) this.f46382a.f48676c.get(), yn1.m25210a());
            case 1:
                return new C1267a((lm7) this.f46382a.f48720n.get(), (C0773b) this.f46382a.f48724o.get(), (LingQDatabase) this.f46382a.f48728p.get(), (df4) this.f46382a.f48680d.get(), (nm7) this.f46382a.f48688f.get(), (si7) this.f46382a.f48692g.get(), (ob1) this.f46382a.f48696h.get(), (ul4) this.f46382a.f48732q.get(), (hm5) this.f46382a.f48736r.get(), (ig8) this.f46382a.f48740s.get());
            case 2:
                return (lm7) ux5.m22985h((o98) this.f46382a.f48716m.get(), lm7.class);
            case 3:
                dr6 dr6Var = (dr6) this.f46382a.f48712l.get();
                df4 df4Var = (df4) this.f46382a.f48680d.get();
                dr6Var.getClass();
                df4Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ah9 ah9Var = ah9.f672a;
                String str = (String) ah9.f673b.getValue();
                Objects.requireNonNull(str, "baseUrl == null");
                dx3 dx3Var = new dx3();
                dx3Var.m10737d(null, str);
                ex3 ex3VarM10734a = dx3Var.m10734a();
                ArrayList arrayList3 = ex3VarM10734a.f38029f;
                if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
                    v63.m23142t(ex3VarM10734a, "baseUrl must end in /: ");
                    return null;
                }
                Regex regex = xv5.f68845e;
                arrayList.add(new wy2(AbstractC3122is.m14103q("application/json"), new cc4(df4Var)));
                arrayList2.add(new zb1(i15));
                arrayList.add(wfb.f66770f);
                ExecutorC3760xi executorC3760xi = v87.f65022a;
                ho5 ho5Var = v87.f65024c;
                ArrayList arrayList4 = new ArrayList(arrayList2);
                List listMo13409p = ho5Var.mo13409p(executorC3760xi);
                arrayList4.addAll(listMo13409p);
                List listMo13410q = ho5Var.mo13410q();
                ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + listMo13410q.size());
                arrayList5.add(new oj0(0));
                arrayList5.addAll(arrayList);
                arrayList5.addAll(listMo13410q);
                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
                listMo13409p.size();
                return new o98(dr6Var, ex3VarM10734a, listUnmodifiableList, listUnmodifiableList2);
            case 4:
                ky1 ky1Var = this.f46382a;
                Context context = ky1Var.f48668a.f39115a;
                C1798a c1798a = (C1798a) ky1Var.f48704j.get();
                yw2 yw2Var = (yw2) this.f46382a.f48708k.get();
                ob1 ob1Var = (ob1) this.f46382a.f48696h.get();
                c1798a.getClass();
                yw2Var.getClass();
                ob1Var.getClass();
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                fl0 fl0Var = new fl0(cacheDir);
                ki1 ki1Var = ki1.f47315g;
                ki1Var.getClass();
                C3040gj c3040gj = new C3040gj();
                c3040gj.f40865a = ki1Var.f47317a;
                c3040gj.f40867c = ki1Var.f47319c;
                c3040gj.f40868d = ki1Var.f47320d;
                c3040gj.f40866b = ki1Var.f47318b;
                c3040gj.m12681e(TlsVersion.TLS_1_2);
                c3040gj.m12679c(c21.f9338m, c21.f9340o, c21.f9335j);
                ki1 ki1VarM12677a = c3040gj.m12677a();
                cr6 cr6Var = new cr6();
                List listSingletonList = Collections.singletonList(ki1VarM12677a);
                listSingletonList.getClass();
                listSingletonList.equals(cr6Var.f34425p);
                cr6Var.f34425p = kcb.m15119j(listSingletonList);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                cr6Var.f34411b = new m58(8, 240L, timeUnit);
                timeUnit.getClass();
                kcb.m15111b();
                cr6Var.f34430u = 60000;
                timeUnit.getClass();
                kcb.m15111b();
                cr6Var.f34429t = 60000;
                cr6Var.f34421l = fl0Var;
                yw3 yw3Var = new yw3();
                HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = HttpLoggingInterceptor$Level.BODY;
                httpLoggingInterceptor$Level.getClass();
                yw3Var.f70566b = httpLoggingInterceptor$Level;
                cr6Var.f34412c.add(c1798a);
                cr6Var.f34412c.add(yw2Var);
                if (ob1Var.m17891d()) {
                    cr6Var.f34412c.add(yw3Var);
                    cr6Var.f34413d.add(yw3Var);
                }
                cr6Var.f34410a = new ny8(2);
                return new dr6(cr6Var);
            case 5:
                ky1 ky1Var2 = this.f46382a;
                Context context2 = ky1Var2.f48668a.f39115a;
                un1 un1Var = (un1) ky1Var2.f48676c.get();
                nm7 nm7Var = (nm7) this.f46382a.f48688f.get();
                si7 si7Var = (si7) this.f46382a.f48692g.get();
                ob1 ob1Var2 = (ob1) this.f46382a.f48696h.get();
                uk6 uk6Var = (uk6) this.f46382a.f48700i.get();
                un1Var.getClass();
                nm7Var.getClass();
                si7Var.getClass();
                ob1Var2.getClass();
                uk6Var.getClass();
                return new C1798a(context2, un1Var, nm7Var, si7Var, ob1Var2, uk6Var);
            case 6:
                v72 v72Var = ph2.f56212a;
                pvc.m19519o(v72Var);
                return vz1.m23619a(eh0.m11113J(r46.m20384i(), v72Var));
            case 7:
                df4 df4Var2 = (df4) this.f46382a.f48680d.get();
                DataStore dataStore = (DataStore) this.f46382a.f48684e.get();
                df4Var2.getClass();
                dataStore.getClass();
                return new C1369b(df4Var2, dataStore);
            case 8:
                return ss5.m21704c(new tf4(28));
            case 9:
                Context context3 = this.f46382a.f48668a.f39115a;
                PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler<>(new C2951e4(i8));
                List<? extends DataMigration<Preferences>> listM23605K = vz1.m23605K(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context3, "com.linguist_preferences", null, 4, null), new sz0());
                v72 v72Var2 = ph2.f56212a;
                t62 t62Var = t62.f61909c;
                nn9 nn9VarM20384i = r46.m20384i();
                t62Var.getClass();
                DataStore<Preferences> dataStoreCreate = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, listM23605K, vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i)), new w02(context3, 0));
                pvc.m19519o(dataStoreCreate);
                return dataStoreCreate;
            case 10:
                df4 df4Var3 = (df4) this.f46382a.f48680d.get();
                nn1 nn1VarM25210a = yn1.m25210a();
                DataStore dataStore2 = (DataStore) this.f46382a.f48684e.get();
                df4Var3.getClass();
                dataStore2.getClass();
                return new C1368a(df4Var3, dataStore2, nn1VarM25210a);
            case 11:
                return new ob1(this.f46382a.f48668a.f39115a);
            case 12:
                return new vk6();
            case 13:
                return new yw2();
            case 14:
                C0773b c0773bM2910c = C0773b.m2910c(this.f46382a.f48668a.f39115a);
                c0773bM2910c.getClass();
                return c0773bM2910c;
            case 15:
                Context context4 = this.f46382a.f48668a.f39115a;
                LingQDatabase.Companion.getClass();
                C0738c c0738cM24779q = xwc.m24779q(context4, LingQDatabase.class, "lingq_db");
                RoomDatabase$JournalMode roomDatabase$JournalMode = RoomDatabase$JournalMode.TRUNCATE;
                roomDatabase$JournalMode.getClass();
                c0738cM24779q.f6834j = roomDatabase$JournalMode;
                c0738cM24779q.m2811a(AbstractC3489q9.f57415j, AbstractC3489q9.f57416k, AbstractC3489q9.f57417l, AbstractC3489q9.f57418m, AbstractC3489q9.f57419n, AbstractC3489q9.f57420o, AbstractC3489q9.f57423r, AbstractC3489q9.f57421p, AbstractC3489q9.f57422q);
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
                executorServiceNewFixedThreadPool.getClass();
                c0738cM24779q.f6830f = executorServiceNewFixedThreadPool;
                c0738cM24779q.f6840p = false;
                c0738cM24779q.f6841q = true;
                c0738cM24779q.f6842r = true;
                return (LingQDatabase) c0738cM24779q.m2812b();
            case 16:
                LingQDatabase lingQDatabase = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase.getClass();
                ul4 ul4VarMo7435D = lingQDatabase.mo7435D();
                pvc.m19519o(ul4VarMo7435D);
                return ul4VarMo7435D;
            case 17:
                ky1 ky1Var3 = this.f46382a;
                return new C1240a(ky1Var3.f48668a.f39115a, (ob1) ky1Var3.f48696h.get(), (df4) this.f46382a.f48680d.get(), (un1) this.f46382a.f48676c.get());
            case 18:
                df4 df4Var4 = (df4) this.f46382a.f48680d.get();
                nn1 nn1VarM25210a2 = yn1.m25210a();
                DataStore dataStore3 = (DataStore) this.f46382a.f48684e.get();
                df4Var4.getClass();
                dataStore3.getClass();
                return new C1370c(df4Var4, dataStore3, nn1VarM25210a2);
            case 19:
                return new C1293i((LingQDatabase) this.f46382a.f48728p.get(), (ul4) this.f46382a.f48732q.get(), (bn4) this.f46382a.f48748u.get(), (si7) this.f46382a.f48692g.get(), (C0773b) this.f46382a.f48724o.get());
            case 20:
                return (bn4) ux5.m22985h((o98) this.f46382a.f48716m.get(), bn4.class);
            case 21:
                return new C1301q((xp6) this.f46382a.f48756w.get(), (bq6) this.f46382a.f48760x.get());
            case 22:
                LingQDatabase lingQDatabase2 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase2.getClass();
                xp6 xp6VarMo7444M = lingQDatabase2.mo7444M();
                pvc.m19519o(xp6VarMo7444M);
                return xp6VarMo7444M;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return (bq6) ux5.m22985h((o98) this.f46382a.f48716m.get(), bq6.class);
            case 24:
                ky1 ky1Var4 = this.f46382a;
                Context context5 = ky1Var4.f48668a.f39115a;
                df4 df4Var5 = (df4) ky1Var4.f48680d.get();
                df4Var5.getClass();
                return new C3509qs(context5, df4Var5);
            case 25:
                return new C1307w((LingQDatabase) this.f46382a.f48728p.get(), (zca) this.f46382a.f48584A.get(), (cda) this.f46382a.f48588B.get(), (si7) this.f46382a.f48692g.get(), (km7) this.f46382a.f48744t.get());
            case 26:
                LingQDatabase lingQDatabase3 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase3.getClass();
                zca zcaVarMo7450S = lingQDatabase3.mo7450S();
                pvc.m19519o(zcaVarMo7450S);
                return zcaVarMo7450S;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return (cda) ux5.m22985h((o98) this.f46382a.f48716m.get(), cda.class);
            case 28:
                return new C1302r((LingQDatabase) this.f46382a.f48728p.get(), (AbstractC1320h) this.f46382a.f48600E.get(), (C1322j) this.f46382a.f48604F.get(), (io1) this.f46382a.f48608G.get(), (x27) this.f46382a.f48611H.get(), (C1321i) this.f46382a.f48614I.get(), (se7) this.f46382a.f48617J.get(), (ca5) this.f46382a.f48620K.get(), (nm7) this.f46382a.f48688f.get(), (vma) this.f46382a.f48623L.get(), (lj2) this.f46382a.f48626M.get(), (hm5) this.f46382a.f48736r.get(), (C0773b) this.f46382a.f48724o.get(), (df4) this.f46382a.f48680d.get());
            case 29:
                LingQDatabase lingQDatabase4 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase4.getClass();
                AbstractC1320h abstractC1320hMo7438G = lingQDatabase4.mo7438G();
                pvc.m19519o(abstractC1320hMo7438G);
                return abstractC1320hMo7438G;
            case 30:
                LingQDatabase lingQDatabase5 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase5.getClass();
                C1322j c1322jMo7446O = lingQDatabase5.mo7446O();
                pvc.m19519o(c1322jMo7446O);
                return c1322jMo7446O;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                LingQDatabase lingQDatabase6 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase6.getClass();
                io1 io1VarMo7432A = lingQDatabase6.mo7432A();
                pvc.m19519o(io1VarMo7432A);
                return io1VarMo7432A;
            case 32:
                LingQDatabase lingQDatabase7 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase7.getClass();
                x27 x27VarMo7445N = lingQDatabase7.mo7445N();
                pvc.m19519o(x27VarMo7445N);
                return x27VarMo7445N;
            case 33:
                LingQDatabase lingQDatabase8 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase8.getClass();
                C1321i c1321iMo7439H = lingQDatabase8.mo7439H();
                pvc.m19519o(c1321iMo7439H);
                return c1321iMo7439H;
            case 34:
                return (se7) ux5.m22985h((o98) this.f46382a.f48716m.get(), se7.class);
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return (ca5) ux5.m22985h((o98) this.f46382a.f48716m.get(), ca5.class);
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                df4 df4Var6 = (df4) this.f46382a.f48680d.get();
                nn1 nn1VarM25210a3 = yn1.m25210a();
                DataStore dataStore4 = (DataStore) this.f46382a.f48684e.get();
                df4Var6.getClass();
                dataStore4.getClass();
                return new C1371d(df4Var6, dataStore4, nn1VarM25210a3);
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return new lj2();
            case 38:
                return new C1290f((LingQDatabase) this.f46382a.f48728p.get(), (io1) this.f46382a.f48608G.get(), (C1316d) this.f46382a.f48632O.get(), (C1321i) this.f46382a.f48614I.get(), (zo1) this.f46382a.f48635P.get(), (od0) this.f46382a.f48638Q.get(), (C0773b) this.f46382a.f48724o.get());
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                LingQDatabase lingQDatabase9 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase9.getClass();
                C1316d c1316dMo7458z = lingQDatabase9.mo7458z();
                pvc.m19519o(c1316dMo7458z);
                return c1316dMo7458z;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return (zo1) ux5.m22985h((o98) this.f46382a.f48716m.get(), zo1.class);
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return (od0) ux5.m22985h((o98) this.f46382a.f48716m.get(), od0.class);
            case 42:
                return new C1294j((C1319g) this.f46382a.f48644S.get(), (bn4) this.f46382a.f48748u.get(), (C0773b) this.f46382a.f48724o.get(), (C2864b) this.f46382a.f48647T.get());
            case 43:
                LingQDatabase lingQDatabase10 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase10.getClass();
                C1319g c1319gMo7436E = lingQDatabase10.mo7436E();
                pvc.m19519o(c1319gMo7436E);
                return c1319gMo7436E;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return new C2864b(this.f46382a.f48668a.f39115a);
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new hy1(this, 10);
            case 46:
                return new hy1(this, 21);
            case 47:
                return new iy1(this, 2);
            case eda.f37086g /* 48 */:
                return new C1286b((C1314b) this.f46382a.f48659X.get(), (od0) this.f46382a.f48638Q.get(), (C0773b) this.f46382a.f48724o.get());
            case 49:
                LingQDatabase lingQDatabase11 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase11.getClass();
                C1314b c1314bMo7454v = lingQDatabase11.mo7454v();
                pvc.m19519o(c1314bMo7454v);
                return c1314bMo7454v;
            case 50:
                return new iy1(this, i7);
            case 51:
                return new C1288d((yp0) this.f46382a.f48669a0.get(), (sr0) this.f46382a.f48673b0.get(), (C0773b) this.f46382a.f48724o.get());
            case 52:
                LingQDatabase lingQDatabase12 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase12.getClass();
                yp0 yp0VarMo7456x = lingQDatabase12.mo7456x();
                pvc.m19519o(yp0VarMo7456x);
                return yp0VarMo7456x;
            case 53:
                return (sr0) ux5.m22985h((o98) this.f46382a.f48716m.get(), sr0.class);
            case 54:
                return new iy1(this, i9);
            case 55:
                return new C1287c((LingQDatabase) this.f46382a.f48728p.get(), (un0) this.f46382a.f48685e0.get(), (o7b) this.f46382a.f48689f0.get(), (AbstractC1320h) this.f46382a.f48600E.get(), (co0) this.f46382a.f48693g0.get(), (x3a) this.f46382a.f48697h0.get(), (nm7) this.f46382a.f48688f.get(), (si7) this.f46382a.f48692g.get(), (C0773b) this.f46382a.f48724o.get(), (df4) this.f46382a.f48680d.get(), (hm5) this.f46382a.f48736r.get(), (y15) this.f46382a.f48701i0.get(), (wv0) this.f46382a.f48705j0.get());
            case 56:
                LingQDatabase lingQDatabase13 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase13.getClass();
                un0 un0VarMo7455w = lingQDatabase13.mo7455w();
                pvc.m19519o(un0VarMo7455w);
                return un0VarMo7455w;
            case 57:
                LingQDatabase lingQDatabase14 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase14.getClass();
                o7b o7bVarMo7452U = lingQDatabase14.mo7452U();
                pvc.m19519o(o7bVarMo7452U);
                return o7bVarMo7452U;
            case 58:
                return (co0) ux5.m22985h((o98) this.f46382a.f48716m.get(), co0.class);
            case 59:
                return (x3a) ux5.m22985h((o98) this.f46382a.f48716m.get(), x3a.class);
            case 60:
                return new a25((hm5) this.f46382a.f48736r.get(), (un1) this.f46382a.f48676c.get(), yn1.m25211b());
            case 61:
                return new yv0((hm5) this.f46382a.f48736r.get(), (un1) this.f46382a.f48676c.get(), yn1.m25211b());
            case 62:
                return new iy1(this, 21);
            case 63:
                return new iy1(this, i10);
            case 64:
                return new iy1(this, i11);
            case 65:
                return new iy1(this, i12);
            case 66:
                return new hy1(this, 0);
            case 67:
                return new hy1(this, i15);
            case 68:
                return new hy1(this, 2);
            case 69:
                return new hy1(this, i2);
            case 70:
                return new n68((w68) this.f46382a.f48745t0.get(), (C0773b) this.f46382a.f48724o.get());
            case 71:
                return (w68) ux5.m22985h((o98) this.f46382a.f48716m.get(), w68.class);
            case 72:
                return new hy1(this, i13);
            case 73:
                return new hy1(this, i3);
            case 74:
                return new hy1(this, i4);
            case 75:
                return new hy1(this, i5);
            case 76:
                return new C1292h((LingQDatabase) this.f46382a.f48728p.get(), (C1318f) this.f46382a.f48769z0.get(), (wi5) this.f46382a.f48585A0.get(), (yf2) this.f46382a.f48589B0.get(), (C0773b) this.f46382a.f48724o.get(), (df4) this.f46382a.f48680d.get());
            case 77:
                LingQDatabase lingQDatabase15 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase15.getClass();
                C1318f c1318fMo7434C = lingQDatabase15.mo7434C();
                pvc.m19519o(c1318fMo7434C);
                return c1318fMo7434C;
            case 78:
                LingQDatabase lingQDatabase16 = (LingQDatabase) this.f46382a.f48728p.get();
                lingQDatabase16.getClass();
                wi5 wi5VarMo7440I = lingQDatabase16.mo7440I();
                pvc.m19519o(wi5VarMo7440I);
                return wi5VarMo7440I;
            case 79:
                return (yf2) ux5.m22985h((o98) this.f46382a.f48716m.get(), yf2.class);
            case 80:
                return new hy1(this, i14);
            case 81:
                return new hy1(this, i6);
            case 82:
                return new hy1(this, 11);
            case 83:
                return new C1306v((LingQDatabase) this.f46382a.f48728p.get(), (v3a) this.f46382a.f48609G0.get(), (x3a) this.f46382a.f48697h0.get(), (o7b) this.f46382a.f48689f0.get(), (df4) this.f46382a.f48680d.get(), (C0773b) this.f46382a.f48724o.get());
            case 84:
                return AbstractC3786y7.m24974j((LingQDatabase) this.f46382a.f48728p.get());
            case 85:
                return new hy1(this, 12);
            case 86:
                return new hy1(this, i7);
            case 87:
                return new hy1(this, 14);
            case 88:
                return new hy1(this, 15);
            case 89:
                return new hy1(this, i8);
            case 90:
                return new hy1(this, 17);
            case 91:
                return new hy1(this, 18);
            case 92:
                return new hy1(this, 19);
            case 93:
                return new hy1(this, i9);
            case 94:
                return new hy1(this, i10);
            case 95:
                return new C1295k((LingQDatabase) this.f46382a.f48728p.get(), (AbstractC1320h) this.f46382a.f48600E.get(), (un0) this.f46382a.f48685e0.get(), (o7b) this.f46382a.f48689f0.get(), (C1321i) this.f46382a.f48614I.get(), (k65) this.f46382a.f48645S0.get(), (ca5) this.f46382a.f48620K.get(), (od0) this.f46382a.f48638Q.get(), (hm5) this.f46382a.f48736r.get(), (C0773b) this.f46382a.f48724o.get(), (df4) this.f46382a.f48680d.get(), (si7) this.f46382a.f48692g.get(), (un1) this.f46382a.f48676c.get(), yn1.m25210a());
            case 96:
                return (k65) ux5.m22985h((o98) this.f46382a.f48716m.get(), k65.class);
            case 97:
                return new hy1(this, i11);
            case 98:
                return new hy1(this, i12);
            case 99:
                return new hy1(this, 25);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f46383b;
        int i2 = i / 100;
        if (i2 == 0) {
            return m14745a();
        }
        int i3 = 1;
        if (i2 != 1) {
            throw new AssertionError(i);
        }
        ky1 ky1Var = this.f46382a;
        switch (i) {
            case 100:
                return new hy1(this, 26);
            case 101:
                return new hy1(this, 27);
            case 102:
                return new hy1(this, 28);
            case 103:
                return new hy1(this, 29);
            case 104:
                return new iy1(this, 0);
            case 105:
                return new iy1(this, i3);
            case 106:
                return new iy1(this, 3);
            case 107:
                return new iy1(this, 4);
            case 108:
                return new iy1(this, 5);
            case 109:
                return new iy1(this, 6);
            case 110:
                return new C1289e((C1315c) ky1Var.f48698h1.get(), (un0) ky1Var.f48685e0.get(), (o7b) ky1Var.f48689f0.get(), (zx0) ky1Var.f48702i1.get(), (df4) ky1Var.f48680d.get());
            case 111:
                LingQDatabase lingQDatabase = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase.getClass();
                C1315c c1315cMo7457y = lingQDatabase.mo7457y();
                pvc.m19519o(c1315cMo7457y);
                return c1315cMo7457y;
            case 112:
                return (zx0) ux5.m22985h((o98) ky1Var.f48716m.get(), zx0.class);
            case 113:
                return new iy1(this, 7);
            case 114:
                return new C1298n((uy5) ky1Var.f48714l1.get(), (yy5) ky1Var.f48718m1.get(), (C0773b) ky1Var.f48724o.get());
            case 115:
                LingQDatabase lingQDatabase2 = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase2.getClass();
                uy5 uy5VarMo7441J = lingQDatabase2.mo7441J();
                pvc.m19519o(uy5VarMo7441J);
                return uy5VarMo7441J;
            case 116:
                return (yy5) ux5.m22985h((o98) ky1Var.f48716m.get(), yy5.class);
            case 117:
                return new iy1(this, 8);
            case 118:
                return new C1299o((lm6) ky1Var.f48730p1.get(), (nm6) ky1Var.f48734q1.get(), (C0773b) ky1Var.f48724o.get(), (df4) ky1Var.f48680d.get());
            case 119:
                LingQDatabase lingQDatabase3 = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase3.getClass();
                lm6 lm6VarMo7442K = lingQDatabase3.mo7442K();
                pvc.m19519o(lm6VarMo7442K);
                return lm6VarMo7442K;
            case 120:
                return (nm6) ux5.m22985h((o98) ky1Var.f48716m.get(), nm6.class);
            case 121:
                return new iy1(this, 9);
            case 122:
                return new C1300p((dn6) ky1Var.f48746t1.get(), (fn6) ky1Var.f48750u1.get(), (C0773b) ky1Var.f48724o.get(), (df4) ky1Var.f48680d.get());
            case 123:
                LingQDatabase lingQDatabase4 = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase4.getClass();
                dn6 dn6VarMo7443L = lingQDatabase4.mo7443L();
                pvc.m19519o(dn6VarMo7443L);
                return dn6VarMo7443L;
            case 124:
                return (fn6) ux5.m22985h((o98) ky1Var.f48716m.get(), fn6.class);
            case 125:
                return new iy1(this, 10);
            case 126:
                return new iy1(this, 11);
            case 127:
                return new iy1(this, 12);
            case 128:
                return new iy1(this, 14);
            case 129:
                return new iy1(this, 15);
            case 130:
                return new iy1(this, 16);
            case 131:
                return new iy1(this, 17);
            case 132:
                return new C1296l((LingQDatabase) ky1Var.f48728p.get(), (ca5) ky1Var.f48620K.get(), (od0) ky1Var.f48638Q.get(), (C1321i) ky1Var.f48614I.get(), (AbstractC1320h) ky1Var.f48600E.get(), (C1322j) ky1Var.f48604F.get(), (C0773b) ky1Var.f48724o.get());
            case 133:
                return new iy1(this, 18);
            case 134:
                return new C1310z((o7b) ky1Var.f48689f0.get(), (AbstractC1320h) ky1Var.f48600E.get(), (t7b) ky1Var.f48606F1.get(), (C0773b) ky1Var.f48724o.get(), (hm5) ky1Var.f48736r.get(), ky1Var.m15727a(), (y15) ky1Var.f48701i0.get(), (wv0) ky1Var.f48705j0.get());
            case 135:
                return AbstractC3786y7.m24976l((o98) ky1Var.f48716m.get());
            case 136:
                return new iy1(this, 19);
            case 137:
                return new tm5(ky1Var.f48668a.f39115a);
            case 138:
                return new C1844a((un1) ky1Var.f48676c.get(), (vma) ky1Var.f48623L.get(), (si7) ky1Var.f48692g.get(), ky1Var.m15728b(), (pha) ky1Var.f48625L1.get());
            case 139:
                return new C1845b((un1) ky1Var.f48676c.get(), (km7) ky1Var.f48744t.get(), (nm7) ky1Var.f48688f.get(), (hm5) ky1Var.f48736r.get(), (ob1) ky1Var.f48696h.get(), (cma) ky1Var.f48596D.get(), (e4b) ky1Var.f48622K1.get(), ky1Var.m15728b());
            case 140:
                return new f4b((C3509qs) ky1Var.f48768z.get(), (un1) ky1Var.f48676c.get());
            case 141:
                return new C1819c(ky1Var.f48668a.f39115a, (un1) ky1Var.f48676c.get(), yn1.m25211b(), yn1.m25210a(), (C1307w) ky1Var.f48592C.get(), (d65) ky1Var.f48648T0.get(), (si7) ky1Var.f48692g.get(), (cma) ky1Var.f48596D.get(), (C1550a) ky1Var.f48631N1.get());
            case 142:
                return new C1550a();
            case 143:
                return new m3a();
            case 144:
                return new C1552a((cma) ky1Var.f48596D.get(), (nm7) ky1Var.f48688f.get(), (si7) ky1Var.f48692g.get(), new C1545b((s2b) ky1Var.f48640Q1.get(), (C1309y) ky1Var.f48646S1.get()), (un1) ky1Var.f48676c.get(), yn1.m25210a());
            case 145:
                nn1 nn1VarM25210a = yn1.m25210a();
                DataStore dataStore = (DataStore) ky1Var.f48684e.get();
                dataStore.getClass();
                return new C1372e(dataStore, nn1VarM25210a);
            case 146:
                return new C1309y((C1312a) ky1Var.f48643R1.get());
            case 147:
                return new C1312a((ob1) ky1Var.f48696h.get(), yn1.m25210a());
            case 148:
                return new cia((C3509qs) ky1Var.f48768z.get(), (hm5) ky1Var.f48736r.get());
            case 149:
                return new C1808b(ky1Var.f48668a.f39115a, (un1) ky1Var.f48676c.get(), yn1.m25211b(), (vma) ky1Var.f48623L.get(), (C3509qs) ky1Var.f48768z.get(), (dc7) ky1Var.f48655V1.get(), (InterfaceC3733ws) ky1Var.f48658W1.get(), new C1385g((d65) ky1Var.f48648T0.get(), (vma) ky1Var.f48623L.get()), (q97) ky1Var.f48661X1.get(), (rb7) ky1Var.f48664Y1.get(), new cc4((d65) ky1Var.f48648T0.get()));
            case 150:
                return new ec7();
            case 151:
                return new C3770xs((oo4) ky1Var.f48650U.get(), (cma) ky1Var.f48596D.get());
            case 152:
                return new q97();
            case 153:
                return new rb7((hm5) ky1Var.f48736r.get(), (y15) ky1Var.f48701i0.get(), new nr9((d65) ky1Var.f48648T0.get()), (un1) ky1Var.f48676c.get());
            case 154:
                og8 og8Var = new og8();
                og8Var.f54320a = EmptySet.f47640a;
                return og8Var;
            case 155:
                return new C1291g((i9b) ky1Var.f48675b2.get(), (C1317e) ky1Var.f48679c2.get());
            case 156:
                return (i9b) ux5.m22985h((o98) ky1Var.f48716m.get(), i9b.class);
            case 157:
                LingQDatabase lingQDatabase5 = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase5.getClass();
                C1317e c1317eMo7433B = lingQDatabase5.mo7433B();
                pvc.m19519o(c1317eMo7433B);
                return c1317eMo7433B;
            case 158:
                return new aq9(ky1Var.f48668a.f39115a);
            case 159:
                return new C1549d(ky1Var.f48668a.f39115a, (un1) ky1Var.f48676c.get(), (si7) ky1Var.f48692g.get(), (C1550a) ky1Var.f48631N1.get());
            case 160:
                return new C1265a((C0773b) ky1Var.f48724o.get());
            case 161:
                return new C1547b(ky1Var.f48668a.f39115a, (un1) ky1Var.f48676c.get(), (xd7) ky1Var.f48629N.get(), (C1550a) ky1Var.f48631N1.get(), (lj2) ky1Var.f48626M.get());
            case 162:
                return new C1238a((cma) ky1Var.f48596D.get(), (qn6) ky1Var.f48703i2.get(), (un1) ky1Var.f48676c.get());
            case 163:
                return new C1799a((en6) ky1Var.f48754v1.get(), (vma) ky1Var.f48623L.get(), (cma) ky1Var.f48596D.get(), (un1) ky1Var.f48676c.get(), yn1.m25210a());
            case 164:
                return new f7a((C3509qs) ky1Var.f48768z.get());
            case 165:
                return new C1297m((LingQDatabase) ky1Var.f48728p.get(), (wi5) ky1Var.f48585A0.get(), (yf2) ky1Var.f48589B0.get());
            case 166:
                return new C1305u((LingQDatabase) ky1Var.f48728p.get(), (np8) ky1Var.f48719m2.get(), (AbstractC1320h) ky1Var.f48600E.get(), (un0) ky1Var.f48685e0.get(), (o7b) ky1Var.f48689f0.get(), (io1) ky1Var.f48608G.get(), (C1321i) ky1Var.f48614I.get(), (si7) ky1Var.f48692g.get(), (k65) ky1Var.f48645S0.get(), (zo1) ky1Var.f48635P.get(), (ys8) ky1Var.f48723n2.get(), (ca5) ky1Var.f48620K.get());
            case 167:
                return AbstractC3786y7.m24972h((LingQDatabase) ky1Var.f48728p.get());
            case 168:
                return AbstractC3786y7.m24973i((o98) ky1Var.f48716m.get());
            case 169:
                return new C1304t((u38) ky1Var.f48731p2.get(), (v38) ky1Var.f48735q2.get(), (nm7) ky1Var.f48688f.get());
            case 170:
                return AbstractC3786y7.m24970f((LingQDatabase) ky1Var.f48728p.get());
            case 171:
                return AbstractC3786y7.m24971g((o98) ky1Var.f48716m.get());
            case 172:
                return new C1285a((C1313a) ky1Var.f48743s2.get(), (yy5) ky1Var.f48718m1.get());
            case 173:
                return AbstractC3786y7.m24966b((LingQDatabase) ky1Var.f48728p.get());
            case 174:
                return new lx4((hx4) ky1Var.f48751u2.get());
            case 175:
                return AbstractC3786y7.m24968d((LingQDatabase) ky1Var.f48728p.get());
            case 176:
                return new C2475b((vma) ky1Var.f48623L.get(), (hm5) ky1Var.f48736r.get(), (un1) ky1Var.f48676c.get());
            case 177:
                return new C1308x((LingQDatabase) ky1Var.f48728p.get(), (AbstractC1323k) ky1Var.f48763x2.get(), (io1) ky1Var.f48608G.get(), (AbstractC1320h) ky1Var.f48600E.get(), (co0) ky1Var.f48693g0.get(), (vma) ky1Var.f48623L.get(), (df4) ky1Var.f48680d.get());
            case 178:
                LingQDatabase lingQDatabase6 = (LingQDatabase) ky1Var.f48728p.get();
                lingQDatabase6.getClass();
                AbstractC1323k abstractC1323kMo7451T = lingQDatabase6.mo7451T();
                pvc.m19519o(abstractC1323kMo7451T);
                return abstractC1323kMo7451T;
            case 179:
                return AbstractC3786y7.m24969e(ky1Var.f48668a.f39115a);
            case 180:
                return new bf7();
            case 181:
                return new C1239b((xy5) ky1Var.f48722n1.get(), (oo4) ky1Var.f48650U.get(), (si7) ky1Var.f48692g.get(), (cma) ky1Var.f48596D.get(), (cz5) ky1Var.f48707j2.get(), (qn6) ky1Var.f48703i2.get(), (un1) ky1Var.f48676c.get());
            case 182:
                return new yp9();
            case 183:
                return new kf8();
            case 184:
                return new kka();
            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                return new rya();
            default:
                throw new AssertionError(i);
        }
    }
}
