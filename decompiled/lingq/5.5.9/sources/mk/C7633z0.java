package mk;

import ae.C0062b;
import ai.C0079a;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import androidx.room.RoomDatabase;
import bi.AbstractC1388a;
import bi.AbstractC1402b5;
import bi.AbstractC1413d0;
import bi.AbstractC1440g3;
import bi.AbstractC1450h5;
import bi.AbstractC1454i2;
import bi.AbstractC1469k3;
import bi.AbstractC1485m5;
import bi.AbstractC1486n;
import bi.AbstractC1495o1;
import bi.AbstractC1497o3;
import bi.AbstractC1518r3;
import bi.AbstractC1520r5;
import bi.AbstractC1529t0;
import bi.AbstractC1562x5;
import bi.AbstractC1568y4;
import bi.InterfaceC1539u3;
import bj.C1599v;
import bj.InterfaceC1598u;
import ci.InterfaceC2008a;
import ci.InterfaceC2009b;
import ci.InterfaceC2010c;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2013f;
import ci.InterfaceC2014g;
import ci.InterfaceC2015h;
import ci.InterfaceC2016i;
import ci.InterfaceC2017j;
import ci.InterfaceC2018k;
import ci.InterfaceC2019l;
import ci.InterfaceC2020m;
import ci.InterfaceC2021n;
import ci.InterfaceC2022o;
import ci.InterfaceC2023p;
import ci.InterfaceC2024q;
import ci.InterfaceC2025r;
import ci.InterfaceC2026s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.kochava.tracker.BuildConfig;
import com.lingq.commons.controllers.DeepLinkControllerImpl;
import com.lingq.commons.controllers.InterfaceC3273a;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.commons.controllers.MilestonesControllerDelegateImpl;
import com.lingq.commons.controllers.MilestonesControllerImpl;
import com.lingq.commons.controllers.NotificationsControllerImpl;
import com.lingq.commons.controllers.TtsControllerImpl;
import com.lingq.p055ui.session.UserSessionViewModelDelegateImpl;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayerStatusViewModelDelegateImpl;
import com.lingq.shared.download.DownloadManagerDelegateImpl;
import com.lingq.shared.download.FontDownloadManagerDelegateImpl;
import com.lingq.shared.network.adapters.CardsAdapter;
import com.lingq.shared.network.adapters.ParagraphAdapter;
import com.lingq.shared.network.adapters.WordsAdapter;
import com.lingq.shared.network.interceptors.C3313a;
import com.lingq.shared.p054di.SharedModule;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.persistent.dao.DictionaryDao;
import com.lingq.shared.persistent.dao.LanguageStatsDao;
import com.lingq.shared.persistent.dao.PlaylistDao;
import com.lingq.shared.repository.CardRepositoryImpl;
import com.lingq.shared.repository.ChallengeRepositoryImpl;
import com.lingq.shared.repository.CourseRepositoryImpl;
import com.lingq.shared.repository.DictionaryRepositoryImpl;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.repository.LanguageRepositoryImpl;
import com.lingq.shared.repository.LanguageStatsRepositoryImpl;
import com.lingq.shared.repository.LessonRepositoryImpl;
import com.lingq.shared.repository.LibraryRepositoryImpl;
import com.lingq.shared.repository.LocaleRepositoryImpl;
import com.lingq.shared.repository.MilestoneRepositoryImpl;
import com.lingq.shared.repository.NoticeRepositoryImpl;
import com.lingq.shared.repository.NotificationRepositoryImpl;
import com.lingq.shared.repository.PlaylistRepositoryImpl;
import com.lingq.shared.repository.ProfileRepositoryImpl;
import com.lingq.shared.repository.ReferralRepositoryImpl;
import com.lingq.shared.repository.SearchRepositoryImpl;
import com.lingq.shared.repository.TokenDataRepositoryImpl;
import com.lingq.shared.repository.TtsRepositoryImpl;
import com.lingq.shared.repository.VocabularyRepositoryImpl;
import com.lingq.shared.repository.WordRepositoryImpl;
import com.lingq.shared.storage.PreferenceStoreImpl;
import com.lingq.shared.storage.ProfileStoreImpl;
import com.lingq.shared.storage.ReviewStoreImpl;
import com.lingq.shared.storage.UtilStoreImpl;
import com.linguist.LingQApplication;
import com.squareup.moshi.C4955q;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.fetch.FetchImpl;
import dm.C5206f;
import dm.C5207g;
import fj.C5548i;
import fj.InterfaceC5547h;
import fk.C5562d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jp.C6533a;
import jp.C6537e;
import jp.C6540h;
import jp.C6546n;
import jp.C6550r;
import jp.C6554v;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.C7178b;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import kp.C7199a;
import ni.C7796d;
import ni.C7797e;
import nl.C7800a;
import no.C7832g0;
import no.InterfaceC7882z;
import okhttp3.C8072a;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;
import p015ak.InterfaceC0113j;
import p026b5.AbstractC1317j;
import p041c5.C1699a0;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5181c;
import p076di.InterfaceC5182d;
import p099el.C5427b;
import p122fl.C5578a;
import p122fl.C5579b;
import p122fl.C5580c;
import p161hl.C6078a;
import p183ik.C6354q;
import p204jj.C6485f;
import p204jj.InterfaceC6484e;
import p205jk.C6516l;
import p205jk.InterfaceC6515k;
import p225kk.C6704a;
import p244lh.C7365b;
import p244lh.InterfaceC7364a;
import p244lh.InterfaceC7366c;
import p244lh.InterfaceC7367d;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p290o6.C7965k0;
import p342qh.C8628c;
import p346ql.C8642a;
import p354r3.C8727a;
import p371rl.InterfaceC8825a;
import p385sf.C9000b;
import p387t0.C9166r;
import p416uh.InterfaceC9527a;
import p416uh.InterfaceC9529c;
import p417ui.C9531b;
import p417ui.InterfaceC9530a;
import p437vh.C9724b;
import p437vh.C9725c;
import p460wh.InterfaceC9933a;
import p460wh.InterfaceC9934b;
import p460wh.InterfaceC9935c;
import p460wh.InterfaceC9936d;
import p460wh.InterfaceC9937e;
import p460wh.InterfaceC9938f;
import p460wh.InterfaceC9939g;
import p460wh.InterfaceC9940h;
import p460wh.InterfaceC9941i;
import p460wh.InterfaceC9942j;
import p460wh.InterfaceC9943k;
import p460wh.InterfaceC9944l;
import p460wh.InterfaceC9945m;
import p460wh.InterfaceC9946n;
import p460wh.InterfaceC9947o;
import p460wh.InterfaceC9948p;
import p460wh.InterfaceC9949q;
import p460wh.InterfaceC9950r;
import p463wk.C9959b;
import p463wk.C9960c;
import p463wk.InterfaceC9958a;
import p486xh.C10190b;
import p486xh.C10192d;
import p486xh.InterfaceC10189a;
import sh.C9011g;
import sh.C9014j;
import sh.InterfaceC9010f;
import sh.InterfaceC9013i;
import so.C9088f;
import so.C9089g;
import so.C9096n;
import so.C9100r;
import th.C9285b;
import th.InterfaceC9284a;
import to.C9347b;
import uk.C9553b;

/* JADX INFO: renamed from: mk.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7633z0 extends AbstractC7598i1 {

    /* JADX INFO: renamed from: a */
    public final C7800a f41958a;

    /* JADX INFO: renamed from: b */
    public final C7633z0 f41961b = this;

    /* JADX INFO: renamed from: c */
    public InterfaceC8825a<LingQDatabase> f41964c = C0166e.m772s(this, 2);

    /* JADX INFO: renamed from: d */
    public InterfaceC8825a<AbstractC1495o1> f41967d = C0166e.m772s(this, 3);

    /* JADX INFO: renamed from: e */
    public InterfaceC8825a<PlaylistDao> f41970e = C0166e.m772s(this, 4);

    /* JADX INFO: renamed from: f */
    public InterfaceC8825a<AbstractC1413d0> f41973f = C0166e.m772s(this, 5);

    /* JADX INFO: renamed from: g */
    public InterfaceC8825a<InterfaceC1539u3> f41976g = C0166e.m772s(this, 6);

    /* JADX INFO: renamed from: h */
    public InterfaceC8825a<AbstractC1454i2> f41979h = C0166e.m772s(this, 7);

    /* JADX INFO: renamed from: i */
    public InterfaceC8825a<C4955q> f41982i = C0166e.m772s(this, 13);

    /* JADX INFO: renamed from: j */
    public InterfaceC8825a<InterfaceC5180b> f41985j = C0166e.m772s(this, 12);

    /* JADX INFO: renamed from: k */
    public InterfaceC8825a<C7797e> f41988k = C0166e.m772s(this, 14);

    /* JADX INFO: renamed from: l */
    public InterfaceC8825a<InterfaceC10189a> f41991l = C8642a.m16861a(new a(this, 15));

    /* JADX INFO: renamed from: m */
    public InterfaceC8825a<C3313a> f41994m = C0166e.m772s(this, 11);

    /* JADX INFO: renamed from: n */
    public InterfaceC8825a<C9100r> f41997n = C0166e.m772s(this, 10);

    /* JADX INFO: renamed from: o */
    public InterfaceC8825a<C6554v> f42000o = C0166e.m772s(this, 9);

    /* JADX INFO: renamed from: p */
    public InterfaceC8825a<InterfaceC9943k> f42003p = C0166e.m772s(this, 8);

    /* JADX INFO: renamed from: q */
    public InterfaceC8825a<InterfaceC9939g> f42006q = C0166e.m772s(this, 16);

    /* JADX INFO: renamed from: r */
    public InterfaceC8825a<InterfaceC5182d> f42009r = C0166e.m772s(this, 17);

    /* JADX INFO: renamed from: s */
    public InterfaceC8825a<C7796d> f42012s = C0166e.m772s(this, 18);

    /* JADX INFO: renamed from: t */
    public InterfaceC8825a<AbstractC1317j> f42015t = C0166e.m772s(this, 19);

    /* JADX INFO: renamed from: u */
    public InterfaceC8825a<InterfaceC2019l> f42018u = C8642a.m16861a(new a(this, 1));

    /* JADX INFO: renamed from: v */
    public InterfaceC8825a<Object> f42021v = C0141b.m617m(this, 0);

    /* JADX INFO: renamed from: w */
    public InterfaceC8825a<LanguageStatsDao> f42024w = C0166e.m772s(this, 22);

    /* JADX INFO: renamed from: x */
    public InterfaceC8825a<InterfaceC9937e> f42027x = C0166e.m772s(this, 23);

    /* JADX INFO: renamed from: y */
    public InterfaceC8825a<InterfaceC2013f> f42030y = C8642a.m16861a(new a(this, 21));

    /* JADX INFO: renamed from: z */
    public InterfaceC8825a<Object> f42033z = C0141b.m617m(this, 20);

    /* JADX INFO: renamed from: A */
    public InterfaceC8825a<AbstractC1388a> f41897A = C0166e.m772s(this, 26);

    /* JADX INFO: renamed from: B */
    public InterfaceC8825a<AbstractC1562x5> f41900B = C0166e.m772s(this, 27);

    /* JADX INFO: renamed from: C */
    public InterfaceC8825a<InterfaceC9933a> f41903C = C0166e.m772s(this, 28);

    /* JADX INFO: renamed from: D */
    public InterfaceC8825a<InterfaceC2008a> f41906D = C8642a.m16861a(new a(this, 25));

    /* JADX INFO: renamed from: E */
    public InterfaceC8825a<Object> f41909E = C0141b.m617m(this, 24);

    /* JADX INFO: renamed from: F */
    public InterfaceC8825a<Object> f41912F = C0141b.m617m(this, 29);

    /* JADX INFO: renamed from: G */
    public InterfaceC8825a<Object> f41915G = C0141b.m617m(this, 30);

    /* JADX INFO: renamed from: H */
    public InterfaceC8825a<Object> f41918H = C0141b.m617m(this, 31);

    /* JADX INFO: renamed from: I */
    public InterfaceC8825a<AbstractC1486n> f41921I = C0166e.m772s(this, 34);

    /* JADX INFO: renamed from: J */
    public InterfaceC8825a<InterfaceC9934b> f41924J = C0166e.m772s(this, 35);

    /* JADX INFO: renamed from: K */
    public InterfaceC8825a<InterfaceC2009b> f41926K = C8642a.m16861a(new a(this, 33));

    /* JADX INFO: renamed from: L */
    public InterfaceC8825a<Object> f41928L = C0141b.m617m(this, 32);

    /* JADX INFO: renamed from: M */
    public InterfaceC8825a<Object> f41930M = C0141b.m617m(this, 36);

    /* JADX INFO: renamed from: N */
    public InterfaceC8825a<InterfaceC9935c> f41932N = C0166e.m772s(this, 39);

    /* JADX INFO: renamed from: O */
    public InterfaceC8825a<InterfaceC2010c> f41934O = C8642a.m16861a(new a(this, 38));

    /* JADX INFO: renamed from: P */
    public InterfaceC8825a<Object> f41936P = C0141b.m617m(this, 37);

    /* JADX INFO: renamed from: Q */
    public InterfaceC8825a<Object> f41938Q = C0141b.m617m(this, 40);

    /* JADX INFO: renamed from: R */
    public InterfaceC8825a<InterfaceC9946n> f41940R = C0166e.m772s(this, 43);

    /* JADX INFO: renamed from: S */
    public InterfaceC8825a<InterfaceC9284a> f41942S = C8642a.m16861a(new a(this, 42));

    /* JADX INFO: renamed from: T */
    public InterfaceC8825a<Object> f41944T = C0141b.m617m(this, 41);

    /* JADX INFO: renamed from: U */
    public InterfaceC8825a<DictionaryDao> f41946U = C0166e.m772s(this, 46);

    /* JADX INFO: renamed from: V */
    public InterfaceC8825a<AbstractC1440g3> f41948V = C0166e.m772s(this, 47);

    /* JADX INFO: renamed from: W */
    public InterfaceC8825a<InterfaceC9936d> f41950W = C0166e.m772s(this, 48);

    /* JADX INFO: renamed from: X */
    public InterfaceC8825a<InterfaceC2011d> f41952X = C8642a.m16861a(new a(this, 45));

    /* JADX INFO: renamed from: Y */
    public InterfaceC8825a<Object> f41954Y = C0141b.m617m(this, 44);

    /* JADX INFO: renamed from: Z */
    public InterfaceC8825a<Object> f41956Z = C0141b.m617m(this, 49);

    /* JADX INFO: renamed from: a0 */
    public InterfaceC8825a<Object> f41959a0 = C0141b.m617m(this, 50);

    /* JADX INFO: renamed from: b0 */
    public InterfaceC8825a<AbstractC1529t0> f41962b0 = C0166e.m772s(this, 53);

    /* JADX INFO: renamed from: c0 */
    public InterfaceC8825a<InterfaceC5179a> f41965c0 = C0166e.m772s(this, 54);

    /* JADX INFO: renamed from: d0 */
    public InterfaceC8825a<InterfaceC2012e> f41968d0 = C8642a.m16861a(new a(this, 52));

    /* JADX INFO: renamed from: e0 */
    public InterfaceC8825a<Object> f41971e0 = C0141b.m617m(this, 51);

    /* JADX INFO: renamed from: f0 */
    public InterfaceC8825a<Object> f41974f0 = C0141b.m617m(this, 55);

    /* JADX INFO: renamed from: g0 */
    public InterfaceC8825a<Object> f41977g0 = C0141b.m617m(this, 56);

    /* JADX INFO: renamed from: h0 */
    public InterfaceC8825a<Object> f41980h0 = C0141b.m617m(this, 57);

    /* JADX INFO: renamed from: i0 */
    public InterfaceC8825a<Object> f41983i0 = C0141b.m617m(this, 58);

    /* JADX INFO: renamed from: j0 */
    public InterfaceC8825a<Object> f41986j0 = C0141b.m617m(this, 59);

    /* JADX INFO: renamed from: k0 */
    public InterfaceC8825a<Object> f41989k0 = C0141b.m617m(this, 60);

    /* JADX INFO: renamed from: l0 */
    public InterfaceC8825a<Object> f41992l0 = C0141b.m617m(this, 61);

    /* JADX INFO: renamed from: m0 */
    public InterfaceC8825a<InterfaceC9938f> f41995m0 = C0166e.m772s(this, 64);

    /* JADX INFO: renamed from: n0 */
    public InterfaceC8825a<InterfaceC3324a> f41998n0 = C8642a.m16861a(new a(this, 63));

    /* JADX INFO: renamed from: o0 */
    public InterfaceC8825a<Object> f42001o0 = C0141b.m617m(this, 62);

    /* JADX INFO: renamed from: p0 */
    public InterfaceC8825a<Object> f42004p0 = C0141b.m617m(this, 65);

    /* JADX INFO: renamed from: q0 */
    public InterfaceC8825a<Object> f42007q0 = C0141b.m617m(this, 66);

    /* JADX INFO: renamed from: r0 */
    public InterfaceC8825a<Object> f42010r0 = C0141b.m617m(this, 67);

    /* JADX INFO: renamed from: s0 */
    public InterfaceC8825a<Object> f42013s0 = C0141b.m617m(this, 68);

    /* JADX INFO: renamed from: t0 */
    public InterfaceC8825a<Object> f42016t0 = C0141b.m617m(this, 69);

    /* JADX INFO: renamed from: u0 */
    public InterfaceC8825a<Object> f42019u0 = C0141b.m617m(this, 70);

    /* JADX INFO: renamed from: v0 */
    public InterfaceC8825a<Object> f42022v0 = C0141b.m617m(this, 71);

    /* JADX INFO: renamed from: w0 */
    public InterfaceC8825a<Object> f42025w0 = C0141b.m617m(this, 72);

    /* JADX INFO: renamed from: x0 */
    public InterfaceC8825a<Object> f42028x0 = C0141b.m617m(this, 73);

    /* JADX INFO: renamed from: y0 */
    public InterfaceC8825a<Object> f42031y0 = C0141b.m617m(this, 74);

    /* JADX INFO: renamed from: z0 */
    public InterfaceC8825a<AbstractC1469k3> f42034z0 = C0166e.m772s(this, 77);

    /* JADX INFO: renamed from: A0 */
    public InterfaceC8825a<InterfaceC9940h> f41898A0 = C0166e.m772s(this, 78);

    /* JADX INFO: renamed from: B0 */
    public InterfaceC8825a<InterfaceC2016i> f41901B0 = C8642a.m16861a(new a(this, 76));

    /* JADX INFO: renamed from: C0 */
    public InterfaceC8825a<Object> f41904C0 = C0141b.m617m(this, 75);

    /* JADX INFO: renamed from: D0 */
    public InterfaceC8825a<AbstractC1497o3> f41907D0 = C0166e.m772s(this, 81);

    /* JADX INFO: renamed from: E0 */
    public InterfaceC8825a<InterfaceC9941i> f41910E0 = C0166e.m772s(this, 82);

    /* JADX INFO: renamed from: F0 */
    public InterfaceC8825a<InterfaceC2017j> f41913F0 = C8642a.m16861a(new a(this, 80));

    /* JADX INFO: renamed from: G0 */
    public InterfaceC8825a<Object> f41916G0 = C0141b.m617m(this, 79);

    /* JADX INFO: renamed from: H0 */
    public InterfaceC8825a<AbstractC1518r3> f41919H0 = C0166e.m772s(this, 85);

    /* JADX INFO: renamed from: I0 */
    public InterfaceC8825a<InterfaceC9942j> f41922I0 = C0166e.m772s(this, 86);

    /* JADX INFO: renamed from: J0 */
    public InterfaceC8825a<InterfaceC2018k> f41925J0 = C8642a.m16861a(new a(this, 84));

    /* JADX INFO: renamed from: K0 */
    public InterfaceC8825a<Object> f41927K0 = C0141b.m617m(this, 83);

    /* JADX INFO: renamed from: L0 */
    public InterfaceC8825a<Object> f41929L0 = C0141b.m617m(this, 87);

    /* JADX INFO: renamed from: M0 */
    public InterfaceC8825a<Object> f41931M0 = C0141b.m617m(this, 88);

    /* JADX INFO: renamed from: N0 */
    public InterfaceC8825a<Object> f41933N0 = C0141b.m617m(this, 89);

    /* JADX INFO: renamed from: O0 */
    public InterfaceC8825a<Object> f41935O0 = C0141b.m617m(this, 90);

    /* JADX INFO: renamed from: P0 */
    public InterfaceC8825a<InterfaceC9944l> f41937P0 = C0166e.m772s(this, 93);

    /* JADX INFO: renamed from: Q0 */
    public InterfaceC8825a<InterfaceC2020m> f41939Q0 = C8642a.m16861a(new a(this, 92));

    /* JADX INFO: renamed from: R0 */
    public InterfaceC8825a<Object> f41941R0 = C0141b.m617m(this, 91);

    /* JADX INFO: renamed from: S0 */
    public InterfaceC8825a<InterfaceC9950r> f41943S0 = C0166e.m772s(this, 96);

    /* JADX INFO: renamed from: T0 */
    public InterfaceC8825a<InterfaceC2026s> f41945T0 = C8642a.m16861a(new a(this, 95));

    /* JADX INFO: renamed from: U0 */
    public InterfaceC8825a<Object> f41947U0 = C0141b.m617m(this, 94);

    /* JADX INFO: renamed from: V0 */
    public InterfaceC8825a<Object> f41949V0 = C0141b.m617m(this, 97);

    /* JADX INFO: renamed from: W0 */
    public InterfaceC8825a<C6704a> f41951W0 = C0166e.m772s(this, 98);

    /* JADX INFO: renamed from: X0 */
    public InterfaceC8825a<InterfaceC2014g> f41953X0 = C8642a.m16861a(new a(this, 99));

    /* JADX INFO: renamed from: Y0 */
    public InterfaceC8825a<InterfaceC7882z> f41955Y0 = C0166e.m772s(this, 101);

    /* JADX INFO: renamed from: Z0 */
    public InterfaceC8825a<InterfaceC9013i> f41957Z0 = C8642a.m16861a(new a(this, 102));

    /* JADX INFO: renamed from: a1 */
    public InterfaceC8825a<InterfaceC3301f> f41960a1 = C8642a.m16861a(new a(this, 103));

    /* JADX INFO: renamed from: b1 */
    public InterfaceC8825a<AbstractC1485m5> f41963b1 = C0166e.m772s(this, 106);

    /* JADX INFO: renamed from: c1 */
    public InterfaceC8825a<InterfaceC9949q> f41966c1 = C0166e.m772s(this, 107);

    /* JADX INFO: renamed from: d1 */
    public InterfaceC8825a<InterfaceC2024q> f41969d1 = C8642a.m16861a(new a(this, 105));

    /* JADX INFO: renamed from: e1 */
    public InterfaceC8825a<InterfaceC9527a> f41972e1 = C8642a.m16861a(new a(this, 104));

    /* JADX INFO: renamed from: f1 */
    public InterfaceC8825a<InterfaceC0113j> f41975f1 = C8642a.m16861a(new a(this, 109));

    /* JADX INFO: renamed from: g1 */
    public InterfaceC8825a<InterfaceC7364a> f41978g1 = C8642a.m16861a(new a(this, 108));

    /* JADX INFO: renamed from: h1 */
    public InterfaceC8825a<PlayerController> f41981h1 = C0166e.m772s(this, 100);

    /* JADX INFO: renamed from: i1 */
    public InterfaceC8825a<InterfaceC5181c> f41984i1 = C0166e.m772s(this, 110);

    /* JADX INFO: renamed from: j1 */
    public InterfaceC8825a<InterfaceC3275c> f41987j1 = C8642a.m16861a(new a(this, 111));

    /* JADX INFO: renamed from: k1 */
    public InterfaceC8825a<InterfaceC2015h> f41990k1 = C8642a.m16861a(new a(this, 112));

    /* JADX INFO: renamed from: l1 */
    public InterfaceC8825a<InterfaceC6515k> f41993l1 = C8642a.m16861a(new a(this, 113));

    /* JADX INFO: renamed from: m1 */
    public InterfaceC8825a<InterfaceC9530a> f41996m1 = C8642a.m16861a(new a(this, 114));

    /* JADX INFO: renamed from: n1 */
    public InterfaceC8825a<InterfaceC4912b> f41999n1 = C8642a.m16861a(new a(this, 115));

    /* JADX INFO: renamed from: o1 */
    public InterfaceC8825a<InterfaceC7367d> f42002o1 = C8642a.m16861a(new a(this, 116));

    /* JADX INFO: renamed from: p1 */
    public InterfaceC8825a<InterfaceC3273a> f42005p1 = C8642a.m16861a(new a(this, 117));

    /* JADX INFO: renamed from: q1 */
    public InterfaceC8825a<InterfaceC7368e> f42008q1 = C8642a.m16861a(new a(this, 118));

    /* JADX INFO: renamed from: r1 */
    public InterfaceC8825a<AbstractC1568y4> f42011r1 = C0166e.m772s(this, 120);

    /* JADX INFO: renamed from: s1 */
    public InterfaceC8825a<InterfaceC9945m> f42014s1 = C0166e.m772s(this, 121);

    /* JADX INFO: renamed from: t1 */
    public InterfaceC8825a<InterfaceC2021n> f42017t1 = C8642a.m16861a(new a(this, 119));

    /* JADX INFO: renamed from: u1 */
    public InterfaceC8825a<AbstractC1450h5> f42020u1 = C0166e.m772s(this, 123);

    /* JADX INFO: renamed from: v1 */
    public InterfaceC8825a<InterfaceC9948p> f42023v1 = C0166e.m772s(this, 124);

    /* JADX INFO: renamed from: w1 */
    public InterfaceC8825a<InterfaceC2023p> f42026w1 = C8642a.m16861a(new a(this, 122));

    /* JADX INFO: renamed from: x1 */
    public InterfaceC8825a<InterfaceC4865b> f42029x1 = C8642a.m16861a(new a(this, 125));

    /* JADX INFO: renamed from: y1 */
    public InterfaceC8825a<InterfaceC6484e> f42032y1 = C8642a.m16861a(new a(this, 126));

    /* JADX INFO: renamed from: z1 */
    public InterfaceC8825a<InterfaceC9010f> f42035z1 = C8642a.m16861a(new a(this, 127));

    /* JADX INFO: renamed from: A1 */
    public InterfaceC8825a<InterfaceC7366c> f41899A1 = C8642a.m16861a(new a(this, BuildConfig.SDK_TRUNCATE_LENGTH));

    /* JADX INFO: renamed from: B1 */
    public InterfaceC8825a<InterfaceC1598u> f41902B1 = C8642a.m16861a(new a(this, 129));

    /* JADX INFO: renamed from: C1 */
    public InterfaceC8825a<AbstractC1520r5> f41905C1 = C0166e.m772s(this, 131);

    /* JADX INFO: renamed from: D1 */
    public InterfaceC8825a<InterfaceC2025r> f41908D1 = C8642a.m16861a(new a(this, 130));

    /* JADX INFO: renamed from: E1 */
    public InterfaceC8825a<AbstractC1402b5> f41911E1 = C0166e.m772s(this, 133);

    /* JADX INFO: renamed from: F1 */
    public InterfaceC8825a<InterfaceC9947o> f41914F1 = C0166e.m772s(this, 134);

    /* JADX INFO: renamed from: G1 */
    public InterfaceC8825a<InterfaceC2022o> f41917G1 = C8642a.m16861a(new a(this, 132));

    /* JADX INFO: renamed from: H1 */
    public InterfaceC8825a<InterfaceC9529c> f41920H1 = C8642a.m16861a(new a(this, 135));

    /* JADX INFO: renamed from: I1 */
    public InterfaceC8825a<InterfaceC5547h> f41923I1 = C8642a.m16861a(new a(this, 136));

    /* JADX INFO: renamed from: mk.z0$a */
    public static final class a<T> implements InterfaceC8825a<T> {

        /* JADX INFO: renamed from: a */
        public final C7633z0 f42036a;

        /* JADX INFO: renamed from: b */
        public final int f42037b;

        public a(C7633z0 c7633z0, int i10) {
            this.f42036a = c7633z0;
            this.f42037b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final T m15193a() {
            C7633z0 c7633z0 = this.f42036a;
            int i10 = this.f42037b;
            switch (i10) {
                case 100:
                    Context context = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context);
                    InterfaceC7882z interfaceC7882z = c7633z0.f41955Y0.get();
                    CoroutineDispatcher coroutineDispatcherM16854a = C8628c.m16854a();
                    InterfaceC5182d interfaceC5182d = c7633z0.f42009r.get();
                    C7796d c7796d = c7633z0.f42012s.get();
                    C6704a c6704a = c7633z0.f41951W0.get();
                    InterfaceC9013i interfaceC9013i = c7633z0.f41957Z0.get();
                    InterfaceC3301f interfaceC3301f = c7633z0.f41960a1.get();
                    InterfaceC9527a interfaceC9527a = c7633z0.f41972e1.get();
                    InterfaceC7364a interfaceC7364a = c7633z0.f41978g1.get();
                    C5207g.m11111f(interfaceC7882z, "coroutineScope");
                    C5207g.m11111f(interfaceC5182d, "utilStore");
                    C5207g.m11111f(c7796d, "analytics");
                    C5207g.m11111f(c6704a, "appSettings");
                    C5207g.m11111f(interfaceC9013i, "playerServiceControllerDelegate");
                    C5207g.m11111f(interfaceC3301f, "playerStatusViewModelDelegate");
                    C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
                    C5207g.m11111f(interfaceC7364a, "appUsageController");
                    return (T) new PlayerController(context, interfaceC7364a, interfaceC9013i, interfaceC3301f, interfaceC9527a, interfaceC5182d, c7796d, c6704a, coroutineDispatcherM16854a, interfaceC7882z);
                case 101:
                    C7178b c7178b = C7832g0.f42930a;
                    C9000b.m17242h(c7178b);
                    SharedModule.f17759a.getClass();
                    return (T) C7499b.m14930b(CoroutineContext.DefaultImpls.m13470a(C0062b.m380p(), c7178b));
                case 102:
                    return (T) new C9014j();
                case 103:
                    InterfaceC7882z interfaceC7882z2 = c7633z0.f41955Y0.get();
                    ExecutorC7177a executorC7177a = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a);
                    return (T) new PlayerStatusViewModelDelegateImpl(interfaceC7882z2, executorC7177a, c7633z0.f41998n0.get());
                case 104:
                    Context context2 = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context2);
                    return (T) new DownloadManagerDelegateImpl(context2, c7633z0.f41955Y0.get(), c7633z0.f42018u.get(), c7633z0.f41998n0.get(), c7633z0.f41969d1.get());
                case 105:
                    return (T) new TtsRepositoryImpl(c7633z0.f41964c.get(), c7633z0.f41963b1.get(), c7633z0.f41966c1.get(), c7633z0.f41965c0.get());
                case 106:
                    LingQDatabase lingQDatabase = c7633z0.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase, "db");
                    T t10 = (T) lingQDatabase.mo9463L();
                    C9000b.m17242h(t10);
                    return t10;
                case 107:
                    C6554v c6554v = c7633z0.f42000o.get();
                    C5207g.m11111f(c6554v, "retrofit");
                    Object objM13152b = c6554v.m13152b(InterfaceC9949q.class);
                    C5207g.m11110e(objM13152b, "retrofit.create(TtsService::class.java)");
                    return (T) ((InterfaceC9949q) objM13152b);
                case 108:
                    return (T) new C7365b(c7633z0.f42030y.get(), c7633z0.f41975f1.get());
                case 109:
                    InterfaceC2020m interfaceC2020m = c7633z0.f41939Q0.get();
                    InterfaceC2012e interfaceC2012e = c7633z0.f41968d0.get();
                    InterfaceC5180b interfaceC5180b = c7633z0.f41985j.get();
                    InterfaceC7882z interfaceC7882z3 = c7633z0.f41955Y0.get();
                    ExecutorC7177a executorC7177a2 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a2);
                    return (T) new UserSessionViewModelDelegateImpl(interfaceC2020m, interfaceC2012e, interfaceC5180b, interfaceC7882z3, executorC7177a2);
                case 110:
                    Context context3 = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context3);
                    C4955q c4955q = c7633z0.f41982i.get();
                    ExecutorC7177a executorC7177a3 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a3);
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(c4955q, "moshi");
                    return (T) new ReviewStoreImpl(c4955q, SharedModule.m9434a(context3), executorC7177a3);
                case 111:
                    Context context4 = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context4);
                    InterfaceC7882z interfaceC7882z4 = c7633z0.f41955Y0.get();
                    CoroutineDispatcher coroutineDispatcherM16854a2 = C8628c.m16854a();
                    ExecutorC7177a executorC7177a4 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a4);
                    InterfaceC2024q interfaceC2024q = c7633z0.f41969d1.get();
                    InterfaceC5179a interfaceC5179a = c7633z0.f41965c0.get();
                    Context context5 = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context5);
                    SharedModule.f17759a.getClass();
                    C9100r c9100r = new C9100r(new C9100r.a());
                    Context applicationContext = context5.getApplicationContext();
                    NetworkType networkType = C5427b.f33964a;
                    NetworkType networkType2 = C5427b.f33965b;
                    C5580c c5580c = C5427b.f33972i;
                    C9960c c9960c = C5427b.f33971h;
                    C5207g.m11107b(applicationContext, "appContext");
                    C5578a c5578a = new C5578a(applicationContext, C5579b.m11819k(applicationContext));
                    PrioritySort prioritySort = C5427b.f33969f;
                    C6078a c6078a = new C6078a(c9100r);
                    if (c5580c instanceof C5580c) {
                        c5580c.f34388a = true;
                        if (C5207g.m11106a(c5580c.f34389b, "fetch2")) {
                            c5580c.f34389b = "tts";
                        }
                    } else {
                        c5580c.f34388a = true;
                    }
                    C5207g.m11107b(applicationContext, "appContext");
                    return (T) new TtsControllerImpl(context4, interfaceC7882z4, coroutineDispatcherM16854a2, executorC7177a4, interfaceC2024q, interfaceC5179a, InterfaceC9958a.a.m18534a(new C9959b(applicationContext, "tts", 20, 500L, true, c6078a, networkType2, c5580c, true, true, c9960c, true, c5578a, prioritySort, 300000L, true, 1, true)));
                case 112:
                    return (T) new LocaleRepositoryImpl(c7633z0.f41964c.get(), c7633z0.f41948V.get(), c7633z0.f41950W.get());
                case 113:
                    return (T) new C6516l();
                case 114:
                    return (T) new C9531b();
                case 115:
                    return (T) new C6354q(c7633z0.f41951W0.get());
                case 116:
                    return (T) new MilestonesControllerDelegateImpl(c7633z0.f41975f1.get(), c7633z0.f41955Y0.get());
                case 117:
                    InterfaceC0113j interfaceC0113j = c7633z0.f41975f1.get();
                    InterfaceC5180b interfaceC5180b2 = c7633z0.f41985j.get();
                    InterfaceC7882z interfaceC7882z5 = c7633z0.f41955Y0.get();
                    ExecutorC7177a executorC7177a5 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a5);
                    return (T) new DeepLinkControllerImpl(interfaceC0113j, interfaceC5180b2, interfaceC7882z5, executorC7177a5);
                case 118:
                    InterfaceC2018k interfaceC2018k = c7633z0.f41925J0.get();
                    InterfaceC5182d interfaceC5182d2 = c7633z0.f42009r.get();
                    InterfaceC0113j interfaceC0113j2 = c7633z0.f41975f1.get();
                    InterfaceC7882z interfaceC7882z6 = c7633z0.f41955Y0.get();
                    ExecutorC7177a executorC7177a6 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a6);
                    return (T) new NotificationsControllerImpl(interfaceC2018k, interfaceC5182d2, interfaceC0113j2, interfaceC7882z6, executorC7177a6);
                case 119:
                    return (T) new ReferralRepositoryImpl(c7633z0.f42011r1.get(), c7633z0.f42014s1.get(), c7633z0.f41985j.get());
                case 120:
                    LingQDatabase lingQDatabase2 = c7633z0.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase2, "db");
                    T t11 = (T) lingQDatabase2.mo9460I();
                    C9000b.m17242h(t11);
                    return t11;
                case 121:
                    C6554v c6554v2 = c7633z0.f42000o.get();
                    C5207g.m11111f(c6554v2, "retrofit");
                    Object objM13152b2 = c6554v2.m13152b(InterfaceC9945m.class);
                    C5207g.m11110e(objM13152b2, "retrofit.create(ReferralService::class.java)");
                    return (T) ((InterfaceC9945m) objM13152b2);
                case 122:
                    return (T) new TokenDataRepositoryImpl(c7633z0.f41964c.get(), c7633z0.f42020u1.get(), c7633z0.f42023v1.get(), c7633z0.f41900B.get());
                case 123:
                    LingQDatabase lingQDatabase3 = c7633z0.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase3, "db");
                    T t12 = (T) lingQDatabase3.mo9462K();
                    C9000b.m17242h(t12);
                    return t12;
                case 124:
                    C6554v c6554v3 = c7633z0.f42000o.get();
                    C5207g.m11111f(c6554v3, "retrofit");
                    Object objM13152b3 = c6554v3.m13152b(InterfaceC9948p.class);
                    C5207g.m11110e(objM13152b3, "retrofit.create(TokenDataService::class.java)");
                    return (T) ((InterfaceC9948p) objM13152b3);
                case 125:
                    return (T) new C5562d();
                case 126:
                    return (T) new C6485f();
                case 127:
                    return (T) new C9011g();
                case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                    return (T) new MilestonesControllerImpl(c7633z0.f41901B0.get(), c7633z0.f42030y.get(), c7633z0.f41975f1.get(), c7633z0.f42002o1.get());
                case 129:
                    return (T) new C1599v();
                case 130:
                    return (T) new VocabularyRepositoryImpl(c7633z0.f41964c.get(), c7633z0.f41905C1.get(), c7633z0.f41973f.get(), c7633z0.f41967d.get(), c7633z0.f41903C.get(), c7633z0.f42009r.get());
                case 131:
                    LingQDatabase lingQDatabase4 = c7633z0.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase4, "db");
                    T t13 = (T) lingQDatabase4.mo9464M();
                    C9000b.m17242h(t13);
                    return t13;
                case 132:
                    return (T) new SearchRepositoryImpl(c7633z0.f41964c.get(), c7633z0.f41911E1.get(), c7633z0.f41967d.get(), c7633z0.f41897A.get(), c7633z0.f41900B.get(), c7633z0.f41973f.get(), c7633z0.f41979h.get(), c7633z0.f41995m0.get(), c7633z0.f41932N.get(), c7633z0.f41914F1.get(), c7633z0.f42006q.get());
                case 133:
                    LingQDatabase lingQDatabase5 = c7633z0.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase5, "db");
                    T t14 = (T) lingQDatabase5.mo9461J();
                    C9000b.m17242h(t14);
                    return t14;
                case 134:
                    C6554v c6554v4 = c7633z0.f42000o.get();
                    C5207g.m11111f(c6554v4, "retrofit");
                    Object objM13152b4 = c6554v4.m13152b(InterfaceC9947o.class);
                    C5207g.m11110e(objM13152b4, "retrofit.create(SearchService::class.java)");
                    return (T) ((InterfaceC9947o) objM13152b4);
                case 135:
                    Context context6 = c7633z0.f41958a.f42878a;
                    C9000b.m17242h(context6);
                    return (T) new FontDownloadManagerDelegateImpl(context6, c7633z0.f41955Y0.get());
                case 136:
                    return (T) new C5548i();
                default:
                    throw new AssertionError(i10);
            }
        }

        @Override // p371rl.InterfaceC8825a
        public final T get() {
            Object c4955q;
            Object profileStoreImpl;
            Object c6554v;
            int i10 = this.f42037b;
            int i11 = i10 / 100;
            if (i11 != 0) {
                if (i11 == 1) {
                    return m15193a();
                }
                throw new AssertionError(this.f42037b);
            }
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return (T) new C7618s(this);
                case 1:
                    return (T) new PlaylistRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41967d.get(), this.f42036a.f41970e.get(), this.f42036a.f41973f.get(), this.f42036a.f41976g.get(), this.f42036a.f41979h.get(), this.f42036a.f42003p.get(), this.f42036a.f42006q.get(), this.f42036a.f41985j.get(), this.f42036a.f42009r.get(), this.f42036a.f42012s.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get());
                case 2:
                    Context context = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context);
                    SharedModule.f17759a.getClass();
                    RoomDatabase.C1180a c1180aM10983D0 = C5206f.m10983D0(context, LingQDatabase.class, "lingq_db");
                    RoomDatabase.JournalMode journalMode = RoomDatabase.JournalMode.TRUNCATE;
                    C5207g.m11111f(journalMode, "journalMode");
                    c1180aM10983D0.f7532k = journalMode;
                    c1180aM10983D0.m4569a(C0079a.f211a, C0079a.f212b, C0079a.f213c);
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8);
                    C5207g.m11110e(executorServiceNewFixedThreadPool, "newFixedThreadPool(8)");
                    c1180aM10983D0.f7528g = executorServiceNewFixedThreadPool;
                    c1180aM10983D0.f7533l = false;
                    c1180aM10983D0.f7534m = true;
                    return (T) ((LingQDatabase) c1180aM10983D0.m4570b());
                case 3:
                    LingQDatabase lingQDatabase = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase, "db");
                    T t10 = (T) lingQDatabase.mo9452A();
                    C9000b.m17242h(t10);
                    return t10;
                case 4:
                    LingQDatabase lingQDatabase2 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase2, "db");
                    T t11 = (T) lingQDatabase2.mo9459H();
                    C9000b.m17242h(t11);
                    return t11;
                case 5:
                    LingQDatabase lingQDatabase3 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase3, "db");
                    T t12 = (T) lingQDatabase3.mo9468w();
                    C9000b.m17242h(t12);
                    return t12;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    LingQDatabase lingQDatabase4 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase4, "db");
                    T t13 = (T) lingQDatabase4.mo9458G();
                    C9000b.m17242h(t13);
                    return t13;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    LingQDatabase lingQDatabase5 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase5, "db");
                    T t14 = (T) lingQDatabase5.mo9453B();
                    C9000b.m17242h(t14);
                    return t14;
                case 8:
                    C6554v c6554v2 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v2, "retrofit");
                    Object objM13152b = c6554v2.m13152b(InterfaceC9943k.class);
                    C5207g.m11110e(objM13152b, "retrofit.create(PlaylistService::class.java)");
                    return (T) ((InterfaceC9943k) objM13152b);
                case 9:
                    C9100r c9100r = this.f42036a.f41997n.get();
                    C4955q c4955q2 = this.f42036a.f41982i.get();
                    C5207g.m11111f(c9100r, "okHttpClient");
                    C5207g.m11111f(c4955q2, "moshi");
                    C6550r c6550r = C6550r.f37283c;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C9096n.a aVar = new C9096n.a();
                    aVar.m17331d(null, "https://www.lingq.com/");
                    C9096n c9096nM17328a = aVar.m17328a();
                    List<String> list = c9096nM17328a.f47460f;
                    if (!"".equals(list.get(list.size() - 1))) {
                        throw new IllegalArgumentException("baseUrl must end in /: " + c9096nM17328a);
                    }
                    arrayList.add(new C7199a(c4955q2));
                    C10192d.a aVar2 = C10192d.f51547a;
                    Objects.requireNonNull(aVar2, "factory == null");
                    arrayList.add(aVar2);
                    Executor executorMo13140a = c6550r.mo13140a();
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    C6540h c6540h = new C6540h(executorMo13140a);
                    boolean z10 = c6550r.f37284a;
                    arrayList3.addAll(z10 ? Arrays.asList(C6537e.f37206a, c6540h) : Collections.singletonList(c6540h));
                    ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (z10 ? 1 : 0));
                    arrayList4.add(new C6533a());
                    arrayList4.addAll(arrayList);
                    arrayList4.addAll(z10 ? Collections.singletonList(C6546n.f37240a) : Collections.emptyList());
                    c6554v = new C6554v(c9100r, c9096nM17328a, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3));
                    return (T) c6554v;
                case 10:
                    Context context2 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context2);
                    C3313a c3313a = this.f42036a.f41994m.get();
                    C7797e c7797e = this.f42036a.f41988k.get();
                    C5207g.m11111f(c3313a, "postInterceptor");
                    C5207g.m11111f(c7797e, "utils");
                    File cacheDir = context2.getCacheDir();
                    C5207g.m11110e(cacheDir, "context.cacheDir");
                    C8072a c8072a = new C8072a(cacheDir, 10485760);
                    C9089g.a aVar3 = new C9089g.a(C9089g.f47420e);
                    aVar3.m17301f(TlsVersion.TLS_1_2);
                    aVar3.m17298c(C9088f.f47410m, C9088f.f47412o, C9088f.f47407j);
                    C9089g c9089gM17296a = aVar3.m17296a();
                    C9100r.a aVar4 = new C9100r.a();
                    List listSingletonList = Collections.singletonList(c9089gM17296a);
                    C5207g.m11110e(listSingletonList, "singletonList(spec)");
                    if (!C5207g.m11106a(listSingletonList, aVar4.f47534o)) {
                        aVar4.f47541v = null;
                    }
                    aVar4.f47534o = C9347b.m17717x(listSingletonList);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    aVar4.f47521b = new C9166r(8, 240L, timeUnit);
                    aVar4.f47539t = C9347b.m17695b(60L, timeUnit);
                    aVar4.f47538s = C9347b.m17695b(60L, timeUnit);
                    aVar4.f47530k = c8072a;
                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                    HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
                    C5207g.m11111f(level, "<set-?>");
                    httpLoggingInterceptor.f43895c = level;
                    aVar4.f47522c.add(c3313a);
                    if (c7797e.m15513f()) {
                        aVar4.f47522c.add(httpLoggingInterceptor);
                        aVar4.f47523d.add(httpLoggingInterceptor);
                    }
                    aVar4.f47520a = new C7965k0();
                    return (T) new C9100r(aVar4);
                case 11:
                    Context context3 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context3);
                    InterfaceC5180b interfaceC5180b = this.f42036a.f41985j.get();
                    C7797e c7797e2 = this.f42036a.f41988k.get();
                    InterfaceC10189a interfaceC10189a = this.f42036a.f41991l.get();
                    C5207g.m11111f(interfaceC5180b, "profileStore");
                    C5207g.m11111f(c7797e2, "utils");
                    C5207g.m11111f(interfaceC10189a, "unauthorizedHandlerDelegate");
                    return (T) new C3313a(context3, interfaceC5180b, c7797e2, interfaceC10189a);
                case 12:
                    Context context4 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context4);
                    C4955q c4955q3 = this.f42036a.f41982i.get();
                    ExecutorC7177a executorC7177a = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a);
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(c4955q3, "moshi");
                    profileStoreImpl = new ProfileStoreImpl(c4955q3, SharedModule.m9434a(context4), executorC7177a);
                    return (T) profileStoreImpl;
                case 13:
                    C4955q.a aVar5 = new C4955q.a();
                    aVar5.m10567a(C9725c.f49743b);
                    aVar5.m10568b(new ParagraphAdapter());
                    aVar5.m10568b(new CardsAdapter());
                    aVar5.m10568b(new WordsAdapter());
                    aVar5.m10567a(new C9724b());
                    aVar5.m10569c(new C9553b());
                    c4955q = new C4955q(aVar5);
                    return (T) c4955q;
                case 14:
                    Context context5 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context5);
                    SharedModule.f17759a.getClass();
                    c4955q = new C7797e(context5);
                    return (T) c4955q;
                case 15:
                    return (T) new C10190b();
                case 16:
                    C6554v c6554v3 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v3, "retrofit");
                    Object objM13152b2 = c6554v3.m13152b(InterfaceC9939g.class);
                    C5207g.m11110e(objM13152b2, "retrofit.create(LibraryService::class.java)");
                    return (T) ((InterfaceC9939g) objM13152b2);
                case 17:
                    Context context6 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context6);
                    C4955q c4955q4 = this.f42036a.f41982i.get();
                    ExecutorC7177a executorC7177a2 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a2);
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(c4955q4, "moshi");
                    profileStoreImpl = new UtilStoreImpl(c4955q4, SharedModule.m9434a(context6), executorC7177a2);
                    return (T) profileStoreImpl;
                case 18:
                    Context context7 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context7);
                    C7797e c7797e3 = this.f42036a.f41988k.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(c7797e3, "utils");
                    c6554v = new C7796d(context7, c7797e3);
                    return (T) c6554v;
                case 19:
                    Context context8 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context8);
                    T t15 = (T) C1699a0.m5430d(context8);
                    C5207g.m11110e(t15, "getInstance(context)");
                    return t15;
                case 20:
                    return (T) new C7582d0(this);
                case 21:
                    return (T) new LanguageStatsRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f42024w.get(), this.f42036a.f42027x.get(), this.f42036a.f42015t.get());
                case 22:
                    LingQDatabase lingQDatabase6 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase6, "db");
                    T t16 = (T) lingQDatabase6.mo9471z();
                    C9000b.m17242h(t16);
                    return t16;
                case 23:
                    C6554v c6554v4 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v4, "retrofit");
                    Object objM13152b3 = c6554v4.m13152b(InterfaceC9937e.class);
                    C5207g.m11110e(objM13152b3, "retrofit.create(LanguageService::class.java)");
                    return (T) ((InterfaceC9937e) objM13152b3);
                case 24:
                    return (T) new C7611o0(this);
                case 25:
                    return (T) new CardRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41897A.get(), this.f42036a.f41900B.get(), this.f42036a.f41967d.get(), this.f42036a.f41903C.get(), this.f42036a.f41985j.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get(), this.f42036a.f42012s.get());
                case 26:
                    LingQDatabase lingQDatabase7 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase7, "db");
                    T t17 = (T) lingQDatabase7.mo9466u();
                    C9000b.m17242h(t17);
                    return t17;
                case 27:
                    LingQDatabase lingQDatabase8 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase8, "db");
                    T t18 = (T) lingQDatabase8.mo9465N();
                    C9000b.m17242h(t18);
                    return t18;
                case 28:
                    C6554v c6554v5 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v5, "retrofit");
                    Object objM13152b4 = c6554v5.m13152b(InterfaceC9933a.class);
                    C5207g.m11110e(objM13152b4, "retrofit.create(CardService::class.java)");
                    return (T) ((InterfaceC9933a) objM13152b4);
                case 29:
                    return (T) new C7621t0(this);
                case 30:
                    return (T) new C7623u0(this);
                case 31:
                    return (T) new C7625v0(this);
                case 32:
                    return (T) new C7627w0(this);
                case 33:
                    return (T) new ChallengeRepositoryImpl(this.f42036a.f41921I.get(), this.f42036a.f41924J.get(), this.f42036a.f42015t.get());
                case 34:
                    LingQDatabase lingQDatabase9 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase9, "db");
                    T t19 = (T) lingQDatabase9.mo9467v();
                    C9000b.m17242h(t19);
                    return t19;
                case 35:
                    C6554v c6554v6 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v6, "retrofit");
                    Object objM13152b5 = c6554v6.m13152b(InterfaceC9934b.class);
                    C5207g.m11110e(objM13152b5, "retrofit.create(ChallengeService::class.java)");
                    return (T) ((InterfaceC9934b) objM13152b5);
                case 36:
                    return (T) new C7629x0(this);
                case 37:
                    return (T) new C7631y0(this);
                case 38:
                    return (T) new CourseRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41973f.get(), this.f42036a.f41979h.get(), this.f42036a.f41932N.get(), this.f42036a.f42015t.get());
                case 39:
                    C6554v c6554v7 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v7, "retrofit");
                    Object objM13152b6 = c6554v7.m13152b(InterfaceC9935c.class);
                    C5207g.m11110e(objM13152b6, "retrofit.create(CourseService::class.java)");
                    return (T) ((InterfaceC9935c) objM13152b6);
                case 40:
                    return (T) new C7596i(this);
                case 41:
                    return (T) new C7599j(this);
                case 42:
                    return (T) new C9285b(this.f42036a.f41940R.get(), this.f42036a.f42015t.get());
                case 43:
                    C6554v c6554v8 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v8, "retrofit");
                    Object objM13152b7 = c6554v8.m13152b(InterfaceC9946n.class);
                    C5207g.m11110e(objM13152b7, "retrofit.create(ReportService::class.java)");
                    return (T) ((InterfaceC9946n) objM13152b7);
                case 44:
                    return (T) new C7602k(this);
                case 45:
                    return (T) new DictionaryRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41946U.get(), this.f42036a.f41948V.get(), this.f42036a.f41950W.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get());
                case 46:
                    LingQDatabase lingQDatabase10 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase10, "db");
                    T t20 = (T) lingQDatabase10.mo9469x();
                    C9000b.m17242h(t20);
                    return t20;
                case 47:
                    LingQDatabase lingQDatabase11 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase11, "db");
                    T t21 = (T) lingQDatabase11.mo9454C();
                    C9000b.m17242h(t21);
                    return t21;
                case 48:
                    C6554v c6554v9 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v9, "retrofit");
                    Object objM13152b8 = c6554v9.m13152b(InterfaceC9936d.class);
                    C5207g.m11110e(objM13152b8, "retrofit.create(DictionaryService::class.java)");
                    return (T) ((InterfaceC9936d) objM13152b8);
                case 49:
                    return (T) new C7604l(this);
                case 50:
                    return (T) new C7606m(this);
                case 51:
                    return (T) new C7608n(this);
                case 52:
                    return (T) new LanguageRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41962b0.get(), this.f42036a.f42027x.get(), this.f42036a.f41965c0.get(), this.f42036a.f42015t.get());
                case 53:
                    LingQDatabase lingQDatabase12 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase12, "db");
                    T t22 = (T) lingQDatabase12.mo9470y();
                    C9000b.m17242h(t22);
                    return t22;
                case 54:
                    Context context9 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context9);
                    C4955q c4955q5 = this.f42036a.f41982i.get();
                    ExecutorC7177a executorC7177a3 = C7832g0.f42931b;
                    C9000b.m17242h(executorC7177a3);
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(c4955q5, "moshi");
                    profileStoreImpl = new PreferenceStoreImpl(c4955q5, SharedModule.m9434a(context9), executorC7177a3);
                    return (T) profileStoreImpl;
                case 55:
                    return (T) new C7610o(this);
                case 56:
                    return (T) new C7612p(this);
                case 57:
                    return (T) new C7614q(this);
                case 58:
                    return (T) new C7616r(this);
                case 59:
                    return (T) new C7620t(this);
                case 60:
                    return (T) new C7622u(this);
                case 61:
                    return (T) new C7624v(this);
                case 62:
                    return (T) new C7626w(this);
                case 63:
                    return (T) new LessonRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41967d.get(), this.f42036a.f41897A.get(), this.f42036a.f41900B.get(), this.f42036a.f41979h.get(), this.f42036a.f41995m0.get(), this.f42036a.f42006q.get(), this.f42036a.f42012s.get(), this.f42036a.f42015t.get());
                case 64:
                    C6554v c6554v10 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v10, "retrofit");
                    Object objM13152b9 = c6554v10.m13152b(InterfaceC9938f.class);
                    C5207g.m11110e(objM13152b9, "retrofit.create(LessonService::class.java)");
                    return (T) ((InterfaceC9938f) objM13152b9);
                case 65:
                    return (T) new C7628x(this);
                case 66:
                    return (T) new C7630y(this);
                case 67:
                    return (T) new C7632z(this);
                case 68:
                    return (T) new C7573a0(this);
                case 69:
                    return (T) new C7576b0(this);
                case 70:
                    return (T) new C7579c0(this);
                case 71:
                    return (T) new C7585e0(this);
                case 72:
                    return (T) new C7588f0(this);
                case 73:
                    return (T) new C7591g0(this);
                case 74:
                    return (T) new C7594h0(this);
                case 75:
                    return (T) new C7597i0(this);
                case 76:
                    return (T) new MilestoneRepositoryImpl(this.f42036a.f42034z0.get(), this.f42036a.f41898A0.get(), this.f42036a.f42015t.get());
                case 77:
                    LingQDatabase lingQDatabase13 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase13, "db");
                    T t23 = (T) lingQDatabase13.mo9455D();
                    C9000b.m17242h(t23);
                    return t23;
                case 78:
                    C6554v c6554v11 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v11, "retrofit");
                    Object objM13152b10 = c6554v11.m13152b(InterfaceC9940h.class);
                    C5207g.m11110e(objM13152b10, "retrofit.create(MilestoneService::class.java)");
                    return (T) ((InterfaceC9940h) objM13152b10);
                case 79:
                    return (T) new C7600j0(this);
                case 80:
                    return (T) new NoticeRepositoryImpl(this.f42036a.f41907D0.get(), this.f42036a.f41910E0.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get());
                case 81:
                    LingQDatabase lingQDatabase14 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase14, "db");
                    T t24 = (T) lingQDatabase14.mo9456E();
                    C9000b.m17242h(t24);
                    return t24;
                case 82:
                    C6554v c6554v12 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v12, "retrofit");
                    Object objM13152b11 = c6554v12.m13152b(InterfaceC9941i.class);
                    C5207g.m11110e(objM13152b11, "retrofit.create(NoticeService::class.java)");
                    return (T) ((InterfaceC9941i) objM13152b11);
                case 83:
                    return (T) new C7603k0(this);
                case 84:
                    return (T) new NotificationRepositoryImpl(this.f42036a.f41919H0.get(), this.f42036a.f41922I0.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get());
                case 85:
                    LingQDatabase lingQDatabase15 = this.f42036a.f41964c.get();
                    SharedModule.f17759a.getClass();
                    C5207g.m11111f(lingQDatabase15, "db");
                    T t25 = (T) lingQDatabase15.mo9457F();
                    C9000b.m17242h(t25);
                    return t25;
                case 86:
                    C6554v c6554v13 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v13, "retrofit");
                    Object objM13152b12 = c6554v13.m13152b(InterfaceC9942j.class);
                    C5207g.m11110e(objM13152b12, "retrofit.create(NotificationService::class.java)");
                    return (T) ((InterfaceC9942j) objM13152b12);
                case 87:
                    return (T) new C7605l0(this);
                case ModuleDescriptor.MODULE_VERSION /* 88 */:
                    return (T) new C7607m0(this);
                case 89:
                    return (T) new C7609n0(this);
                case 90:
                    return (T) new C7613p0(this);
                case 91:
                    return (T) new C7615q0(this);
                case 92:
                    return (T) new ProfileRepositoryImpl(this.f42036a.f41937P0.get(), this.f42036a.f42015t.get(), this.f42036a.f41982i.get(), this.f42036a.f41985j.get(), this.f42036a.f41988k.get());
                case 93:
                    C6554v c6554v14 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v14, "retrofit");
                    Object objM13152b13 = c6554v14.m13152b(InterfaceC9944l.class);
                    C5207g.m11110e(objM13152b13, "retrofit.create(ProfileService::class.java)");
                    return (T) ((InterfaceC9944l) objM13152b13);
                case 94:
                    return (T) new C7617r0(this);
                case 95:
                    return (T) new WordRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f41900B.get(), this.f42036a.f41943S0.get(), this.f42036a.f42015t.get(), this.f42036a.f42012s.get());
                case 96:
                    C6554v c6554v15 = this.f42036a.f42000o.get();
                    C5207g.m11111f(c6554v15, "retrofit");
                    Object objM13152b14 = c6554v15.m13152b(InterfaceC9950r.class);
                    C5207g.m11110e(objM13152b14, "retrofit.create(WordService::class.java)");
                    return (T) ((InterfaceC9950r) objM13152b14);
                case 97:
                    return (T) new C7619s0(this);
                case 98:
                    Context context10 = this.f42036a.f41958a.f42878a;
                    C9000b.m17242h(context10);
                    C4955q c4955q6 = this.f42036a.f41982i.get();
                    C5207g.m11111f(c4955q6, "moshi");
                    c6554v = new C6704a(context10, c4955q6);
                    return (T) c6554v;
                case 99:
                    return (T) new LibraryRepositoryImpl(this.f42036a.f41964c.get(), this.f42036a.f42006q.get(), this.f42036a.f41979h.get(), this.f42036a.f41967d.get(), this.f42036a.f42009r.get());
                default:
                    throw new AssertionError(this.f42037b);
            }
        }
    }

    public C7633z0(C7800a c7800a) {
        this.f41958a = c7800a;
    }

    /* JADX INFO: renamed from: g0 */
    public static FetchImpl m15173g0(C7633z0 c7633z0) {
        Context context = c7633z0.f41958a.f42878a;
        C9000b.m17242h(context);
        SharedModule.f17759a.getClass();
        C9100r c9100r = new C9100r(new C9100r.a());
        Context applicationContext = context.getApplicationContext();
        NetworkType networkType = C5427b.f33964a;
        NetworkType networkType2 = C5427b.f33965b;
        C5580c c5580c = C5427b.f33972i;
        C9960c c9960c = C5427b.f33971h;
        C5207g.m11107b(applicationContext, "appContext");
        C5578a c5578a = new C5578a(applicationContext, C5579b.m11819k(applicationContext));
        PrioritySort prioritySort = C5427b.f33969f;
        C6078a c6078a = new C6078a(c9100r);
        if (c5580c instanceof C5580c) {
            c5580c.f34388a = true;
            if (C5207g.m11106a(c5580c.f34389b, "fetch2")) {
                c5580c.f34389b = "tracks";
            }
        } else {
            c5580c.f34388a = true;
        }
        C5207g.m11107b(applicationContext, "appContext");
        return InterfaceC9958a.a.m18534a(new C9959b(applicationContext, "tracks", 1, 200L, true, c6078a, networkType2, c5580c, true, true, c9960c, true, c5578a, prioritySort, 300000L, true, 0, true));
    }

    @Override // dagger.hilt.android.internal.managers.C5120g.a
    /* JADX INFO: renamed from: a */
    public final C7590g mo10900a() {
        return new C7590g(this.f41961b);
    }

    @Override // mk.InterfaceC7583d1
    /* JADX INFO: renamed from: b */
    public final void mo15087b(LingQApplication lingQApplication) {
        C0987y.m3820b("expectedSize", 43);
        ImmutableMap.C3148a c3148a = new ImmutableMap.C3148a(43);
        c3148a.m9076b("com.lingq.shared.network.workers.AddPlaylistWorker", this.f42021v);
        c3148a.m9076b("com.lingq.shared.network.workers.AppUsageUpdateWorker", this.f42033z);
        c3148a.m9076b("com.lingq.shared.network.workers.CardCreateWorker", this.f41909E);
        c3148a.m9076b("com.lingq.shared.network.workers.CardDeleteWorker", this.f41912F);
        c3148a.m9076b("com.lingq.shared.network.workers.CardReviewWorker", this.f41915G);
        c3148a.m9076b("com.lingq.shared.network.workers.CardUpdateWorker", this.f41918H);
        c3148a.m9076b("com.lingq.shared.network.workers.ChallengeLeaveWorker", this.f41928L);
        c3148a.m9076b("com.lingq.shared.network.workers.ChallengeSignupWorker", this.f41930M);
        c3148a.m9076b("com.lingq.shared.network.workers.CourseDeleteRoseWorker", this.f41936P);
        c3148a.m9076b("com.lingq.shared.network.workers.CourseGiveRoseWorker", this.f41938Q);
        c3148a.m9076b("com.lingq.shared.network.workers.CourseReportWorker", this.f41944T);
        c3148a.m9076b("com.lingq.shared.network.workers.DictionaryAddWorker", this.f41954Y);
        c3148a.m9076b("com.lingq.shared.network.workers.DictionaryDeleteWorker", this.f41956Z);
        c3148a.m9076b("com.lingq.shared.network.workers.DictionaryOrderWorker", this.f41959a0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageEmailNotificationUpdateWorker", this.f41971e0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageFeedLevelUpdateWorker", this.f41974f0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageIntensityUpdateWorker", this.f41977g0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageProgressUpdateWorker", this.f41980h0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageRepetitionLingqsUpdateWorker", this.f41983i0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageSiteNotificationUpdateWorker", this.f41986j0);
        c3148a.m9076b("com.lingq.shared.network.workers.LanguageTopicsUpdateWorker", this.f41989k0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonAddFavoriteWorker", this.f41992l0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonAudioUploadWorker", this.f42001o0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonBookmarkWorker", this.f42004p0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonCompleteWorker", this.f42007q0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonDeleteFavoriteWorker", this.f42010r0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonDeleteRoseWorker", this.f42013s0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonEditSentenceWorker", this.f42016t0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonGiveRoseWorker", this.f42019u0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonPlaylistOrderWorker", this.f42022v0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonReportWorker", this.f42025w0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonSaveRemoveWorker", this.f42028x0);
        c3148a.m9076b("com.lingq.shared.network.workers.LessonUpdateStatsWorker", this.f42031y0);
        c3148a.m9076b("com.lingq.shared.network.workers.MilestoneMetWorker", this.f41904C0);
        c3148a.m9076b("com.lingq.shared.network.workers.NoticeHideWorker", this.f41916G0);
        c3148a.m9076b("com.lingq.shared.network.workers.NotificationMarkAsReadWorker", this.f41927K0);
        c3148a.m9076b("com.lingq.shared.network.workers.PlaylistAddCourseWorker", this.f41929L0);
        c3148a.m9076b("com.lingq.shared.network.workers.PlaylistDeleteWorker", this.f41931M0);
        c3148a.m9076b("com.lingq.shared.network.workers.PlaylistLessonActionWorker", this.f41933N0);
        c3148a.m9076b("com.lingq.shared.network.workers.PlaylistUpdateWorker", this.f41935O0);
        c3148a.m9076b("com.lingq.shared.network.workers.ProfileUpdateWorker", this.f41941R0);
        c3148a.m9076b("com.lingq.shared.network.workers.WordUpdateIgnoreStatusWorker", this.f41947U0);
        c3148a.m9076b("com.lingq.shared.network.workers.WordUpdateKnownStatusWorker", this.f41949V0);
        lingQApplication.f37761a = new C8727a(c3148a.m9075a());
        lingQApplication.f37762b = this.f42012s.get();
        lingQApplication.f37763c = this.f41965c0.get();
        lingQApplication.f37764d = this.f41988k.get();
    }

    @Override // p226kl.C6717a.a
    /* JADX INFO: renamed from: c */
    public final Set<Boolean> mo13335c() {
        return ImmutableSet.m9081Y();
    }

    @Override // dagger.hilt.android.internal.managers.C5116c.a
    /* JADX INFO: renamed from: d */
    public final C7578c mo10895d() {
        return new C7578c(this.f41961b);
    }
}
