package com.lingq.shared.repository;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1413d0;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import bi.InterfaceC1539u3;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Lesson;
import com.lingq.entity.LibraryData;
import com.lingq.entity.Playlist;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.network.requests.RequestPlaylistCreate;
import com.lingq.shared.network.requests.RequestPlaylistLessonAction;
import com.lingq.shared.network.requests.RequestPlaylistOrder;
import com.lingq.shared.network.result.ResultPlaylistFolder;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.AddPlaylistWorker;
import com.lingq.shared.network.workers.PlaylistAddCourseWorker;
import com.lingq.shared.network.workers.PlaylistDeleteWorker;
import com.lingq.shared.network.workers.PlaylistLessonActionWorker;
import com.lingq.shared.network.workers.PlaylistUpdateWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.persistent.dao.PlaylistDao;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ki.C6697c;
import ki.C6698d;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import mo.C7661i;
import ni.C7793a;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p288o4.C7915a;
import p367rh.C8798l;
import p367rh.C8801o;
import p367rh.C8805s;
import p385sf.C9000b;
import p460wh.InterfaceC9939g;
import p460wh.InterfaceC9943k;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9321i;

/* JADX INFO: loaded from: classes.dex */
public final class PlaylistRepositoryImpl implements InterfaceC2019l {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f20197a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1495o1 f20198b;

    /* JADX INFO: renamed from: c */
    public final PlaylistDao f20199c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1413d0 f20200d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1539u3 f20201e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1454i2 f20202f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9943k f20203g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9939g f20204h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5180b f20205i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5182d f20206j;

    /* JADX INFO: renamed from: k */
    public final C7796d f20207k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1317j f20208l;

    /* JADX INFO: renamed from: m */
    public final C4955q f20209m;

    /* JADX INFO: renamed from: com.lingq.shared.repository.PlaylistRepositoryImpl$a */
    public static final class C3321a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(Integer.valueOf(((ResultPlaylistFolder) t10).f18887a), Integer.valueOf(((ResultPlaylistFolder) t11).f18887a));
        }
    }

    public PlaylistRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1495o1 abstractC1495o1, PlaylistDao playlistDao, AbstractC1413d0 abstractC1413d0, InterfaceC1539u3 interfaceC1539u3, AbstractC1454i2 abstractC1454i2, InterfaceC9943k interfaceC9943k, InterfaceC9939g interfaceC9939g, InterfaceC5180b interfaceC5180b, InterfaceC5182d interfaceC5182d, C7796d c7796d, AbstractC1317j abstractC1317j, C4955q c4955q) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(playlistDao, "playlistDao");
        C5207g.m11111f(abstractC1413d0, "courseDao");
        C5207g.m11111f(interfaceC1539u3, "pagingKeysDao");
        C5207g.m11111f(abstractC1454i2, "libraryDao");
        C5207g.m11111f(interfaceC9943k, "playlistService");
        C5207g.m11111f(interfaceC9939g, "libraryService");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        this.f20197a = lingQDatabase;
        this.f20198b = abstractC1495o1;
        this.f20199c = playlistDao;
        this.f20200d = abstractC1413d0;
        this.f20201e = interfaceC1539u3;
        this.f20202f = abstractC1454i2;
        this.f20203g = interfaceC9943k;
        this.f20204h = interfaceC9939g;
        this.f20205i = interfaceC5180b;
        this.f20206j = interfaceC5182d;
        this.f20207k = c7796d;
        this.f20208l = abstractC1317j;
        this.f20209m = c4955q;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: L */
    public static final Object m9542L(PlaylistRepositoryImpl playlistRepositoryImpl, String str, int i10, boolean z10, int i11, int i12, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$updatePlaylistLessonPosition$1 playlistRepositoryImpl$updatePlaylistLessonPosition$1;
        String str2;
        int i13;
        LibraryData libraryData;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        int i14;
        String str3;
        int i15;
        String str4;
        LibraryData libraryData2;
        String str5;
        String str6;
        int i16;
        Lesson lesson;
        PlaylistRepositoryImpl playlistRepositoryImpl3;
        int i17;
        String str7;
        int i18;
        String str8;
        LibraryData libraryData3;
        String str9;
        playlistRepositoryImpl.getClass();
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$updatePlaylistLessonPosition$1) {
            playlistRepositoryImpl$updatePlaylistLessonPosition$1 = (PlaylistRepositoryImpl$updatePlaylistLessonPosition$1) interfaceC9968c;
            int i19 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = i19 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1 = new PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(playlistRepositoryImpl, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$updatePlaylistLessonPosition$1 = new PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(playlistRepositoryImpl, interfaceC9968c);
        }
        Object objMo5149o0 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20368i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i20 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k;
        if (i20 != 0) {
            if (i20 == 1) {
                i12 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20367h;
                i11 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g;
                i10 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f;
                str = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e;
                playlistRepositoryImpl = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d;
                C7499b.m14977z0(objMo5149o0);
                str2 = str;
                i13 = i12;
                libraryData = (LibraryData) objMo5149o0;
                if (libraryData != null) {
                    str4 = libraryData.f17243f;
                    if (str4 != null) {
                        playlistRepositoryImpl.m9544M(i13, new Integer(i11), str2, str4, "upd");
                    }
                } else {
                    AbstractC1454i2 abstractC1454i2 = playlistRepositoryImpl.f20202f;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str2;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i11;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i13;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 2;
                    objMo5149o0 = abstractC1454i2.mo5079w0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                    if (objMo5149o0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistRepositoryImpl2 = playlistRepositoryImpl;
                    i14 = i13;
                    str3 = str2;
                    i15 = i11;
                }
            } else if (i20 != 2) {
                if (i20 == 3) {
                    i12 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20367h;
                    i11 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g;
                    i10 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f;
                    str = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e;
                    playlistRepositoryImpl = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d;
                    C7499b.m14977z0(objMo5149o0);
                    str6 = str;
                    i16 = i12;
                    lesson = (Lesson) objMo5149o0;
                    if (lesson != null) {
                        str8 = lesson.f17097c;
                        if (str8 != null) {
                            playlistRepositoryImpl.m9544M(i16, new Integer(i11), str6, str8, "upd");
                        }
                    } else {
                        AbstractC1454i2 abstractC1454i3 = playlistRepositoryImpl.f20202f;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str6;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i11;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i16;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 4;
                        objMo5149o0 = abstractC1454i3.mo5079w0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                        if (objMo5149o0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        playlistRepositoryImpl3 = playlistRepositoryImpl;
                        i17 = i16;
                        str7 = str6;
                        i18 = i11;
                    }
                } else {
                    if (i20 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i21 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g;
                    i18 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f;
                    String str10 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e;
                    PlaylistRepositoryImpl playlistRepositoryImpl4 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d;
                    C7499b.m14977z0(objMo5149o0);
                    i17 = i21;
                    str7 = str10;
                    playlistRepositoryImpl3 = playlistRepositoryImpl4;
                }
                libraryData3 = (LibraryData) objMo5149o0;
                if (libraryData3 != null && (str9 = libraryData3.f17243f) != null) {
                    playlistRepositoryImpl3.m9544M(i17, new Integer(i18), str7, str9, "upd");
                }
            } else {
                int i22 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g;
                i15 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f;
                String str11 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e;
                PlaylistRepositoryImpl playlistRepositoryImpl5 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d;
                C7499b.m14977z0(objMo5149o0);
                i14 = i22;
                str3 = str11;
                playlistRepositoryImpl2 = playlistRepositoryImpl5;
            }
            libraryData2 = (LibraryData) objMo5149o0;
            if (libraryData2 != null && (str5 = libraryData2.f17243f) != null) {
                playlistRepositoryImpl2.m9544M(i14, new Integer(i15), str3, str5, "upd");
            }
        } else {
            C7499b.m14977z0(objMo5149o0);
            if (z10) {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i10;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i11;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20367h = i12;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 1;
                objMo5149o0 = playlistRepositoryImpl.f20200d.mo5015k0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                i13 = i12;
                libraryData = (LibraryData) objMo5149o0;
                if (libraryData != null) {
                    str4 = libraryData.f17243f;
                    if (str4 != null) {
                        playlistRepositoryImpl.m9544M(i13, new Integer(i11), str2, str4, "upd");
                    }
                } else {
                    AbstractC1454i2 abstractC1454i4 = playlistRepositoryImpl.f20202f;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str2;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i11;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i13;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 2;
                    objMo5149o0 = abstractC1454i4.mo5079w0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                    if (objMo5149o0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistRepositoryImpl2 = playlistRepositoryImpl;
                    i14 = i13;
                    str3 = str2;
                    i15 = i11;
                    libraryData2 = (LibraryData) objMo5149o0;
                    if (libraryData2 != null) {
                        playlistRepositoryImpl2.m9544M(i14, new Integer(i15), str3, str5, "upd");
                    }
                }
            } else {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i10;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i11;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20367h = i12;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 3;
                objMo5149o0 = playlistRepositoryImpl.f20198b.mo5149o0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str6 = str;
                i16 = i12;
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    str8 = lesson.f17097c;
                    if (str8 != null) {
                        playlistRepositoryImpl.m9544M(i16, new Integer(i11), str6, str8, "upd");
                    }
                } else {
                    AbstractC1454i2 abstractC1454i5 = playlistRepositoryImpl.f20202f;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20363d = playlistRepositoryImpl;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20364e = str6;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20365f = i11;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20366g = i16;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f20370k = 4;
                    objMo5149o0 = abstractC1454i5.mo5079w0(i10, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                    if (objMo5149o0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistRepositoryImpl3 = playlistRepositoryImpl;
                    i17 = i16;
                    str7 = str6;
                    i18 = i11;
                    libraryData3 = (LibraryData) objMo5149o0;
                    if (libraryData3 != null) {
                        playlistRepositoryImpl3.m9544M(i17, new Integer(i18), str7, str9, "upd");
                    }
                }
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: A */
    public final InterfaceC7116c<Integer> mo6095A(String str, int i10) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20199c.mo5226x0(str, i10));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: B */
    public final C7136q mo6096B(String str) {
        return new C7136q(new PlaylistRepositoryImpl$getDefaultPlaylist$2(this, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    /* JADX WARN: Code duplicated, block: B:46:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f3 A[PHI: r1 r5 r6 r7 r8 r9
      0x01f3: PHI (r1v17 com.lingq.entity.Playlist) = (r1v8 com.lingq.entity.Playlist), (r1v9 com.lingq.entity.Playlist), (r1v20 com.lingq.entity.Playlist) binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r5v19 com.lingq.entity.Playlist) = (r5v14 com.lingq.entity.Playlist), (r5v15 com.lingq.entity.Playlist), (r5v22 com.lingq.entity.Playlist) binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r6v17 java.util.Iterator) = (r6v8 java.util.Iterator), (r6v9 java.util.Iterator), (r6v18 java.util.Iterator) binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r7v31 java.util.List) = (r7v17 java.util.List), (r7v18 java.util.List), (r7v33 java.util.List) binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r8v20 java.lang.String) = (r8v8 java.lang.String), (r8v9 java.lang.String), (r8v21 java.lang.String) binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r9v11 com.lingq.shared.repository.PlaylistRepositoryImpl) = 
      (r9v4 com.lingq.shared.repository.PlaylistRepositoryImpl)
      (r9v5 com.lingq.shared.repository.PlaylistRepositoryImpl)
      (r9v12 com.lingq.shared.repository.PlaylistRepositoryImpl)
     binds: [B:59:0x01f0, B:54:0x01b4, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0213 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x021a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01b4 -> B:61:0x01f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01f0 -> B:61:0x01f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: C */
    public final java.lang.Object mo6097C(java.lang.String r19, p464wl.InterfaceC9968c<? super sl.C9072e> r20) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.PlaylistRepositoryImpl.mo6097C(java.lang.String, wl.c):java.lang.Object");
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: D */
    public final Object mo6098D(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18499g = this.f20203g.m18499g(str, new Integer(i10), interfaceC9968c);
        return objM18499g == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18499g : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: E */
    public final Object mo6099E(String str, String str2, RequestPlaylistLessonAction requestPlaylistLessonAction, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18497e = this.f20203g.m18497e(str, str2, requestPlaylistLessonAction, interfaceC9968c);
        return objM18497e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18497e : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: F */
    public final InterfaceC7116c mo6100F(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20199c.mo5227y0(str));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: G */
    public final Object mo6101G(String str, C9321i c9321i, InterfaceC9968c interfaceC9968c) {
        if (!(!c9321i.isEmpty())) {
            return C9072e.f47360a;
        }
        RequestPlaylistOrder requestPlaylistOrder = new RequestPlaylistOrder();
        requestPlaylistOrder.f18150a = c9321i;
        Object objM18500h = this.f20203g.m18500h(str, requestPlaylistOrder, interfaceC9968c);
        return objM18500h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18500h : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: H */
    public final Object mo6102H(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Exception {
        PlaylistRepositoryImpl$networkPlaylistLessons$1 playlistRepositoryImpl$networkPlaylistLessons$1;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str3;
        String str4;
        int i11;
        Results results;
        Results results2;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$networkPlaylistLessons$1) {
            playlistRepositoryImpl$networkPlaylistLessons$1 = (PlaylistRepositoryImpl$networkPlaylistLessons$1) interfaceC9968c;
            int i12 = playlistRepositoryImpl$networkPlaylistLessons$1.f20303j;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$networkPlaylistLessons$1.f20303j = i12 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$networkPlaylistLessons$1 = new PlaylistRepositoryImpl$networkPlaylistLessons$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$networkPlaylistLessons$1 = new PlaylistRepositoryImpl$networkPlaylistLessons$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$networkPlaylistLessons$1.f20301h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = playlistRepositoryImpl$networkPlaylistLessons$1.f20303j;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = playlistRepositoryImpl$networkPlaylistLessons$1.f20300g;
                String str5 = playlistRepositoryImpl$networkPlaylistLessons$1.f20299f;
                String str6 = playlistRepositoryImpl$networkPlaylistLessons$1.f20298e;
                playlistRepositoryImpl = (PlaylistRepositoryImpl) playlistRepositoryImpl$networkPlaylistLessons$1.f20297d;
                C7499b.m14977z0(obj);
                i11 = i14;
                str4 = str5;
                str3 = str6;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                results2 = (Results) playlistRepositoryImpl$networkPlaylistLessons$1.f20297d;
                C7499b.m14977z0(obj);
            }
            results = results2;
            return new Integer(results.f19133a);
        }
        C7499b.m14977z0(obj);
        InterfaceC9943k interfaceC9943k = this.f20203g;
        String strValueOf = String.valueOf(i10);
        Integer num = new Integer(1);
        Integer num2 = new Integer(1000);
        playlistRepositoryImpl$networkPlaylistLessons$1.f20297d = this;
        playlistRepositoryImpl$networkPlaylistLessons$1.f20298e = str;
        playlistRepositoryImpl$networkPlaylistLessons$1.f20299f = str2;
        playlistRepositoryImpl$networkPlaylistLessons$1.f20300g = i10;
        playlistRepositoryImpl$networkPlaylistLessons$1.f20303j = 1;
        Object objM18498f = interfaceC9943k.m18498f(str, strValueOf, num, num2, playlistRepositoryImpl$networkPlaylistLessons$1);
        if (objM18498f == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        str3 = str;
        obj = objM18498f;
        str4 = str2;
        i11 = i10;
        results = (Results) obj;
        List<? extends ResultType> list = results.f19136d;
        if (list != 0) {
            LingQDatabase lingQDatabase = playlistRepositoryImpl.f20197a;
            PlaylistRepositoryImpl$networkPlaylistLessons$2$1 playlistRepositoryImpl$networkPlaylistLessons$2$1 = new PlaylistRepositoryImpl$networkPlaylistLessons$2$1(list, str4, str3, i11, playlistRepositoryImpl, null);
            playlistRepositoryImpl$networkPlaylistLessons$1.f20297d = results;
            playlistRepositoryImpl$networkPlaylistLessons$1.f20298e = null;
            playlistRepositoryImpl$networkPlaylistLessons$1.f20299f = null;
            playlistRepositoryImpl$networkPlaylistLessons$1.f20303j = 2;
            if (RoomDatabaseKt.m4573a(lingQDatabase, playlistRepositoryImpl$networkPlaylistLessons$2$1, playlistRepositoryImpl$networkPlaylistLessons$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            results2 = results;
            results = results2;
        }
        return new Integer(results.f19133a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: I */
    public final Object mo6103I(int i10, int i11, String str, String str2, String str3, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$addPlaylistLesson$1 playlistRepositoryImpl$addPlaylistLesson$1;
        String str4;
        int i12;
        int i13;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str5;
        int i14;
        int i15;
        String str6;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        AbstractC1495o1 abstractC1495o1;
        List<C8801o> listM17251q;
        String str7 = str2;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$addPlaylistLesson$1) {
            playlistRepositoryImpl$addPlaylistLesson$1 = (PlaylistRepositoryImpl$addPlaylistLesson$1) interfaceC9968c;
            int i16 = playlistRepositoryImpl$addPlaylistLesson$1.f20241l;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylistLesson$1.f20241l = i16 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylistLesson$1 = new PlaylistRepositoryImpl$addPlaylistLesson$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$addPlaylistLesson$1 = new PlaylistRepositoryImpl$addPlaylistLesson$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$addPlaylistLesson$1.f20239j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = playlistRepositoryImpl$addPlaylistLesson$1.f20241l;
        if (i17 != 0) {
            if (i17 == 1) {
                int i18 = playlistRepositoryImpl$addPlaylistLesson$1.f20238i;
                int i19 = playlistRepositoryImpl$addPlaylistLesson$1.f20237h;
                String str8 = playlistRepositoryImpl$addPlaylistLesson$1.f20236g;
                String str9 = playlistRepositoryImpl$addPlaylistLesson$1.f20235f;
                str5 = playlistRepositoryImpl$addPlaylistLesson$1.f20234e;
                playlistRepositoryImpl = playlistRepositoryImpl$addPlaylistLesson$1.f20233d;
                C7499b.m14977z0(obj);
                i13 = i18;
                str7 = str9;
                i12 = i19;
                str4 = str8;
            } else if (i17 == 2) {
                i15 = playlistRepositoryImpl$addPlaylistLesson$1.f20238i;
                i14 = playlistRepositoryImpl$addPlaylistLesson$1.f20237h;
                str6 = playlistRepositoryImpl$addPlaylistLesson$1.f20234e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$addPlaylistLesson$1.f20233d;
                C7499b.m14977z0(obj);
                abstractC1495o1 = playlistRepositoryImpl2.f20198b;
                listM17251q = C9000b.m17251q(new C8801o(str6, i14, i15));
                playlistRepositoryImpl$addPlaylistLesson$1.f20233d = null;
                playlistRepositoryImpl$addPlaylistLesson$1.f20234e = null;
                playlistRepositoryImpl$addPlaylistLesson$1.f20241l = 3;
                if (abstractC1495o1.mo5137J0(listM17251q, playlistRepositoryImpl$addPlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$addPlaylistLesson$1.f20233d = this;
        playlistRepositoryImpl$addPlaylistLesson$1.f20234e = str;
        playlistRepositoryImpl$addPlaylistLesson$1.f20235f = str7;
        str4 = str3;
        playlistRepositoryImpl$addPlaylistLesson$1.f20236g = str4;
        i12 = i10;
        playlistRepositoryImpl$addPlaylistLesson$1.f20237h = i12;
        i13 = i11;
        playlistRepositoryImpl$addPlaylistLesson$1.f20238i = i13;
        playlistRepositoryImpl$addPlaylistLesson$1.f20241l = 1;
        Object objMo5187A0 = this.f20199c.mo5187A0(str7, playlistRepositoryImpl$addPlaylistLesson$1);
        if (objMo5187A0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        str5 = str;
        obj = objMo5187A0;
        Integer num = (Integer) obj;
        Integer num2 = num == null ? new Integer(0) : new Integer(num.intValue() + 1);
        playlistRepositoryImpl.m9544M(i12, null, str5, str4, "add");
        C8805s c8805s = new C8805s(i13, num2, str7, str5, false);
        playlistRepositoryImpl$addPlaylistLesson$1.f20233d = playlistRepositoryImpl;
        playlistRepositoryImpl$addPlaylistLesson$1.f20234e = str5;
        playlistRepositoryImpl$addPlaylistLesson$1.f20235f = null;
        playlistRepositoryImpl$addPlaylistLesson$1.f20236g = null;
        playlistRepositoryImpl$addPlaylistLesson$1.f20237h = i12;
        playlistRepositoryImpl$addPlaylistLesson$1.f20238i = i13;
        playlistRepositoryImpl$addPlaylistLesson$1.f20241l = 2;
        if (playlistRepositoryImpl.f20199c.mo5204R0(c8805s, playlistRepositoryImpl$addPlaylistLesson$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        i14 = i12;
        i15 = i13;
        str6 = str5;
        playlistRepositoryImpl2 = playlistRepositoryImpl;
        abstractC1495o1 = playlistRepositoryImpl2.f20198b;
        listM17251q = C9000b.m17251q(new C8801o(str6, i14, i15));
        playlistRepositoryImpl$addPlaylistLesson$1.f20233d = null;
        playlistRepositoryImpl$addPlaylistLesson$1.f20234e = null;
        playlistRepositoryImpl$addPlaylistLesson$1.f20241l = 3;
        if (abstractC1495o1.mo5137J0(listM17251q, playlistRepositoryImpl$addPlaylistLesson$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:44:0x0146  */
    /* JADX WARN: Code duplicated, block: B:48:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: J */
    public final Object mo6104J(String str, String str2, String str3, int i10, Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$1 playlistRepositoryImpl$removePlaylistLesson$1;
        String str4;
        Integer num2;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        Object objMo5197K0;
        Object objMo5195I0;
        String str5;
        int i11;
        Integer num3;
        String str6;
        String str7;
        C8805s c8805s;
        PlaylistDao playlistDao;
        int i12;
        C8805s c8805s2;
        String str8;
        PlaylistDao playlistDao2;
        int iIntValue;
        Integer num4;
        String str9;
        String str10;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        Integer num5;
        int iIntValue2;
        PlaylistDao playlistDao3;
        Integer num6;
        String str11;
        String str12;
        PlaylistRepositoryImpl playlistRepositoryImpl3;
        String str13 = str;
        String str14 = str2;
        int i13 = i10;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$removePlaylistLesson$1) {
            playlistRepositoryImpl$removePlaylistLesson$1 = (PlaylistRepositoryImpl$removePlaylistLesson$1) interfaceC9968c;
            int i14 = playlistRepositoryImpl$removePlaylistLesson$1.f20331H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = i14 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$1 = new PlaylistRepositoryImpl$removePlaylistLesson$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$1 = new PlaylistRepositoryImpl$removePlaylistLesson$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$removePlaylistLesson$1.f20339k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = playlistRepositoryImpl$removePlaylistLesson$1.f20331H;
        if (i15 == 0) {
            C7499b.m14977z0(obj);
            if (num == null) {
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = this;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str13;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str14;
                str4 = str3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str4;
                playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i13;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 1;
                objMo5197K0 = this.f20199c.mo5197K0(i13, str13, str14, playlistRepositoryImpl$removePlaylistLesson$1);
                if (objMo5197K0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl = this;
            } else {
                str4 = str3;
                num2 = num;
                playlistRepositoryImpl = this;
            }
            if (num2 != null) {
                num2.intValue();
                playlistRepositoryImpl.f20207k.m15505b(null, "remove_from_playlist");
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str13;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str14;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str4;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num2;
                playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i13;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 2;
                objMo5195I0 = playlistRepositoryImpl.f20199c.mo5195I0(i13, str14, playlistRepositoryImpl$removePlaylistLesson$1);
                if (objMo5195I0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str5 = str13;
                i11 = i13;
                num3 = num2;
                str6 = str14;
                str7 = str4;
                obj = objMo5195I0;
                c8805s = (C8805s) obj;
                playlistDao = playlistRepositoryImpl.f20199c;
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str7;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s;
                playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i11;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 3;
                if (playlistDao.mo5216n0(i11, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str15 = str7;
                i12 = i11;
                c8805s2 = c8805s;
                str8 = str15;
                playlistDao2 = playlistRepositoryImpl.f20199c;
                iIntValue = num3.intValue();
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str8;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s2;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 4;
                if (playlistDao2.mo5214l0(iIntValue, i12, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                num4 = num3;
                str9 = str8;
                str10 = str5;
                playlistRepositoryImpl2 = playlistRepositoryImpl;
                if (c8805s2 != null) {
                    iIntValue2 = num5.intValue();
                    playlistDao3 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str10;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str9;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20335g = num4;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20336h = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20337i = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 5;
                    if (playlistDao3.mo5207U0(iIntValue2, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    num6 = num4;
                    str11 = str9;
                    str12 = str10;
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                    str10 = str12;
                    playlistRepositoryImpl2 = playlistRepositoryImpl3;
                    str9 = str11;
                    num4 = num6;
                }
                playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
            }
            return C9072e.f47360a;
        }
        if (i15 == 1) {
            int i16 = playlistRepositoryImpl$removePlaylistLesson$1.f20338j;
            String str16 = (String) playlistRepositoryImpl$removePlaylistLesson$1.f20335g;
            String str17 = playlistRepositoryImpl$removePlaylistLesson$1.f20334f;
            String str18 = playlistRepositoryImpl$removePlaylistLesson$1.f20333e;
            playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistLesson$1.f20332d;
            C7499b.m14977z0(obj);
            i13 = i16;
            str13 = str18;
            objMo5197K0 = obj;
            str4 = str16;
            str14 = str17;
        } else {
            if (i15 == 2) {
                i11 = playlistRepositoryImpl$removePlaylistLesson$1.f20338j;
                Integer num7 = playlistRepositoryImpl$removePlaylistLesson$1.f20336h;
                String str19 = (String) playlistRepositoryImpl$removePlaylistLesson$1.f20335g;
                str6 = playlistRepositoryImpl$removePlaylistLesson$1.f20334f;
                str5 = playlistRepositoryImpl$removePlaylistLesson$1.f20333e;
                playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistLesson$1.f20332d;
                C7499b.m14977z0(obj);
                num3 = num7;
                str7 = str19;
                c8805s = (C8805s) obj;
                playlistDao = playlistRepositoryImpl.f20199c;
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str7;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s;
                playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i11;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 3;
                if (playlistDao.mo5216n0(i11, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str110 = str7;
                i12 = i11;
                c8805s2 = c8805s;
                str8 = str110;
                playlistDao2 = playlistRepositoryImpl.f20199c;
                iIntValue = num3.intValue();
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str8;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s2;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 4;
                if (playlistDao2.mo5214l0(iIntValue, i12, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                num4 = num3;
                str9 = str8;
                str10 = str5;
                playlistRepositoryImpl2 = playlistRepositoryImpl;
                if (c8805s2 != null) {
                    iIntValue2 = num5.intValue();
                    playlistDao3 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str10;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str9;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20335g = num4;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20336h = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20337i = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 5;
                    if (playlistDao3.mo5207U0(iIntValue2, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    num6 = num4;
                    str11 = str9;
                    str12 = str10;
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                }
                playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
                return C9072e.f47360a;
            }
            if (i15 == 3) {
                int i17 = playlistRepositoryImpl$removePlaylistLesson$1.f20338j;
                C8805s c8805s3 = playlistRepositoryImpl$removePlaylistLesson$1.f20337i;
                num3 = playlistRepositoryImpl$removePlaylistLesson$1.f20336h;
                String str20 = (String) playlistRepositoryImpl$removePlaylistLesson$1.f20335g;
                String str21 = playlistRepositoryImpl$removePlaylistLesson$1.f20334f;
                str5 = playlistRepositoryImpl$removePlaylistLesson$1.f20333e;
                playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistLesson$1.f20332d;
                C7499b.m14977z0(obj);
                str8 = str20;
                str6 = str21;
                i12 = i17;
                c8805s2 = c8805s3;
                playlistDao2 = playlistRepositoryImpl.f20199c;
                iIntValue = num3.intValue();
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str8;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s2;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 4;
                if (playlistDao2.mo5214l0(iIntValue, i12, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                num4 = num3;
                str9 = str8;
                str10 = str5;
                playlistRepositoryImpl2 = playlistRepositoryImpl;
                if (c8805s2 != null) {
                    iIntValue2 = num5.intValue();
                    playlistDao3 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str10;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str9;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20335g = num4;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20336h = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20337i = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 5;
                    if (playlistDao3.mo5207U0(iIntValue2, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    num6 = num4;
                    str11 = str9;
                    str12 = str10;
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                }
                playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
                return C9072e.f47360a;
            }
            if (i15 == 4) {
                c8805s2 = playlistRepositoryImpl$removePlaylistLesson$1.f20337i;
                num4 = playlistRepositoryImpl$removePlaylistLesson$1.f20336h;
                str9 = (String) playlistRepositoryImpl$removePlaylistLesson$1.f20335g;
                str6 = playlistRepositoryImpl$removePlaylistLesson$1.f20334f;
                str10 = playlistRepositoryImpl$removePlaylistLesson$1.f20333e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$removePlaylistLesson$1.f20332d;
                C7499b.m14977z0(obj);
                if (c8805s2 != null && (num5 = c8805s2.f46676d) != null) {
                    iIntValue2 = num5.intValue();
                    playlistDao3 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str10;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str9;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20335g = num4;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20336h = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20337i = null;
                    playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 5;
                    if (playlistDao3.mo5207U0(iIntValue2, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    num6 = num4;
                    str11 = str9;
                    str12 = str10;
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                }
                playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
                return C9072e.f47360a;
            }
            if (i15 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num6 = (Integer) playlistRepositoryImpl$removePlaylistLesson$1.f20335g;
            str11 = playlistRepositoryImpl$removePlaylistLesson$1.f20334f;
            str12 = playlistRepositoryImpl$removePlaylistLesson$1.f20333e;
            playlistRepositoryImpl3 = playlistRepositoryImpl$removePlaylistLesson$1.f20332d;
            C7499b.m14977z0(obj);
        }
        str10 = str12;
        playlistRepositoryImpl2 = playlistRepositoryImpl3;
        str9 = str11;
        num4 = num6;
        playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
        return C9072e.f47360a;
        num2 = (Integer) objMo5197K0;
        if (num2 != null) {
            num2.intValue();
            playlistRepositoryImpl.f20207k.m15505b(null, "remove_from_playlist");
            playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
            playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str13;
            playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str14;
            playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str4;
            playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num2;
            playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i13;
            playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 2;
            objMo5195I0 = playlistRepositoryImpl.f20199c.mo5195I0(i13, str14, playlistRepositoryImpl$removePlaylistLesson$1);
            if (objMo5195I0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str5 = str13;
            i11 = i13;
            num3 = num2;
            str6 = str14;
            str7 = str4;
            obj = objMo5195I0;
            c8805s = (C8805s) obj;
            playlistDao = playlistRepositoryImpl.f20199c;
            playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
            playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
            playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
            playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str7;
            playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
            playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s;
            playlistRepositoryImpl$removePlaylistLesson$1.f20338j = i11;
            playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 3;
            if (playlistDao.mo5216n0(i11, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str111 = str7;
            i12 = i11;
            c8805s2 = c8805s;
            str8 = str111;
            playlistDao2 = playlistRepositoryImpl.f20199c;
            iIntValue = num3.intValue();
            playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl;
            playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str5;
            playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str6;
            playlistRepositoryImpl$removePlaylistLesson$1.f20335g = str8;
            playlistRepositoryImpl$removePlaylistLesson$1.f20336h = num3;
            playlistRepositoryImpl$removePlaylistLesson$1.f20337i = c8805s2;
            playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 4;
            if (playlistDao2.mo5214l0(iIntValue, i12, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            num4 = num3;
            str9 = str8;
            str10 = str5;
            playlistRepositoryImpl2 = playlistRepositoryImpl;
            if (c8805s2 != null) {
                iIntValue2 = num5.intValue();
                playlistDao3 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$removePlaylistLesson$1.f20332d = playlistRepositoryImpl2;
                playlistRepositoryImpl$removePlaylistLesson$1.f20333e = str10;
                playlistRepositoryImpl$removePlaylistLesson$1.f20334f = str9;
                playlistRepositoryImpl$removePlaylistLesson$1.f20335g = num4;
                playlistRepositoryImpl$removePlaylistLesson$1.f20336h = null;
                playlistRepositoryImpl$removePlaylistLesson$1.f20337i = null;
                playlistRepositoryImpl$removePlaylistLesson$1.f20331H = 5;
                if (playlistDao3.mo5207U0(iIntValue2, str6, playlistRepositoryImpl$removePlaylistLesson$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                num6 = num4;
                str11 = str9;
                str12 = str10;
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                str10 = str12;
                playlistRepositoryImpl2 = playlistRepositoryImpl3;
                str9 = str11;
                num4 = num6;
            }
            playlistRepositoryImpl2.m9544M(num4.intValue(), null, str10, str9, "del");
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: K */
    public final InterfaceC7116c<List<C6698d>> mo6105K(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20199c.mo5221s0(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final void m9544M(int i10, Integer num, String str, String str2, String str3) {
        RequestPlaylistLessonAction requestPlaylistLessonAction = new RequestPlaylistLessonAction();
        requestPlaylistLessonAction.f18144a = str2;
        requestPlaylistLessonAction.f18145b = str3;
        requestPlaylistLessonAction.f18146c = num;
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(PlaylistLessonActionWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("playlistId", String.valueOf(i10)), new Pair("data", this.f20209m.m10563a(RequestPlaylistLessonAction.class).m10535e(requestPlaylistLessonAction))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 3; i11++) {
            Pair pair = pairArr[i11];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f20208l.m4877b(aVar.m4879a());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:46:0x01af A[LOOP:0: B:45:0x01ad->B:46:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: a */
    public final Object mo6106a(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$deletePlaylist$1 playlistRepositoryImpl$deletePlaylist$1;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str3;
        int i11;
        Playlist playlist;
        Object objM14360a;
        String str4;
        Playlist playlist2;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        String str5;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        PlaylistDao playlistDao;
        String strM15498b;
        Playlist playlist3;
        String str6;
        PlaylistDao playlistDao2;
        PlaylistRepositoryImpl playlistRepositoryImpl3;
        Pair[] pairArr;
        int i12;
        C1244b.a aVar;
        String str7 = str2;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$deletePlaylist$1) {
            playlistRepositoryImpl$deletePlaylist$1 = (PlaylistRepositoryImpl$deletePlaylist$1) interfaceC9968c;
            int i13 = playlistRepositoryImpl$deletePlaylist$1.f20267k;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$deletePlaylist$1.f20267k = i13 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$deletePlaylist$1 = new PlaylistRepositoryImpl$deletePlaylist$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$deletePlaylist$1 = new PlaylistRepositoryImpl$deletePlaylist$1(this, interfaceC9968c);
        }
        Object objMo5194H0 = playlistRepositoryImpl$deletePlaylist$1.f20265i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (playlistRepositoryImpl$deletePlaylist$1.f20267k) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(objMo5194H0);
                String strM15498b2 = C7793a.m15498b(str7, str);
                playlistRepositoryImpl$deletePlaylist$1.f20260d = this;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = str7;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i10;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 1;
                objMo5194H0 = this.f20199c.mo5194H0(strM15498b2, playlistRepositoryImpl$deletePlaylist$1);
                if (objMo5194H0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl = this;
                str3 = str;
                i11 = i10;
                playlist = (Playlist) objMo5194H0;
                if (playlist != null) {
                    InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n = playlistRepositoryImpl.f20206j.mo9690n();
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str3;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = str7;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 2;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n, playlistRepositoryImpl$deletePlaylist$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str8 = str3;
                    str4 = str7;
                    playlist2 = playlist;
                    objMo5194H0 = objM14360a;
                    playlistRepositoryImpl2 = playlistRepositoryImpl;
                    str5 = str8;
                    if (C5207g.m11106a(((Map) objMo5194H0).get(str5), playlist2.f17349a)) {
                        InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n2 = playlistRepositoryImpl2.f20206j.mo9690n();
                        playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                        playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                        playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                        playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                        playlistRepositoryImpl$deletePlaylist$1.f20267k = 3;
                        objMo5194H0 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n2, playlistRepositoryImpl$deletePlaylist$1);
                        if (objMo5194H0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo5194H0);
                        linkedHashMapM13467T0.remove(str5);
                        interfaceC5182d = playlistRepositoryImpl2.f20206j;
                        playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                        playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                        playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                        playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                        playlistRepositoryImpl$deletePlaylist$1.f20267k = 4;
                        if (interfaceC5182d.mo9691o(linkedHashMapM13467T0, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    playlistDao = playlistRepositoryImpl2.f20199c;
                    strM15498b = C7793a.m15498b(str4, str5);
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = playlist2;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = null;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 5;
                    if (playlistDao.mo5218p0(strM15498b, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlist3 = playlist2;
                    str6 = str5;
                    playlistDao2 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                    if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                    String strValueOf = String.valueOf(i11);
                    playlistRepositoryImpl3.getClass();
                    NetworkType networkType = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    NetworkType networkType2 = NetworkType.CONNECTED;
                    C5207g.m11111f(networkType2, "networkType");
                    C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
                    C1315h.a aVar2 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                    aVar2.f8071c.f37533j = c1309b;
                    Pair pair = new Pair("language", str6);
                    pairArr = new Pair[]{pair, new Pair("playlistId", strValueOf)};
                    aVar = new C1244b.a();
                    for (i12 = 0; i12 < 2; i12++) {
                        Pair pair2 = pairArr[i12];
                        aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
                    }
                    aVar2.f8071c.f37528e = aVar.m4708a();
                    playlistRepositoryImpl3.f20208l.m4877b(aVar2.m4879a());
                }
                return C9072e.f47360a;
            case 1:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                str7 = (String) playlistRepositoryImpl$deletePlaylist$1.f20262f;
                str3 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                playlistRepositoryImpl = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                playlist = (Playlist) objMo5194H0;
                if (playlist != null) {
                    InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n3 = playlistRepositoryImpl.f20206j.mo9690n();
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str3;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = str7;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 2;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n3, playlistRepositoryImpl$deletePlaylist$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str9 = str3;
                    str4 = str7;
                    playlist2 = playlist;
                    objMo5194H0 = objM14360a;
                    playlistRepositoryImpl2 = playlistRepositoryImpl;
                    str5 = str9;
                    if (C5207g.m11106a(((Map) objMo5194H0).get(str5), playlist2.f17349a)) {
                        InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n4 = playlistRepositoryImpl2.f20206j.mo9690n();
                        playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                        playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                        playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                        playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                        playlistRepositoryImpl$deletePlaylist$1.f20267k = 3;
                        objMo5194H0 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n4, playlistRepositoryImpl$deletePlaylist$1);
                        if (objMo5194H0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo5194H0);
                        linkedHashMapM13467T0.remove(str5);
                        interfaceC5182d = playlistRepositoryImpl2.f20206j;
                        playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                        playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                        playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                        playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                        playlistRepositoryImpl$deletePlaylist$1.f20267k = 4;
                        if (interfaceC5182d.mo9691o(linkedHashMapM13467T0, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    playlistDao = playlistRepositoryImpl2.f20199c;
                    strM15498b = C7793a.m15498b(str4, str5);
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = playlist2;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = null;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 5;
                    if (playlistDao.mo5218p0(strM15498b, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlist3 = playlist2;
                    str6 = str5;
                    playlistDao2 = playlistRepositoryImpl2.f20199c;
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                    if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistRepositoryImpl3 = playlistRepositoryImpl2;
                    String strValueOf2 = String.valueOf(i11);
                    playlistRepositoryImpl3.getClass();
                    NetworkType networkType3 = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    NetworkType networkType4 = NetworkType.CONNECTED;
                    C5207g.m11111f(networkType4, "networkType");
                    C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
                    C1315h.a aVar3 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                    aVar3.f8071c.f37533j = c1309b2;
                    Pair pair3 = new Pair("language", str6);
                    pairArr = new Pair[]{pair3, new Pair("playlistId", strValueOf2)};
                    aVar = new C1244b.a();
                    while (i12 < 2) {
                        Pair pair4 = pairArr[i12];
                        aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
                    }
                    aVar3.f8071c.f37528e = aVar.m4708a();
                    playlistRepositoryImpl3.f20208l.m4877b(aVar3.m4879a());
                }
                return C9072e.f47360a;
            case 2:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                playlist2 = playlistRepositoryImpl$deletePlaylist$1.f20263g;
                str4 = (String) playlistRepositoryImpl$deletePlaylist$1.f20262f;
                str5 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                if (C5207g.m11106a(((Map) objMo5194H0).get(str5), playlist2.f17349a)) {
                    InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n5 = playlistRepositoryImpl2.f20206j.mo9690n();
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 3;
                    objMo5194H0 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n5, playlistRepositoryImpl$deletePlaylist$1);
                    if (objMo5194H0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo5194H0);
                    linkedHashMapM13467T0.remove(str5);
                    interfaceC5182d = playlistRepositoryImpl2.f20206j;
                    playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                    playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                    playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                    playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                    playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                    playlistRepositoryImpl$deletePlaylist$1.f20267k = 4;
                    if (interfaceC5182d.mo9691o(linkedHashMapM13467T0, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                playlistDao = playlistRepositoryImpl2.f20199c;
                strM15498b = C7793a.m15498b(str4, str5);
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = playlist2;
                playlistRepositoryImpl$deletePlaylist$1.f20263g = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 5;
                if (playlistDao.mo5218p0(strM15498b, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlist3 = playlist2;
                str6 = str5;
                playlistDao2 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                String strValueOf3 = String.valueOf(i11);
                playlistRepositoryImpl3.getClass();
                NetworkType networkType5 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                NetworkType networkType6 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType6, "networkType");
                C1309b c1309b3 = new C1309b(networkType6, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet3));
                C1315h.a aVar4 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar4.f8071c.f37533j = c1309b3;
                Pair pair5 = new Pair("language", str6);
                pairArr = new Pair[]{pair5, new Pair("playlistId", strValueOf3)};
                aVar = new C1244b.a();
                while (i12 < 2) {
                    Pair pair6 = pairArr[i12];
                    aVar.m4709b(pair6.f38013b, (String) pair6.f38012a);
                }
                aVar4.f8071c.f37528e = aVar.m4708a();
                playlistRepositoryImpl3.f20208l.m4877b(aVar4.m4879a());
                return C9072e.f47360a;
            case 3:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                playlist2 = playlistRepositoryImpl$deletePlaylist$1.f20263g;
                str4 = (String) playlistRepositoryImpl$deletePlaylist$1.f20262f;
                str5 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo5194H0);
                linkedHashMapM13467T0.remove(str5);
                interfaceC5182d = playlistRepositoryImpl2.f20206j;
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = str4;
                playlistRepositoryImpl$deletePlaylist$1.f20263g = playlist2;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 4;
                if (interfaceC5182d.mo9691o(linkedHashMapM13467T0, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistDao = playlistRepositoryImpl2.f20199c;
                strM15498b = C7793a.m15498b(str4, str5);
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = playlist2;
                playlistRepositoryImpl$deletePlaylist$1.f20263g = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 5;
                if (playlistDao.mo5218p0(strM15498b, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlist3 = playlist2;
                str6 = str5;
                playlistDao2 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                String strValueOf4 = String.valueOf(i11);
                playlistRepositoryImpl3.getClass();
                NetworkType networkType7 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                NetworkType networkType8 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType8, "networkType");
                C1309b c1309b4 = new C1309b(networkType8, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet4));
                C1315h.a aVar5 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar5.f8071c.f37533j = c1309b4;
                Pair pair7 = new Pair("language", str6);
                pairArr = new Pair[]{pair7, new Pair("playlistId", strValueOf4)};
                aVar = new C1244b.a();
                while (i12 < 2) {
                    Pair pair8 = pairArr[i12];
                    aVar.m4709b(pair8.f38013b, (String) pair8.f38012a);
                }
                aVar5.f8071c.f37528e = aVar.m4708a();
                playlistRepositoryImpl3.f20208l.m4877b(aVar5.m4879a());
                return C9072e.f47360a;
            case 4:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                playlist2 = playlistRepositoryImpl$deletePlaylist$1.f20263g;
                str4 = (String) playlistRepositoryImpl$deletePlaylist$1.f20262f;
                str5 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                playlistDao = playlistRepositoryImpl2.f20199c;
                strM15498b = C7793a.m15498b(str4, str5);
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str5;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = playlist2;
                playlistRepositoryImpl$deletePlaylist$1.f20263g = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 5;
                if (playlistDao.mo5218p0(strM15498b, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlist3 = playlist2;
                str6 = str5;
                playlistDao2 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                String strValueOf5 = String.valueOf(i11);
                playlistRepositoryImpl3.getClass();
                NetworkType networkType9 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                NetworkType networkType10 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType10, "networkType");
                C1309b c1309b5 = new C1309b(networkType10, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet5));
                C1315h.a aVar6 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar6.f8071c.f37533j = c1309b5;
                Pair pair9 = new Pair("language", str6);
                pairArr = new Pair[]{pair9, new Pair("playlistId", strValueOf5)};
                aVar = new C1244b.a();
                while (i12 < 2) {
                    Pair pair10 = pairArr[i12];
                    aVar.m4709b(pair10.f38013b, (String) pair10.f38012a);
                }
                aVar6.f8071c.f37528e = aVar.m4708a();
                playlistRepositoryImpl3.f20208l.m4877b(aVar6.m4879a());
                return C9072e.f47360a;
            case 5:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                Playlist playlist4 = (Playlist) playlistRepositoryImpl$deletePlaylist$1.f20262f;
                String str10 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                PlaylistRepositoryImpl playlistRepositoryImpl4 = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                playlist3 = playlist4;
                str6 = str10;
                playlistRepositoryImpl2 = playlistRepositoryImpl4;
                playlistDao2 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$deletePlaylist$1.f20260d = playlistRepositoryImpl2;
                playlistRepositoryImpl$deletePlaylist$1.f20261e = str6;
                playlistRepositoryImpl$deletePlaylist$1.f20262f = null;
                playlistRepositoryImpl$deletePlaylist$1.f20264h = i11;
                playlistRepositoryImpl$deletePlaylist$1.f20267k = 6;
                if (playlistDao2.mo603r(playlist3, playlistRepositoryImpl$deletePlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                String strValueOf6 = String.valueOf(i11);
                playlistRepositoryImpl3.getClass();
                NetworkType networkType11 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                NetworkType networkType12 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType12, "networkType");
                C1309b c1309b6 = new C1309b(networkType12, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet6));
                C1315h.a aVar7 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar7.f8071c.f37533j = c1309b6;
                Pair pair11 = new Pair("language", str6);
                pairArr = new Pair[]{pair11, new Pair("playlistId", strValueOf6)};
                aVar = new C1244b.a();
                while (i12 < 2) {
                    Pair pair12 = pairArr[i12];
                    aVar.m4709b(pair12.f38013b, (String) pair12.f38012a);
                }
                aVar7.f8071c.f37528e = aVar.m4708a();
                playlistRepositoryImpl3.f20208l.m4877b(aVar7.m4879a());
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                i11 = playlistRepositoryImpl$deletePlaylist$1.f20264h;
                str6 = playlistRepositoryImpl$deletePlaylist$1.f20261e;
                playlistRepositoryImpl3 = playlistRepositoryImpl$deletePlaylist$1.f20260d;
                C7499b.m14977z0(objMo5194H0);
                String strValueOf7 = String.valueOf(i11);
                playlistRepositoryImpl3.getClass();
                NetworkType networkType13 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                NetworkType networkType14 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType14, "networkType");
                C1309b c1309b7 = new C1309b(networkType14, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet7));
                C1315h.a aVar8 = (C1315h.a) new C1315h.a(PlaylistDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar8.f8071c.f37533j = c1309b7;
                Pair pair13 = new Pair("language", str6);
                pairArr = new Pair[]{pair13, new Pair("playlistId", strValueOf7)};
                aVar = new C1244b.a();
                while (i12 < 2) {
                    Pair pair14 = pairArr[i12];
                    aVar.m4709b(pair14.f38013b, (String) pair14.f38012a);
                }
                aVar8.f8071c.f37528e = aVar.m4708a();
                playlistRepositoryImpl3.f20208l.m4877b(aVar8.m4879a());
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: b */
    public final Object mo6107b(String str, InterfaceC9968c<? super List<C6698d>> interfaceC9968c) {
        return this.f20199c.mo5189C0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: c */
    public final Object mo6108c(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$5 playlistRepositoryImpl$removePlaylistLesson$5;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$removePlaylistLesson$5) {
            playlistRepositoryImpl$removePlaylistLesson$5 = (PlaylistRepositoryImpl$removePlaylistLesson$5) interfaceC9968c;
            int i12 = playlistRepositoryImpl$removePlaylistLesson$5.f20355k;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$5.f20355k = i12 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$5 = new PlaylistRepositoryImpl$removePlaylistLesson$5(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$5 = new PlaylistRepositoryImpl$removePlaylistLesson$5(this, interfaceC9968c);
        }
        PlaylistRepositoryImpl$removePlaylistLesson$5 playlistRepositoryImpl$removePlaylistLesson$6 = playlistRepositoryImpl$removePlaylistLesson$5;
        Object objMo5193G0 = playlistRepositoryImpl$removePlaylistLesson$6.f20353i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = playlistRepositoryImpl$removePlaylistLesson$6.f20355k;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = playlistRepositoryImpl$removePlaylistLesson$6.f20352h;
                i10 = playlistRepositoryImpl$removePlaylistLesson$6.f20351g;
                str2 = playlistRepositoryImpl$removePlaylistLesson$6.f20350f;
                str = playlistRepositoryImpl$removePlaylistLesson$6.f20349e;
                playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistLesson$6.f20348d;
                C7499b.m14977z0(objMo5193G0);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5193G0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5193G0);
        playlistRepositoryImpl$removePlaylistLesson$6.f20348d = this;
        playlistRepositoryImpl$removePlaylistLesson$6.f20349e = str;
        playlistRepositoryImpl$removePlaylistLesson$6.f20350f = str2;
        playlistRepositoryImpl$removePlaylistLesson$6.f20351g = i10;
        playlistRepositoryImpl$removePlaylistLesson$6.f20352h = i11;
        playlistRepositoryImpl$removePlaylistLesson$6.f20355k = 1;
        objMo5193G0 = this.f20199c.mo5193G0(i11, playlistRepositoryImpl$removePlaylistLesson$6);
        if (objMo5193G0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        int i14 = i10;
        String str3 = str2;
        UserPlaylist userPlaylist = (UserPlaylist) objMo5193G0;
        if (userPlaylist != null) {
            String str4 = userPlaylist.f22077a;
            Integer num = new Integer(i11);
            playlistRepositoryImpl$removePlaylistLesson$6.f20348d = null;
            playlistRepositoryImpl$removePlaylistLesson$6.f20349e = null;
            playlistRepositoryImpl$removePlaylistLesson$6.f20350f = null;
            playlistRepositoryImpl$removePlaylistLesson$6.f20355k = 2;
            if (playlistRepositoryImpl.mo6104J(str, str4, str3, i14, num, playlistRepositoryImpl$removePlaylistLesson$6) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: d */
    public final Object mo6109d(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18495c = this.f20203g.m18495c(str, str2, interfaceC9968c);
        return objM18495c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18495c : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x0127 A[LOOP:0: B:30:0x0125->B:31:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: e */
    public final Object mo6110e(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$updatePlaylist$1 playlistRepositoryImpl$updatePlaylist$1;
        String str4;
        String str5;
        Object objMo5194H0;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str6;
        Playlist playlist;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        String str7;
        String str8;
        Pair[] pairArr;
        int i10;
        C1244b.a aVar;
        String str9 = str2;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$updatePlaylist$1) {
            playlistRepositoryImpl$updatePlaylist$1 = (PlaylistRepositoryImpl$updatePlaylist$1) interfaceC9968c;
            int i11 = playlistRepositoryImpl$updatePlaylist$1.f20362j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$updatePlaylist$1.f20362j = i11 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$updatePlaylist$1 = new PlaylistRepositoryImpl$updatePlaylist$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$updatePlaylist$1 = new PlaylistRepositoryImpl$updatePlaylist$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$updatePlaylist$1.f20360h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = playlistRepositoryImpl$updatePlaylist$1.f20362j;
        if (i12 != 0) {
            if (i12 == 1) {
                String str10 = (String) playlistRepositoryImpl$updatePlaylist$1.f20359g;
                String str11 = playlistRepositoryImpl$updatePlaylist$1.f20358f;
                String str12 = playlistRepositoryImpl$updatePlaylist$1.f20357e;
                playlistRepositoryImpl = playlistRepositoryImpl$updatePlaylist$1.f20356d;
                C7499b.m14977z0(obj);
                str5 = str10;
                str9 = str11;
                objMo5194H0 = obj;
                str4 = str12;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                playlist = (Playlist) playlistRepositoryImpl$updatePlaylist$1.f20359g;
                str6 = playlistRepositoryImpl$updatePlaylist$1.f20358f;
                str7 = playlistRepositoryImpl$updatePlaylist$1.f20357e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$updatePlaylist$1.f20356d;
                C7499b.m14977z0(obj);
            }
            String strValueOf = String.valueOf(playlist.f17352d);
            playlistRepositoryImpl2.getClass();
            Profile profile = (Profile) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$profile$1(playlistRepositoryImpl2, null));
            RequestPlaylistCreate requestPlaylistCreate = new RequestPlaylistCreate();
            str8 = profile.f17794n;
            if (C7661i.m15250P2(str8)) {
                str8 = "en";
            }
            requestPlaylistCreate.f18141b = str8;
            requestPlaylistCreate.f18140a = str6;
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(PlaylistUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str7);
            pairArr = new Pair[]{pair, new Pair("playlistId", strValueOf), new Pair("data", playlistRepositoryImpl2.f20209m.m10563a(RequestPlaylistCreate.class).m10535e(requestPlaylistCreate))};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 3; i10++) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            playlistRepositoryImpl2.f20208l.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$updatePlaylist$1.f20356d = this;
        str4 = str;
        playlistRepositoryImpl$updatePlaylist$1.f20357e = str4;
        playlistRepositoryImpl$updatePlaylist$1.f20358f = str9;
        str5 = str3;
        playlistRepositoryImpl$updatePlaylist$1.f20359g = str5;
        playlistRepositoryImpl$updatePlaylist$1.f20362j = 1;
        objMo5194H0 = this.f20199c.mo5194H0(str9, playlistRepositoryImpl$updatePlaylist$1);
        if (objMo5194H0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        Playlist playlist2 = (Playlist) objMo5194H0;
        if (playlist2 != null) {
            PlaylistDao playlistDao = playlistRepositoryImpl.f20199c;
            String strM15498b = C7793a.m15498b(str5, str4);
            playlistRepositoryImpl$updatePlaylist$1.f20356d = playlistRepositoryImpl;
            playlistRepositoryImpl$updatePlaylist$1.f20357e = str4;
            playlistRepositoryImpl$updatePlaylist$1.f20358f = str5;
            playlistRepositoryImpl$updatePlaylist$1.f20359g = playlist2;
            playlistRepositoryImpl$updatePlaylist$1.f20362j = 2;
            if (playlistDao.mo5212Z0(strM15498b, str9, str5, playlistRepositoryImpl$updatePlaylist$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str6 = str5;
            playlist = playlist2;
            playlistRepositoryImpl2 = playlistRepositoryImpl;
            str7 = str4;
            String strValueOf2 = String.valueOf(playlist.f17352d);
            playlistRepositoryImpl2.getClass();
            Profile profile2 = (Profile) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$profile$1(playlistRepositoryImpl2, null));
            RequestPlaylistCreate requestPlaylistCreate2 = new RequestPlaylistCreate();
            str8 = profile2.f17794n;
            if (C7661i.m15250P2(str8)) {
                str8 = "en";
            }
            requestPlaylistCreate2.f18141b = str8;
            requestPlaylistCreate2.f18140a = str6;
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(PlaylistUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str7);
            pairArr = new Pair[]{pair3, new Pair("playlistId", strValueOf2), new Pair("data", playlistRepositoryImpl2.f20209m.m10563a(RequestPlaylistCreate.class).m10535e(requestPlaylistCreate2))};
            aVar = new C1244b.a();
            while (i10 < 3) {
                Pair pair4 = pairArr[i10];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            playlistRepositoryImpl2.f20208l.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<List<UserPlaylist>> mo6111f(String str, int i10) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20199c.mo5222t0(str, i10));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: g */
    public final Object mo6112g(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return this.f20199c.mo5188B0(i10, str, interfaceC9968c);
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: h */
    public final Object mo6113h(String str, String str2, InterfaceC9968c<? super UserPlaylist> interfaceC9968c) {
        return this.f20199c.mo5201O0(C7793a.m15498b(str2, str), interfaceC9968c);
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c mo6114i(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "nameWithLanguage");
        return C0062b.m273H0(this.f20199c.mo5223u0(str2));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: j */
    public final Object mo6115j(String str, String str2, RequestPlaylistCreate requestPlaylistCreate, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18501i = this.f20203g.m18501i(str, str2, requestPlaylistCreate, interfaceC9968c);
        return objM18501i == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18501i : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: k */
    public final Object mo6116k(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$networkCoursePlaylistLessons$1 playlistRepositoryImpl$networkCoursePlaylistLessons$1;
        String str2;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        List listM17252r;
        Results results;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$networkCoursePlaylistLessons$1) {
            playlistRepositoryImpl$networkCoursePlaylistLessons$1 = (PlaylistRepositoryImpl$networkCoursePlaylistLessons$1) interfaceC9968c;
            int i11 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = i11 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$networkCoursePlaylistLessons$1 = new PlaylistRepositoryImpl$networkCoursePlaylistLessons$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$networkCoursePlaylistLessons$1 = new PlaylistRepositoryImpl$networkCoursePlaylistLessons$1(this, interfaceC9968c);
        }
        Object objMo5015k0 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20287g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20286f;
                String str3 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20285e;
                PlaylistRepositoryImpl playlistRepositoryImpl2 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d;
                C7499b.m14977z0(objMo5015k0);
                str2 = str3;
                playlistRepositoryImpl = playlistRepositoryImpl2;
            } else {
                if (i12 == 2) {
                    i10 = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20286f;
                    playlistRepositoryImpl = playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d;
                    C7499b.m14977z0(objMo5015k0);
                    results = (Results) objMo5015k0;
                    if (results != null) {
                        LingQDatabase lingQDatabase = playlistRepositoryImpl.f20197a;
                        PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1 playlistRepositoryImpl$networkCoursePlaylistLessons$2$1 = new PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1(results, playlistRepositoryImpl, i10, null);
                        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = null;
                        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 3;
                        objMo5015k0 = RoomDatabaseKt.m4573a(lingQDatabase, playlistRepositoryImpl$networkCoursePlaylistLessons$2$1, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
                        if (objMo5015k0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5015k0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5015k0);
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = this;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20285e = str;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20286f = i10;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 1;
        objMo5015k0 = this.f20200d.mo5015k0(i10, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
        if (objMo5015k0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        playlistRepositoryImpl = this;
        LibraryData libraryData = (LibraryData) objMo5015k0;
        InterfaceC9939g interfaceC9939g = playlistRepositoryImpl.f20204h;
        Integer num = new Integer(i10);
        String value = Sort.Position.getValue();
        if (!C5207g.m11106a(libraryData != null ? libraryData.f17226E : null, "private")) {
            if (!C5207g.m11106a(libraryData != null ? libraryData.f17226E : null, "shared")) {
                listM17252r = C9000b.m17252r("netflix", "youtube");
            }
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = playlistRepositoryImpl;
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20285e = null;
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20286f = i10;
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 2;
            objMo5015k0 = interfaceC9939g.m18484f(str2, num, value, LibraryItemType.Content.getValue(), 1000, 1, listM17252r, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
            if (objMo5015k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            results = (Results) objMo5015k0;
            if (results != null) {
                LingQDatabase lingQDatabase2 = playlistRepositoryImpl.f20197a;
                PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1 playlistRepositoryImpl$networkCoursePlaylistLessons$2$2 = new PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1(results, playlistRepositoryImpl, i10, null);
                playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = null;
                playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 3;
                objMo5015k0 = RoomDatabaseKt.m4573a(lingQDatabase2, playlistRepositoryImpl$networkCoursePlaylistLessons$2$2, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
                if (objMo5015k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
        listM17252r = EmptyList.f38032a;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = playlistRepositoryImpl;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20285e = null;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20286f = i10;
        playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 2;
        objMo5015k0 = interfaceC9939g.m18484f(str2, num, value, LibraryItemType.Content.getValue(), 1000, 1, listM17252r, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
        if (objMo5015k0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        results = (Results) objMo5015k0;
        if (results != null) {
            LingQDatabase lingQDatabase3 = playlistRepositoryImpl.f20197a;
            PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1 playlistRepositoryImpl$networkCoursePlaylistLessons$2$3 = new PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1(results, playlistRepositoryImpl, i10, null);
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20284d = null;
            playlistRepositoryImpl$networkCoursePlaylistLessons$1.f20289i = 3;
            objMo5015k0 = RoomDatabaseKt.m4573a(lingQDatabase3, playlistRepositoryImpl$networkCoursePlaylistLessons$2$3, playlistRepositoryImpl$networkCoursePlaylistLessons$1);
            if (objMo5015k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: l */
    public final InterfaceC7116c mo6117l(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "nameWithLanguage");
        return C0062b.m273H0(this.f20199c.mo5225w0(str2));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: m */
    public final Object mo6118m(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistCourse$1 playlistRepositoryImpl$removePlaylistCourse$1;
        String str3;
        String str4;
        int i12;
        Object objMo5015k0;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        LibraryData libraryData;
        String str5;
        int i13;
        int i14;
        String str6;
        String str7;
        C8805s c8805s;
        PlaylistDao playlistDao;
        C8805s c8805s2;
        LibraryData libraryData2;
        String str8;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        Integer num;
        int iIntValue;
        PlaylistDao playlistDao2;
        LibraryData libraryData3;
        String str9;
        PlaylistRepositoryImpl playlistRepositoryImpl3;
        String str10;
        int i15 = i10;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$removePlaylistCourse$1) {
            playlistRepositoryImpl$removePlaylistCourse$1 = (PlaylistRepositoryImpl$removePlaylistCourse$1) interfaceC9968c;
            int i16 = playlistRepositoryImpl$removePlaylistCourse$1.f20321H;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistCourse$1.f20321H = i16 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistCourse$1 = new PlaylistRepositoryImpl$removePlaylistCourse$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$removePlaylistCourse$1 = new PlaylistRepositoryImpl$removePlaylistCourse$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$removePlaylistCourse$1.f20329k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = playlistRepositoryImpl$removePlaylistCourse$1.f20321H;
        if (i17 != 0) {
            if (i17 == 1) {
                int i18 = playlistRepositoryImpl$removePlaylistCourse$1.f20328j;
                int i19 = playlistRepositoryImpl$removePlaylistCourse$1.f20327i;
                String str11 = (String) playlistRepositoryImpl$removePlaylistCourse$1.f20324f;
                String str12 = playlistRepositoryImpl$removePlaylistCourse$1.f20323e;
                playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistCourse$1.f20322d;
                C7499b.m14977z0(obj);
                i12 = i18;
                i15 = i19;
                str4 = str11;
                objMo5015k0 = obj;
                str3 = str12;
            } else {
                if (i17 == 2) {
                    i14 = playlistRepositoryImpl$removePlaylistCourse$1.f20328j;
                    i13 = playlistRepositoryImpl$removePlaylistCourse$1.f20327i;
                    LibraryData libraryData4 = playlistRepositoryImpl$removePlaylistCourse$1.f20325g;
                    String str13 = (String) playlistRepositoryImpl$removePlaylistCourse$1.f20324f;
                    str6 = playlistRepositoryImpl$removePlaylistCourse$1.f20323e;
                    playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistCourse$1.f20322d;
                    C7499b.m14977z0(obj);
                    str5 = str13;
                    libraryData = libraryData4;
                    str7 = str5;
                    c8805s = (C8805s) obj;
                    playlistDao = playlistRepositoryImpl.f20199c;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str6;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20324f = str7;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20325g = libraryData;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20326h = c8805s;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i14;
                    playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 3;
                    if (playlistDao.mo5215m0(i13, str6, playlistRepositoryImpl$removePlaylistCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c8805s2 = c8805s;
                    libraryData2 = libraryData;
                    str8 = str6;
                    playlistRepositoryImpl2 = playlistRepositoryImpl;
                    if (c8805s2 != null) {
                        iIntValue = num.intValue();
                        playlistDao2 = playlistRepositoryImpl2.f20199c;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str8;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20324f = libraryData2;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20325g = null;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20326h = null;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i14;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 4;
                        if (playlistDao2.mo5207U0(iIntValue, str7, playlistRepositoryImpl$removePlaylistCourse$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        libraryData3 = libraryData2;
                        str9 = str8;
                        playlistRepositoryImpl3 = playlistRepositoryImpl2;
                    }
                    str10 = libraryData2.f17243f;
                    if (str10 == null) {
                        str10 = "";
                    }
                    playlistRepositoryImpl2.m9544M(i14, null, str8, str10, "del");
                    return C9072e.f47360a;
                }
                if (i17 == 3) {
                    i14 = playlistRepositoryImpl$removePlaylistCourse$1.f20327i;
                    c8805s2 = playlistRepositoryImpl$removePlaylistCourse$1.f20326h;
                    libraryData2 = playlistRepositoryImpl$removePlaylistCourse$1.f20325g;
                    str7 = (String) playlistRepositoryImpl$removePlaylistCourse$1.f20324f;
                    str8 = playlistRepositoryImpl$removePlaylistCourse$1.f20323e;
                    playlistRepositoryImpl2 = playlistRepositoryImpl$removePlaylistCourse$1.f20322d;
                    C7499b.m14977z0(obj);
                    if (c8805s2 != null && (num = c8805s2.f46676d) != null) {
                        iIntValue = num.intValue();
                        playlistDao2 = playlistRepositoryImpl2.f20199c;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl2;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str8;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20324f = libraryData2;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20325g = null;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20326h = null;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i14;
                        playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 4;
                        if (playlistDao2.mo5207U0(iIntValue, str7, playlistRepositoryImpl$removePlaylistCourse$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        libraryData3 = libraryData2;
                        str9 = str8;
                        playlistRepositoryImpl3 = playlistRepositoryImpl2;
                    }
                    str10 = libraryData2.f17243f;
                    if (str10 == null) {
                        str10 = "";
                    }
                    playlistRepositoryImpl2.m9544M(i14, null, str8, str10, "del");
                    return C9072e.f47360a;
                }
                if (i17 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = playlistRepositoryImpl$removePlaylistCourse$1.f20327i;
                libraryData3 = (LibraryData) playlistRepositoryImpl$removePlaylistCourse$1.f20324f;
                str9 = playlistRepositoryImpl$removePlaylistCourse$1.f20323e;
                playlistRepositoryImpl3 = playlistRepositoryImpl$removePlaylistCourse$1.f20322d;
                C7499b.m14977z0(obj);
            }
            playlistRepositoryImpl2 = playlistRepositoryImpl3;
            libraryData2 = libraryData3;
            str8 = str9;
            str10 = libraryData2.f17243f;
            if (str10 == null) {
                str10 = "";
            }
            playlistRepositoryImpl2.m9544M(i14, null, str8, str10, "del");
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$removePlaylistCourse$1.f20322d = this;
        str3 = str;
        playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str3;
        str4 = str2;
        playlistRepositoryImpl$removePlaylistCourse$1.f20324f = str4;
        playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i15;
        i12 = i11;
        playlistRepositoryImpl$removePlaylistCourse$1.f20328j = i12;
        playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 1;
        objMo5015k0 = this.f20200d.mo5015k0(i15, playlistRepositoryImpl$removePlaylistCourse$1);
        if (objMo5015k0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        libraryData = (LibraryData) objMo5015k0;
        if (libraryData != null) {
            playlistRepositoryImpl.f20207k.m15505b(null, "remove_from_playlist");
            playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl;
            playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str3;
            playlistRepositoryImpl$removePlaylistCourse$1.f20324f = str4;
            playlistRepositoryImpl$removePlaylistCourse$1.f20325g = libraryData;
            playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i15;
            playlistRepositoryImpl$removePlaylistCourse$1.f20328j = i12;
            playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 2;
            Object objMo5195I0 = playlistRepositoryImpl.f20199c.mo5195I0(i15, str4, playlistRepositoryImpl$removePlaylistCourse$1);
            if (objMo5195I0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str5 = str4;
            i13 = i15;
            i14 = i12;
            str6 = str3;
            obj = objMo5195I0;
            str7 = str5;
            c8805s = (C8805s) obj;
            playlistDao = playlistRepositoryImpl.f20199c;
            playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl;
            playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str6;
            playlistRepositoryImpl$removePlaylistCourse$1.f20324f = str7;
            playlistRepositoryImpl$removePlaylistCourse$1.f20325g = libraryData;
            playlistRepositoryImpl$removePlaylistCourse$1.f20326h = c8805s;
            playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i14;
            playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 3;
            if (playlistDao.mo5215m0(i13, str6, playlistRepositoryImpl$removePlaylistCourse$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c8805s2 = c8805s;
            libraryData2 = libraryData;
            str8 = str6;
            playlistRepositoryImpl2 = playlistRepositoryImpl;
            if (c8805s2 != null) {
                iIntValue = num.intValue();
                playlistDao2 = playlistRepositoryImpl2.f20199c;
                playlistRepositoryImpl$removePlaylistCourse$1.f20322d = playlistRepositoryImpl2;
                playlistRepositoryImpl$removePlaylistCourse$1.f20323e = str8;
                playlistRepositoryImpl$removePlaylistCourse$1.f20324f = libraryData2;
                playlistRepositoryImpl$removePlaylistCourse$1.f20325g = null;
                playlistRepositoryImpl$removePlaylistCourse$1.f20326h = null;
                playlistRepositoryImpl$removePlaylistCourse$1.f20327i = i14;
                playlistRepositoryImpl$removePlaylistCourse$1.f20321H = 4;
                if (playlistDao2.mo5207U0(iIntValue, str7, playlistRepositoryImpl$removePlaylistCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                libraryData3 = libraryData2;
                str9 = str8;
                playlistRepositoryImpl3 = playlistRepositoryImpl2;
                playlistRepositoryImpl2 = playlistRepositoryImpl3;
                libraryData2 = libraryData3;
                str8 = str9;
            }
            str10 = libraryData2.f17243f;
            if (str10 == null) {
                str10 = "";
            }
            playlistRepositoryImpl2.m9544M(i14, null, str8, str10, "del");
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: n */
    public final Object mo6119n(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1 playlistRepositoryImpl$addCompletedLessonToPlaylist$1;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        UserPlaylist userPlaylist;
        LibraryData libraryData;
        String str2;
        String str3;
        int i11;
        String str4;
        int i12;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1) {
            playlistRepositoryImpl$addCompletedLessonToPlaylist$1 = (PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1) interfaceC9968c;
            int i13 = playlistRepositoryImpl$addCompletedLessonToPlaylist$1.f20215i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addCompletedLessonToPlaylist$1.f20215i = i13 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addCompletedLessonToPlaylist$1 = new PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$addCompletedLessonToPlaylist$1 = new PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1(this, interfaceC9968c);
        }
        PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1 playlistRepositoryImpl$addCompletedLessonToPlaylist$2 = playlistRepositoryImpl$addCompletedLessonToPlaylist$1;
        Object objMo5228z0 = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20213g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20215i;
        if (i14 != 0) {
            if (i14 == 1) {
                i10 = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20212f;
                playlistRepositoryImpl = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d;
                C7499b.m14977z0(objMo5228z0);
            } else if (i14 == 2) {
                userPlaylist = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20211e;
                PlaylistRepositoryImpl playlistRepositoryImpl3 = playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d;
                C7499b.m14977z0(objMo5228z0);
                playlistRepositoryImpl2 = playlistRepositoryImpl3;
                libraryData = (LibraryData) objMo5228z0;
                if (libraryData != null && !libraryData.f17235N) {
                    str2 = userPlaylist.f22078b;
                    str3 = userPlaylist.f22077a;
                    i11 = userPlaylist.f22080d;
                    str4 = libraryData.f17243f;
                    if (str4 == null) {
                        str4 = "";
                    }
                    i12 = libraryData.f17238a;
                    playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d = null;
                    playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20211e = null;
                    playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20215i = 3;
                    if (playlistRepositoryImpl2.mo6103I(i11, i12, str2, str3, str4, playlistRepositoryImpl$addCompletedLessonToPlaylist$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5228z0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5228z0);
        playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d = this;
        playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20212f = i10;
        playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20215i = 1;
        objMo5228z0 = this.f20199c.mo5228z0(str, playlistRepositoryImpl$addCompletedLessonToPlaylist$2);
        if (objMo5228z0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        UserPlaylist userPlaylist2 = (UserPlaylist) objMo5228z0;
        if (userPlaylist2 != null) {
            PlaylistDao playlistDao = playlistRepositoryImpl.f20199c;
            playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d = playlistRepositoryImpl;
            playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20211e = userPlaylist2;
            playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20215i = 2;
            Object objMo5198L0 = playlistDao.mo5198L0(i10, playlistRepositoryImpl$addCompletedLessonToPlaylist$2);
            if (objMo5198L0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            playlistRepositoryImpl2 = playlistRepositoryImpl;
            objMo5228z0 = objMo5198L0;
            userPlaylist = userPlaylist2;
            libraryData = (LibraryData) objMo5228z0;
            if (libraryData != null) {
                str2 = userPlaylist.f22078b;
                str3 = userPlaylist.f22077a;
                i11 = userPlaylist.f22080d;
                str4 = libraryData.f17243f;
                if (str4 == null) {
                    str4 = "";
                }
                i12 = libraryData.f17238a;
                playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20210d = null;
                playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20211e = null;
                playlistRepositoryImpl$addCompletedLessonToPlaylist$2.f20215i = 3;
                if (playlistRepositoryImpl2.mo6103I(i11, i12, str2, str3, str4, playlistRepositoryImpl$addCompletedLessonToPlaylist$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: o */
    public final Object mo6120o(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$clearDownloads$1 playlistRepositoryImpl$clearDownloads$1;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$clearDownloads$1) {
            playlistRepositoryImpl$clearDownloads$1 = (PlaylistRepositoryImpl$clearDownloads$1) interfaceC9968c;
            int i10 = playlistRepositoryImpl$clearDownloads$1.f20259g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$clearDownloads$1.f20259g = i10 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$clearDownloads$1 = new PlaylistRepositoryImpl$clearDownloads$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$clearDownloads$1 = new PlaylistRepositoryImpl$clearDownloads$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$clearDownloads$1.f20257e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = playlistRepositoryImpl$clearDownloads$1.f20259g;
        if (i11 != 0) {
            if (i11 == 1) {
                playlistRepositoryImpl = playlistRepositoryImpl$clearDownloads$1.f20256d;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$clearDownloads$1.f20256d = this;
        playlistRepositoryImpl$clearDownloads$1.f20259g = 1;
        if (this.f20199c.mo5213k0(playlistRepositoryImpl$clearDownloads$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        AbstractC1454i2 abstractC1454i2 = playlistRepositoryImpl.f20202f;
        playlistRepositoryImpl$clearDownloads$1.f20256d = null;
        playlistRepositoryImpl$clearDownloads$1.f20259g = 2;
        if (abstractC1454i2.mo5068k0(playlistRepositoryImpl$clearDownloads$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x0166 A[LOOP:0: B:32:0x0164->B:33:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: p */
    public final Object mo6121p(String str, String str2, String str3, Integer num, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$addPlaylist$1 playlistRepositoryImpl$addPlaylist$1;
        String str4;
        Integer num2;
        String str5;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str6;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        String str7;
        String str8;
        String str9;
        Integer num3;
        String str10;
        Pair[] pairArr;
        C1244b.a aVar;
        int i10;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$addPlaylist$1) {
            playlistRepositoryImpl$addPlaylist$1 = (PlaylistRepositoryImpl$addPlaylist$1) interfaceC9968c;
            int i11 = playlistRepositoryImpl$addPlaylist$1.f20223k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylist$1.f20223k = i11 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylist$1 = new PlaylistRepositoryImpl$addPlaylist$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$addPlaylist$1 = new PlaylistRepositoryImpl$addPlaylist$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$addPlaylist$1.f20221i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = playlistRepositoryImpl$addPlaylist$1.f20223k;
        if (i12 != 0) {
            if (i12 == 1) {
                String str11 = playlistRepositoryImpl$addPlaylist$1.f20220h;
                num2 = playlistRepositoryImpl$addPlaylist$1.f20219g;
                String str12 = playlistRepositoryImpl$addPlaylist$1.f20218f;
                str6 = playlistRepositoryImpl$addPlaylist$1.f20217e;
                PlaylistRepositoryImpl playlistRepositoryImpl3 = playlistRepositoryImpl$addPlaylist$1.f20216d;
                C7499b.m14977z0(obj);
                playlistRepositoryImpl = playlistRepositoryImpl3;
                str5 = str11;
                str4 = str12;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str7 = playlistRepositoryImpl$addPlaylist$1.f20220h;
                num3 = playlistRepositoryImpl$addPlaylist$1.f20219g;
                str9 = playlistRepositoryImpl$addPlaylist$1.f20218f;
                str8 = playlistRepositoryImpl$addPlaylist$1.f20217e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$addPlaylist$1.f20216d;
                C7499b.m14977z0(obj);
            }
            playlistRepositoryImpl2.getClass();
            Profile profile = (Profile) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1(playlistRepositoryImpl2, null));
            RequestPlaylistCreate requestPlaylistCreate = new RequestPlaylistCreate();
            str10 = profile.f17794n;
            if (C7661i.m15250P2(str10)) {
                str10 = "en";
            }
            requestPlaylistCreate.f18141b = str10;
            requestPlaylistCreate.f18140a = str9;
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(AddPlaylistWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            pairArr = new Pair[]{new Pair("language", str8), new Pair("data", playlistRepositoryImpl2.f20209m.m10563a(RequestPlaylistCreate.class).m10535e(requestPlaylistCreate)), new Pair("itemId", num3), new Pair("itemURL", str7)};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 4; i10++) {
                Pair pair = pairArr[i10];
                aVar.m4709b(pair.f38013b, (String) pair.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            playlistRepositoryImpl2.f20208l.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$addPlaylist$1.f20216d = this;
        playlistRepositoryImpl$addPlaylist$1.f20217e = str;
        str4 = str2;
        playlistRepositoryImpl$addPlaylist$1.f20218f = str4;
        num2 = num;
        playlistRepositoryImpl$addPlaylist$1.f20219g = num2;
        str5 = str3;
        playlistRepositoryImpl$addPlaylist$1.f20220h = str5;
        playlistRepositoryImpl$addPlaylist$1.f20223k = 1;
        Object objMo5200N0 = this.f20199c.mo5200N0(playlistRepositoryImpl$addPlaylist$1);
        if (objMo5200N0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        str6 = str;
        obj = objMo5200N0;
        Integer num4 = (Integer) obj;
        PlaylistRepositoryImpl playlistRepositoryImpl4 = playlistRepositoryImpl;
        Playlist playlist = new Playlist(C7793a.m15498b(str4, str6), str6, str4, 0, false, false, (num4 != null ? num4.intValue() : 0) + 1, 56, null);
        PlaylistDao playlistDao = playlistRepositoryImpl4.f20199c;
        playlistRepositoryImpl$addPlaylist$1.f20216d = playlistRepositoryImpl4;
        playlistRepositoryImpl$addPlaylist$1.f20217e = str6;
        playlistRepositoryImpl$addPlaylist$1.f20218f = str4;
        playlistRepositoryImpl$addPlaylist$1.f20219g = num2;
        playlistRepositoryImpl$addPlaylist$1.f20220h = str5;
        playlistRepositoryImpl$addPlaylist$1.f20223k = 2;
        if (playlistDao.mo598h0(playlist, playlistRepositoryImpl$addPlaylist$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl2 = playlistRepositoryImpl4;
        str7 = str5;
        str8 = str6;
        Integer num5 = num2;
        str9 = str4;
        num3 = num5;
        playlistRepositoryImpl2.getClass();
        Profile profile2 = (Profile) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1(playlistRepositoryImpl2, null));
        RequestPlaylistCreate requestPlaylistCreate2 = new RequestPlaylistCreate();
        str10 = profile2.f17794n;
        if (C7661i.m15250P2(str10)) {
            str10 = "en";
        }
        requestPlaylistCreate2.f18141b = str10;
        requestPlaylistCreate2.f18140a = str9;
        NetworkType networkType3 = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        NetworkType networkType4 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType4, "networkType");
        C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
        C1315h.a aVar3 = (C1315h.a) new C1315h.a(AddPlaylistWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar3.f8071c.f37533j = c1309b2;
        pairArr = new Pair[]{new Pair("language", str8), new Pair("data", playlistRepositoryImpl2.f20209m.m10563a(RequestPlaylistCreate.class).m10535e(requestPlaylistCreate2)), new Pair("itemId", num3), new Pair("itemURL", str7)};
        aVar = new C1244b.a();
        while (i10 < 4) {
            Pair pair2 = pairArr[i10];
            aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar3.f8071c.f37528e = aVar.m4708a();
        playlistRepositoryImpl2.f20208l.m4877b(aVar3.m4879a());
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: q */
    public final Object mo6122q(int i10, int i11, String str, int i12, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$changePosition$1 playlistRepositoryImpl$changePosition$1;
        int i13;
        int i14;
        Object objMo5199M0;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        int i15;
        int i16;
        List list;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        LingQDatabase lingQDatabase;
        PlaylistRepositoryImpl$changePosition$2 playlistRepositoryImpl$changePosition$2;
        String str2 = str;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$changePosition$1) {
            playlistRepositoryImpl$changePosition$1 = (PlaylistRepositoryImpl$changePosition$1) interfaceC9968c;
            int i17 = playlistRepositoryImpl$changePosition$1.f20248j;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$changePosition$1.f20248j = i17 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$changePosition$1 = new PlaylistRepositoryImpl$changePosition$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$changePosition$1 = new PlaylistRepositoryImpl$changePosition$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$changePosition$1.f20246h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = playlistRepositoryImpl$changePosition$1.f20248j;
        if (i18 != 0) {
            if (i18 == 1) {
                int i19 = playlistRepositoryImpl$changePosition$1.f20245g;
                int i20 = playlistRepositoryImpl$changePosition$1.f20244f;
                String str3 = (String) playlistRepositoryImpl$changePosition$1.f20243e;
                playlistRepositoryImpl = playlistRepositoryImpl$changePosition$1.f20242d;
                C7499b.m14977z0(obj);
                i14 = i19;
                str2 = str3;
                objMo5199M0 = obj;
                i13 = i20;
            } else if (i18 == 2) {
                int i21 = playlistRepositoryImpl$changePosition$1.f20245g;
                int i22 = playlistRepositoryImpl$changePosition$1.f20244f;
                List list2 = (List) playlistRepositoryImpl$changePosition$1.f20243e;
                PlaylistRepositoryImpl playlistRepositoryImpl3 = playlistRepositoryImpl$changePosition$1.f20242d;
                C7499b.m14977z0(obj);
                i16 = i21;
                i15 = i22;
                list = list2;
                playlistRepositoryImpl2 = playlistRepositoryImpl3;
                lingQDatabase = playlistRepositoryImpl2.f20197a;
                playlistRepositoryImpl$changePosition$2 = new PlaylistRepositoryImpl$changePosition$2(list, (List) obj, playlistRepositoryImpl2, i15, i16, null);
                playlistRepositoryImpl$changePosition$1.f20242d = null;
                playlistRepositoryImpl$changePosition$1.f20243e = null;
                playlistRepositoryImpl$changePosition$1.f20248j = 3;
                if (RoomDatabaseKt.m4573a(lingQDatabase, playlistRepositoryImpl$changePosition$2, playlistRepositoryImpl$changePosition$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i18 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$changePosition$1.f20242d = this;
        playlistRepositoryImpl$changePosition$1.f20243e = str2;
        i13 = i11;
        playlistRepositoryImpl$changePosition$1.f20244f = i13;
        i14 = i12;
        playlistRepositoryImpl$changePosition$1.f20245g = i14;
        playlistRepositoryImpl$changePosition$1.f20248j = 1;
        objMo5199M0 = this.f20199c.mo5199M0(i10, str2, playlistRepositoryImpl$changePosition$1);
        if (objMo5199M0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        List list3 = (List) objMo5199M0;
        PlaylistDao playlistDao = playlistRepositoryImpl.f20199c;
        playlistRepositoryImpl$changePosition$1.f20242d = playlistRepositoryImpl;
        playlistRepositoryImpl$changePosition$1.f20243e = list3;
        playlistRepositoryImpl$changePosition$1.f20244f = i13;
        playlistRepositoryImpl$changePosition$1.f20245g = i14;
        playlistRepositoryImpl$changePosition$1.f20248j = 2;
        Object objMo5199M1 = playlistDao.mo5199M0(i13, str2, playlistRepositoryImpl$changePosition$1);
        if (objMo5199M1 == coroutineSingletons) {
            return coroutineSingletons;
        }
        i15 = i13;
        i16 = i14;
        list = list3;
        playlistRepositoryImpl2 = playlistRepositoryImpl;
        obj = objMo5199M1;
        lingQDatabase = playlistRepositoryImpl2.f20197a;
        playlistRepositoryImpl$changePosition$2 = new PlaylistRepositoryImpl$changePosition$2(list, (List) obj, playlistRepositoryImpl2, i15, i16, null);
        playlistRepositoryImpl$changePosition$1.f20242d = null;
        playlistRepositoryImpl$changePosition$1.f20243e = null;
        playlistRepositoryImpl$changePosition$1.f20248j = 3;
        if (RoomDatabaseKt.m4573a(lingQDatabase, playlistRepositoryImpl$changePosition$2, playlistRepositoryImpl$changePosition$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: r */
    public final InterfaceC7116c<List<Integer>> mo6123r(String str) {
        C5207g.m11111f(str, "nameWithLanguage");
        return C0062b.m273H0(this.f20199c.mo5224v0(str));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: s */
    public final Object mo6124s(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18496d = this.f20203g.m18496d(str, new Integer(i10), interfaceC9968c);
        return objM18496d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18496d : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c<C6698d> mo6125t(String str, int i10) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20199c.mo5220r0(str, i10));
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<List<C6697c>> mo6126u(CoursePlaylistSort coursePlaylistSort, int i10) {
        String str;
        C5207g.m11111f(coursePlaylistSort, "sort");
        PlaylistDao playlistDao = this.f20199c;
        playlistDao.getClass();
        int i11 = PlaylistDao.C3315a.f19381a[coursePlaylistSort.ordinal()];
        if (i11 != 1) {
            str = i11 != 2 ? "" : "AND LibraryCounter.isTaken = 1";
        } else {
            str = "AND (LibraryData.isCompleted = 1 OR LibraryCounter.progress = 100.0)";
        }
        return C0062b.m273H0(playlistDao.mo5219q0(new C7915a(C0009a.m23l(C0009a.m25n("\n        SELECT DISTINCT LibraryData.*, LibraryCounter.*\n        FROM LibraryData, LibraryCounter\n        INNER JOIN CoursesAndLessonsJoin ON LibraryData.id = CoursesAndLessonsJoin.contentId\n        AND CoursesAndLessonsJoin.contentId = LibraryCounter.id\n        WHERE CoursesAndLessonsJoin.pk = ", i10, "\n        AND LibraryData.collectionId = ", i10, "\n        AND LibraryData.type = 'content'\n        AND LibraryCounter.type = 'content'\n          "), str, "\n          ORDER BY courseOrder ASC\n          "))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: v */
    public final Object mo6127v(int i10, int i11, String str, String str2, String str3, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$addPlaylistCourse$1 playlistRepositoryImpl$addPlaylistCourse$1;
        int i12;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str4;
        String str5;
        int i13;
        String str6 = str2;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$addPlaylistCourse$1) {
            playlistRepositoryImpl$addPlaylistCourse$1 = (PlaylistRepositoryImpl$addPlaylistCourse$1) interfaceC9968c;
            int i14 = playlistRepositoryImpl$addPlaylistCourse$1.f20232l;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylistCourse$1.f20232l = i14 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylistCourse$1 = new PlaylistRepositoryImpl$addPlaylistCourse$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$addPlaylistCourse$1 = new PlaylistRepositoryImpl$addPlaylistCourse$1(this, interfaceC9968c);
        }
        Object obj = playlistRepositoryImpl$addPlaylistCourse$1.f20230j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = playlistRepositoryImpl$addPlaylistCourse$1.f20232l;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = playlistRepositoryImpl$addPlaylistCourse$1.f20229i;
                i13 = playlistRepositoryImpl$addPlaylistCourse$1.f20228h;
                str5 = playlistRepositoryImpl$addPlaylistCourse$1.f20227g;
                String str7 = playlistRepositoryImpl$addPlaylistCourse$1.f20226f;
                str4 = playlistRepositoryImpl$addPlaylistCourse$1.f20225e;
                playlistRepositoryImpl = playlistRepositoryImpl$addPlaylistCourse$1.f20224d;
                C7499b.m14977z0(obj);
                i12 = i16;
                str6 = str7;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistRepositoryImpl$addPlaylistCourse$1.f20224d = this;
        playlistRepositoryImpl$addPlaylistCourse$1.f20225e = str;
        playlistRepositoryImpl$addPlaylistCourse$1.f20226f = str6;
        playlistRepositoryImpl$addPlaylistCourse$1.f20227g = str3;
        playlistRepositoryImpl$addPlaylistCourse$1.f20228h = i10;
        i12 = i11;
        playlistRepositoryImpl$addPlaylistCourse$1.f20229i = i12;
        playlistRepositoryImpl$addPlaylistCourse$1.f20232l = 1;
        Object objMo5187A0 = this.f20199c.mo5187A0(str6, playlistRepositoryImpl$addPlaylistCourse$1);
        if (objMo5187A0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        str4 = str;
        obj = objMo5187A0;
        str5 = str3;
        i13 = i10;
        Integer num = (Integer) obj;
        Integer num2 = num == null ? new Integer(0) : new Integer(num.intValue() + 1);
        playlistRepositoryImpl.m9544M(i13, null, str4, str5, "add");
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(PlaylistAddCourseWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str4), new Pair("coursePk", Integer.valueOf(i12))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i17 = 0; i17 < 2; i17++) {
            Pair pair = pairArr[i17];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        playlistRepositoryImpl.f20208l.m4877b(aVar.m4879a());
        C8805s c8805s = new C8805s(i12, num2, str6, str4, true);
        playlistRepositoryImpl$addPlaylistCourse$1.f20224d = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f20225e = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f20226f = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f20227g = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f20232l = 2;
        if (playlistRepositoryImpl.f20199c.mo5204R0(c8805s, playlistRepositoryImpl$addPlaylistCourse$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: w */
    public final Object mo6128w(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$3 playlistRepositoryImpl$removePlaylistLesson$3;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$removePlaylistLesson$3) {
            playlistRepositoryImpl$removePlaylistLesson$3 = (PlaylistRepositoryImpl$removePlaylistLesson$3) interfaceC9968c;
            int i11 = playlistRepositoryImpl$removePlaylistLesson$3.f20347j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$3.f20347j = i11 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$3 = new PlaylistRepositoryImpl$removePlaylistLesson$3(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$3 = new PlaylistRepositoryImpl$removePlaylistLesson$3(this, interfaceC9968c);
        }
        PlaylistRepositoryImpl$removePlaylistLesson$3 playlistRepositoryImpl$removePlaylistLesson$4 = playlistRepositoryImpl$removePlaylistLesson$3;
        Object objMo5196J0 = playlistRepositoryImpl$removePlaylistLesson$4.f20345h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = playlistRepositoryImpl$removePlaylistLesson$4.f20347j;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = playlistRepositoryImpl$removePlaylistLesson$4.f20344g;
                str2 = playlistRepositoryImpl$removePlaylistLesson$4.f20343f;
                str = playlistRepositoryImpl$removePlaylistLesson$4.f20342e;
                playlistRepositoryImpl = playlistRepositoryImpl$removePlaylistLesson$4.f20341d;
                C7499b.m14977z0(objMo5196J0);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5196J0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5196J0);
        playlistRepositoryImpl$removePlaylistLesson$4.f20341d = this;
        playlistRepositoryImpl$removePlaylistLesson$4.f20342e = str;
        playlistRepositoryImpl$removePlaylistLesson$4.f20343f = str2;
        playlistRepositoryImpl$removePlaylistLesson$4.f20344g = i10;
        playlistRepositoryImpl$removePlaylistLesson$4.f20347j = 1;
        objMo5196J0 = this.f20199c.mo5196J0(i10, str, playlistRepositoryImpl$removePlaylistLesson$4);
        if (objMo5196J0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        int i13 = i10;
        String str3 = str2;
        UserPlaylist userPlaylist = (UserPlaylist) objMo5196J0;
        if (userPlaylist != null) {
            String str4 = userPlaylist.f22077a;
            Integer num = new Integer(userPlaylist.f22080d);
            playlistRepositoryImpl$removePlaylistLesson$4.f20341d = null;
            playlistRepositoryImpl$removePlaylistLesson$4.f20342e = null;
            playlistRepositoryImpl$removePlaylistLesson$4.f20343f = null;
            playlistRepositoryImpl$removePlaylistLesson$4.f20347j = 2;
            if (playlistRepositoryImpl.mo6104J(str, str4, str3, i13, num, playlistRepositoryImpl$removePlaylistLesson$4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: x */
    public final Object mo6129x(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10) {
        Object objMo5205S0 = this.f20199c.mo5205S0(new C8798l(i10, i11, str, z10), interfaceC9968c);
        return objMo5205S0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5205S0 : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: y */
    public final Object mo6130y(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return this.f20199c.mo5202P0(i10, str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2019l
    /* JADX INFO: renamed from: z */
    public final Object mo6131z(String str, RequestPlaylistCreate requestPlaylistCreate, Integer num, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistRepositoryImpl$networkAddPlaylist$1 playlistRepositoryImpl$networkAddPlaylist$1;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str3;
        PlaylistRepositoryImpl playlistRepositoryImpl2;
        String str4;
        ResultPlaylistFolder resultPlaylistFolder;
        if (interfaceC9968c instanceof PlaylistRepositoryImpl$networkAddPlaylist$1) {
            playlistRepositoryImpl$networkAddPlaylist$1 = (PlaylistRepositoryImpl$networkAddPlaylist$1) interfaceC9968c;
            int i10 = playlistRepositoryImpl$networkAddPlaylist$1.f20283k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$networkAddPlaylist$1.f20283k = i10 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$networkAddPlaylist$1 = new PlaylistRepositoryImpl$networkAddPlaylist$1(this, interfaceC9968c);
            }
        } else {
            playlistRepositoryImpl$networkAddPlaylist$1 = new PlaylistRepositoryImpl$networkAddPlaylist$1(this, interfaceC9968c);
        }
        PlaylistRepositoryImpl$networkAddPlaylist$1 playlistRepositoryImpl$networkAddPlaylist$2 = playlistRepositoryImpl$networkAddPlaylist$1;
        Object objM18494b = playlistRepositoryImpl$networkAddPlaylist$2.f20281i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = playlistRepositoryImpl$networkAddPlaylist$2.f20283k;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = playlistRepositoryImpl$networkAddPlaylist$2.f20279g;
                num = playlistRepositoryImpl$networkAddPlaylist$2.f20278f;
                str = playlistRepositoryImpl$networkAddPlaylist$2.f20277e;
                playlistRepositoryImpl = playlistRepositoryImpl$networkAddPlaylist$2.f20276d;
                C7499b.m14977z0(objM18494b);
            } else if (i11 == 2) {
                resultPlaylistFolder = playlistRepositoryImpl$networkAddPlaylist$2.f20280h;
                String str5 = playlistRepositoryImpl$networkAddPlaylist$2.f20279g;
                num = playlistRepositoryImpl$networkAddPlaylist$2.f20278f;
                String str6 = playlistRepositoryImpl$networkAddPlaylist$2.f20277e;
                playlistRepositoryImpl2 = playlistRepositoryImpl$networkAddPlaylist$2.f20276d;
                C7499b.m14977z0(objM18494b);
                str4 = str5;
                str3 = str6;
                if (num != null || str4 == null) {
                    return C9072e.f47360a;
                }
                String strM15498b = C7793a.m15498b(resultPlaylistFolder.f18888b, str3);
                int i12 = resultPlaylistFolder.f18887a;
                int iIntValue = num.intValue();
                playlistRepositoryImpl$networkAddPlaylist$2.f20276d = null;
                playlistRepositoryImpl$networkAddPlaylist$2.f20277e = null;
                playlistRepositoryImpl$networkAddPlaylist$2.f20278f = null;
                playlistRepositoryImpl$networkAddPlaylist$2.f20279g = null;
                playlistRepositoryImpl$networkAddPlaylist$2.f20280h = null;
                playlistRepositoryImpl$networkAddPlaylist$2.f20283k = 3;
                if (playlistRepositoryImpl2.mo6103I(i12, iIntValue, str3, strM15498b, str4, playlistRepositoryImpl$networkAddPlaylist$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18494b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18494b);
        playlistRepositoryImpl$networkAddPlaylist$2.f20276d = this;
        playlistRepositoryImpl$networkAddPlaylist$2.f20277e = str;
        playlistRepositoryImpl$networkAddPlaylist$2.f20278f = num;
        playlistRepositoryImpl$networkAddPlaylist$2.f20279g = str2;
        playlistRepositoryImpl$networkAddPlaylist$2.f20283k = 1;
        objM18494b = this.f20203g.m18494b(str, requestPlaylistCreate, playlistRepositoryImpl$networkAddPlaylist$2);
        if (objM18494b == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistRepositoryImpl = this;
        ResultPlaylistFolder resultPlaylistFolder2 = (ResultPlaylistFolder) objM18494b;
        PlaylistDao playlistDao = playlistRepositoryImpl.f20199c;
        String strM15498b2 = C7793a.m15498b(resultPlaylistFolder2.f18888b, str);
        playlistRepositoryImpl$networkAddPlaylist$2.f20276d = playlistRepositoryImpl;
        playlistRepositoryImpl$networkAddPlaylist$2.f20277e = str;
        playlistRepositoryImpl$networkAddPlaylist$2.f20278f = num;
        playlistRepositoryImpl$networkAddPlaylist$2.f20279g = str2;
        playlistRepositoryImpl$networkAddPlaylist$2.f20280h = resultPlaylistFolder2;
        playlistRepositoryImpl$networkAddPlaylist$2.f20283k = 2;
        if (playlistDao.mo5211Y0(resultPlaylistFolder2.f18887a, strM15498b2, playlistRepositoryImpl$networkAddPlaylist$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = str;
        playlistRepositoryImpl2 = playlistRepositoryImpl;
        str4 = str2;
        resultPlaylistFolder = resultPlaylistFolder2;
        if (num != null) {
        }
        return C9072e.f47360a;
    }
}
