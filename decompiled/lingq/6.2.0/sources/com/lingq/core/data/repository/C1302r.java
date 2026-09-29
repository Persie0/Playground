package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.workers.AddPlaylistWorker;
import com.lingq.core.data.workers.PlaylistAddCourseWorker;
import com.lingq.core.data.workers.PlaylistDeleteWorker;
import com.lingq.core.data.workers.PlaylistLessonActionWorker;
import com.lingq.core.data.workers.PlaylistUpdateWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.network.api.requests.RequestPlaylistCreate;
import com.lingq.core.network.api.result.ResultPlaylist;
import com.lingq.core.network.api.result.ResultPlaylistFolder;
import com.lingq.core.network.api.result.Results;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bd7;
import p000.c83;
import p000.ca5;
import p000.df4;
import p000.ed7;
import p000.fa4;
import p000.h0a;
import p000.h85;
import p000.hd7;
import p000.hi8;
import p000.hm5;
import p000.io1;
import p000.jj2;
import p000.kk8;
import p000.ld0;
import p000.lj2;
import p000.lz5;
import p000.m05;
import p000.mv0;
import p000.nm7;
import p000.ql4;
import p000.qm7;
import p000.rm5;
import p000.ry4;
import p000.se7;
import p000.sm5;
import p000.sp0;
import p000.sx4;
import p000.tx6;
import p000.u85;
import p000.um5;
import p000.ux6;
import p000.v91;
import p000.vk9;
import p000.vma;
import p000.vz1;
import p000.wz0;
import p000.x27;
import p000.xd7;
import p000.xfa;
import p000.xj1;
import p000.xm5;
import p000.zj6;

/* JADX INFO: renamed from: com.lingq.core.data.repository.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1302r implements xd7 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16532a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1320h f16533b;

    /* JADX INFO: renamed from: c */
    public final C1322j f16534c;

    /* JADX INFO: renamed from: d */
    public final io1 f16535d;

    /* JADX INFO: renamed from: e */
    public final C1321i f16536e;

    /* JADX INFO: renamed from: f */
    public final se7 f16537f;

    /* JADX INFO: renamed from: g */
    public final ca5 f16538g;

    /* JADX INFO: renamed from: h */
    public final nm7 f16539h;

    /* JADX INFO: renamed from: i */
    public final vma f16540i;

    /* JADX INFO: renamed from: j */
    public final lj2 f16541j;

    /* JADX INFO: renamed from: k */
    public final hm5 f16542k;

    /* JADX INFO: renamed from: l */
    public final C0773b f16543l;

    public C1302r(LingQDatabase lingQDatabase, AbstractC1320h abstractC1320h, C1322j c1322j, io1 io1Var, x27 x27Var, C1321i c1321i, se7 se7Var, ca5 ca5Var, nm7 nm7Var, vma vmaVar, lj2 lj2Var, hm5 hm5Var, C0773b c0773b, df4 df4Var) {
        lingQDatabase.getClass();
        abstractC1320h.getClass();
        c1322j.getClass();
        io1Var.getClass();
        x27Var.getClass();
        c1321i.getClass();
        se7Var.getClass();
        ca5Var.getClass();
        nm7Var.getClass();
        vmaVar.getClass();
        lj2Var.getClass();
        hm5Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        this.f16532a = lingQDatabase;
        this.f16533b = abstractC1320h;
        this.f16534c = c1322j;
        this.f16535d = io1Var;
        this.f16536e = c1321i;
        this.f16537f = se7Var;
        this.f16538g = ca5Var;
        this.f16539h = nm7Var;
        this.f16540i = vmaVar;
        this.f16541j = lj2Var;
        this.f16542k = hm5Var;
        this.f16543l = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static final Object m7339b(C1302r c1302r, String str, int i, boolean z, int i2, int i3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$updatePlaylistLessonPosition$1 playlistRepositoryImpl$updatePlaylistLessonPosition$1;
        u85 u85Var;
        String str2;
        int i4;
        int i5;
        String str3;
        String str4;
        u85 u85Var2;
        String str5;
        LessonEntity lessonEntity;
        String str6;
        int i6;
        int i7;
        String str7;
        String strM7722w0;
        u85 u85Var3;
        String str8;
        String str9 = str;
        int i8 = i;
        boolean z2 = z;
        int i9 = i2;
        int i10 = i3;
        C1321i c1321i = c1302r.f16536e;
        if (continuationImpl instanceof PlaylistRepositoryImpl$updatePlaylistLessonPosition$1) {
            playlistRepositoryImpl$updatePlaylistLessonPosition$1 = (PlaylistRepositoryImpl$updatePlaylistLessonPosition$1) continuationImpl;
            int i11 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = i11 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$updatePlaylistLessonPosition$1 = new PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(c1302r, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$updatePlaylistLessonPosition$1 = new PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(c1302r, continuationImpl);
        }
        Object objMo7500z0 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16068f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h;
        if (i12 == 0) {
            AbstractC3193b.m15359b(objMo7500z0);
            if (z2) {
                io1 io1Var = c1302r.f16535d;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str9;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i10;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 1;
                objMo7500z0 = io1Var.m14048y0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                if (objMo7500z0 != coroutineSingletons) {
                    u85Var = (u85) objMo7500z0;
                    if (u85Var == null) {
                        str4 = u85Var.f63567f;
                        if (str4 != null) {
                            c1302r.m7350j(i10, new Integer(i9), str9, str4, "upd");
                        }
                    } else {
                        int i13 = i10;
                        str2 = str9;
                        i4 = i13;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str2;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i4;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 2;
                        objMo7500z0 = c1321i.m7505C0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                        if (objMo7500z0 != coroutineSingletons) {
                            i5 = i9;
                            str3 = str2;
                            u85Var2 = (u85) objMo7500z0;
                            if (u85Var2 != null) {
                                c1302r.m7350j(i4, new Integer(i5), str3, str5, "upd");
                            }
                        }
                    }
                }
            } else {
                AbstractC1320h abstractC1320h = c1302r.f16533b;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str9;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i10;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 3;
                objMo7500z0 = abstractC1320h.mo7500z0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                if (objMo7500z0 != coroutineSingletons) {
                    lessonEntity = (LessonEntity) objMo7500z0;
                    if (lessonEntity == null) {
                        strM7722w0 = lessonEntity.m7722w0();
                        if (strM7722w0 != null) {
                            c1302r.m7350j(i10, new Integer(i9), str9, strM7722w0, "upd");
                        }
                    } else {
                        int i14 = i10;
                        str6 = str9;
                        i6 = i14;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str6;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i6;
                        playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 4;
                        objMo7500z0 = c1321i.m7505C0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                        if (objMo7500z0 != coroutineSingletons) {
                            i7 = i9;
                            str7 = str6;
                            u85Var3 = (u85) objMo7500z0;
                            if (u85Var3 != null) {
                                c1302r.m7350j(i6, new Integer(i7), str7, str8, "upd");
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i12 == 1) {
            int i15 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d;
            int i16 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c;
            z2 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e;
            int i17 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b;
            String str10 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a;
            AbstractC3193b.m15359b(objMo7500z0);
            i10 = i15;
            str9 = str10;
            i9 = i16;
            i8 = i17;
            u85Var = (u85) objMo7500z0;
            if (u85Var == null) {
                int i18 = i10;
                str2 = str9;
                i4 = i18;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str2;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i4;
                playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 2;
                objMo7500z0 = c1321i.m7505C0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                if (objMo7500z0 != coroutineSingletons) {
                    i5 = i9;
                    str3 = str2;
                }
                return coroutineSingletons;
            }
            str4 = u85Var.f63567f;
            if (str4 != null) {
                c1302r.m7350j(i10, new Integer(i9), str9, str4, "upd");
            }
        } else if (i12 != 2) {
            if (i12 == 3) {
                int i19 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d;
                int i20 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c;
                z2 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e;
                int i21 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b;
                String str11 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a;
                AbstractC3193b.m15359b(objMo7500z0);
                i10 = i19;
                str9 = str11;
                i9 = i20;
                i8 = i21;
                lessonEntity = (LessonEntity) objMo7500z0;
                if (lessonEntity == null) {
                    int i110 = i10;
                    str6 = str9;
                    i6 = i110;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a = str6;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16064b = i8;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16067e = z2;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c = i9;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d = i6;
                    playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16070h = 4;
                    objMo7500z0 = c1321i.m7505C0(i8, playlistRepositoryImpl$updatePlaylistLessonPosition$1);
                    if (objMo7500z0 != coroutineSingletons) {
                        i7 = i9;
                        str7 = str6;
                    }
                    return coroutineSingletons;
                }
                strM7722w0 = lessonEntity.m7722w0();
                if (strM7722w0 != null) {
                    c1302r.m7350j(i10, new Integer(i9), str9, strM7722w0, "upd");
                }
            } else {
                if (i12 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d;
                i7 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c;
                str7 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a;
                AbstractC3193b.m15359b(objMo7500z0);
            }
            u85Var3 = (u85) objMo7500z0;
            if (u85Var3 != null && (str8 = u85Var3.f63567f) != null) {
                c1302r.m7350j(i6, new Integer(i7), str7, str8, "upd");
            }
        } else {
            i4 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16066d;
            i5 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16065c;
            str3 = playlistRepositoryImpl$updatePlaylistLessonPosition$1.f16063a;
            AbstractC3193b.m15359b(objMo7500z0);
        }
        u85Var2 = (u85) objMo7500z0;
        if (u85Var2 != null && (str5 = u85Var2.f63567f) != null) {
            c1302r.m7350j(i4, new Integer(i5), str3, str5, "upd");
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: A */
    public final Object m7340A(int i, int i2, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        int i3;
        boolean zM11650l = fa4.m11650l(str2, "completed");
        if (fa4.m11650l(str2, "downloading")) {
            i3 = i2;
        } else {
            i3 = zM11650l ? 100 : 0;
        }
        sx4 sx4Var = new sx4(i, str, zM11650l, i3, str2, str3, System.currentTimeMillis());
        C1322j c1322j = this.f16534c;
        Object objM2861d = AbstractC0758a.m2861d(new h85(23, c1322j, sx4Var), c1322j.f17045K, continuationImpl, false, true);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objM2861d != coroutineSingletons) {
            objM2861d = xfaVar;
        }
        return objM2861d == coroutineSingletons ? objM2861d : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (m7351k(r13, r11, r12, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7341B(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$updatePlaylist$1 playlistRepositoryImpl$updatePlaylist$1;
        String str4;
        String str5;
        PlaylistEntity playlistEntity;
        if (continuationImpl instanceof PlaylistRepositoryImpl$updatePlaylist$1) {
            playlistRepositoryImpl$updatePlaylist$1 = (PlaylistRepositoryImpl$updatePlaylist$1) continuationImpl;
            int i = playlistRepositoryImpl$updatePlaylist$1.f16062h;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$updatePlaylist$1.f16062h = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$updatePlaylist$1 = new PlaylistRepositoryImpl$updatePlaylist$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$updatePlaylist$1 = new PlaylistRepositoryImpl$updatePlaylist$1(this, continuationImpl);
        }
        Object objM2861d = playlistRepositoryImpl$updatePlaylist$1.f16060f;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$updatePlaylist$1.f16062h;
        int i3 = 0;
        C1322j c1322j = this.f16534c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            playlistRepositoryImpl$updatePlaylist$1.f16055a = str;
            playlistRepositoryImpl$updatePlaylist$1.f16056b = str2;
            playlistRepositoryImpl$updatePlaylist$1.f16057c = str3;
            playlistRepositoryImpl$updatePlaylist$1.f16062h = 1;
            objM2861d = AbstractC0758a.m2861d(new ql4(str2, 13), c1322j.f17045K, playlistRepositoryImpl$updatePlaylist$1, true, false);
            if (objM2861d != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = playlistRepositoryImpl$updatePlaylist$1.f16057c;
            str2 = playlistRepositoryImpl$updatePlaylist$1.f16056b;
            str = playlistRepositoryImpl$updatePlaylist$1.f16055a;
            AbstractC3193b.m15359b(objM2861d);
        } else if (i2 == 2) {
            i3 = playlistRepositoryImpl$updatePlaylist$1.f16059e;
            playlistEntity = playlistRepositoryImpl$updatePlaylist$1.f16058d;
            str4 = playlistRepositoryImpl$updatePlaylist$1.f16057c;
            str5 = playlistRepositoryImpl$updatePlaylist$1.f16055a;
            AbstractC3193b.m15359b(objM2861d);
            String strValueOf = String.valueOf(playlistEntity.m7795e());
            playlistRepositoryImpl$updatePlaylist$1.f16055a = null;
            playlistRepositoryImpl$updatePlaylist$1.f16056b = null;
            playlistRepositoryImpl$updatePlaylist$1.f16057c = null;
            playlistRepositoryImpl$updatePlaylist$1.f16058d = null;
            playlistRepositoryImpl$updatePlaylist$1.f16059e = i3;
            playlistRepositoryImpl$updatePlaylist$1.f16062h = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        return xfa.f68157a;
        PlaylistEntity playlistEntity2 = (PlaylistEntity) objM2861d;
        if (playlistEntity2 != null) {
            String strM23629f = vz1.m23629f(str3, str);
            playlistRepositoryImpl$updatePlaylist$1.f16055a = str;
            playlistRepositoryImpl$updatePlaylist$1.f16056b = null;
            playlistRepositoryImpl$updatePlaylist$1.f16057c = str3;
            playlistRepositoryImpl$updatePlaylist$1.f16058d = playlistEntity2;
            playlistRepositoryImpl$updatePlaylist$1.f16059e = 0;
            playlistRepositoryImpl$updatePlaylist$1.f16062h = 2;
            if (c1322j.m7515z0(strM23629f, str2, str3, playlistRepositoryImpl$updatePlaylist$1) != obj) {
                str4 = str3;
                str5 = str;
                playlistEntity = playlistEntity2;
                String strValueOf2 = String.valueOf(playlistEntity.m7795e());
                playlistRepositoryImpl$updatePlaylist$1.f16055a = null;
                playlistRepositoryImpl$updatePlaylist$1.f16056b = null;
                playlistRepositoryImpl$updatePlaylist$1.f16057c = null;
                playlistRepositoryImpl$updatePlaylist$1.f16058d = null;
                playlistRepositoryImpl$updatePlaylist$1.f16059e = i3;
                playlistRepositoryImpl$updatePlaylist$1.f16062h = 3;
            }
            return obj;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[LOOP:1: B:46:0x00ee->B:48:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:54:0x013b->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r13 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
    
        if (r4.m7514y0(r10, r0) == r1) goto L61;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7342C(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$updatePlaylistsForLesson$1 playlistRepositoryImpl$updatePlaylistsForLesson$1;
        LessonEntity lessonEntity;
        List listM7707p;
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        ArrayList arrayList2;
        Iterator it;
        String str3;
        Iterator it2;
        String str4;
        int i4;
        int i5;
        int iM8118c;
        String strM8117b;
        if (continuationImpl instanceof PlaylistRepositoryImpl$updatePlaylistsForLesson$1) {
            playlistRepositoryImpl$updatePlaylistsForLesson$1 = (PlaylistRepositoryImpl$updatePlaylistsForLesson$1) continuationImpl;
            int i6 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = i6 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$updatePlaylistsForLesson$1 = new PlaylistRepositoryImpl$updatePlaylistsForLesson$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$updatePlaylistsForLesson$1 = new PlaylistRepositoryImpl$updatePlaylistsForLesson$1(this, continuationImpl);
        }
        Object objMo7500z0 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16077g;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i;
        int i8 = 2;
        C1322j c1322j = this.f16534c;
        int i9 = 0;
        switch (i7) {
            case 0:
                AbstractC3193b.m15359b(objMo7500z0);
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 1;
                objMo7500z0 = this.f16533b.mo7500z0(i, playlistRepositoryImpl$updatePlaylistsForLesson$1);
                if (objMo7500z0 != obj) {
                    lessonEntity = (LessonEntity) objMo7500z0;
                    if (lessonEntity == null && (listM7707p = lessonEntity.m7707p()) != null) {
                        if (listM7707p != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : listM7707p) {
                                if (!vk9.m23391n0((String) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                List listM23604J = vz1.m23604J(new Integer(i));
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = null;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = 0;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 6;
                                break;
                            } else {
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = arrayList;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = 0;
                                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 3;
                                if (m7354n(str, playlistRepositoryImpl$updatePlaylistsForLesson$1) != obj) {
                                    str2 = str;
                                    i2 = i;
                                    i3 = 0;
                                    arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        AbstractC3393o1.m17749x(Integer.parseInt((String) it.next()), arrayList2);
                                    }
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str2;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i2;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i3;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 4;
                                    c1322j.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE pk IN (");
                                    objMo7500z0 = AbstractC0758a.m2861d(new m05(i8, AbstractC3393o1.m17736k("))", sb, arrayList2), arrayList2), c1322j.f17045K, playlistRepositoryImpl$updatePlaylistsForLesson$1, true, false);
                                    if (objMo7500z0 != obj) {
                                        str3 = str2;
                                        it2 = ((List) objMo7500z0).iterator();
                                        str4 = str3;
                                        i4 = i2;
                                        i5 = i3;
                                        while (it2.hasNext()) {
                                            Playlist playlist = (Playlist) it2.next();
                                            iM8118c = playlist.m8118c();
                                            strM8117b = playlist.m8117b();
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str4;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c = it2;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i4;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i5;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f = i9;
                                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 5;
                                            if (m7353m(iM8118c, str4, strM8117b, playlistRepositoryImpl$updatePlaylistsForLesson$1) == obj) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 2;
                    objMo7500z0 = this.f16536e.m7505C0(i, playlistRepositoryImpl$updatePlaylistsForLesson$1);
                    break;
                }
                return obj;
            case 1:
                i = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d;
                str = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a;
                AbstractC3193b.m15359b(objMo7500z0);
                lessonEntity = (LessonEntity) objMo7500z0;
                if (lessonEntity == null) {
                }
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 2;
                objMo7500z0 = this.f16536e.m7505C0(i, playlistRepositoryImpl$updatePlaylistsForLesson$1);
                break;
            case 2:
                i = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d;
                str = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a;
                AbstractC3193b.m15359b(objMo7500z0);
                u85 u85Var = (u85) objMo7500z0;
                listM7707p = u85Var != null ? u85Var.f63546H : null;
                if (listM7707p != null) {
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (!vk9.m23391n0((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        List listM23604J2 = vz1.m23604J(new Integer(i));
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = null;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = 0;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 6;
                        break;
                    } else {
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = arrayList;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = 0;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 3;
                        if (m7354n(str, playlistRepositoryImpl$updatePlaylistsForLesson$1) != obj) {
                            str2 = str;
                            i2 = i;
                            i3 = 0;
                            arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                AbstractC3393o1.m17749x(Integer.parseInt((String) it.next()), arrayList2);
                            }
                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str2;
                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i2;
                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i3;
                            playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 4;
                            c1322j.getClass();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE pk IN (");
                            objMo7500z0 = AbstractC0758a.m2861d(new m05(i8, AbstractC3393o1.m17736k("))", sb2, arrayList2), arrayList2), c1322j.f17045K, playlistRepositoryImpl$updatePlaylistsForLesson$1, true, false);
                            if (objMo7500z0 != obj) {
                                str3 = str2;
                                it2 = ((List) objMo7500z0).iterator();
                                str4 = str3;
                                i4 = i2;
                                i5 = i3;
                                while (it2.hasNext()) {
                                    Playlist playlist2 = (Playlist) it2.next();
                                    iM8118c = playlist2.m8118c();
                                    strM8117b = playlist2.m8117b();
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str4;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c = it2;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i4;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i5;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f = i9;
                                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 5;
                                    if (m7353m(iM8118c, str4, strM8117b, playlistRepositoryImpl$updatePlaylistsForLesson$1) == obj) {
                                    }
                                }
                            }
                        }
                    }
                    return obj;
                }
                return xfa.f68157a;
            case 3:
                i3 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e;
                i2 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d;
                arrayList = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b;
                str2 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a;
                AbstractC3193b.m15359b(objMo7500z0);
                arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(Integer.parseInt((String) it.next()), arrayList2);
                }
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str2;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i2;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i3;
                playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 4;
                c1322j.getClass();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE pk IN (");
                objMo7500z0 = AbstractC0758a.m2861d(new m05(i8, AbstractC3393o1.m17736k("))", sb3, arrayList2), arrayList2), c1322j.f17045K, playlistRepositoryImpl$updatePlaylistsForLesson$1, true, false);
                if (objMo7500z0 != obj) {
                    str3 = str2;
                    it2 = ((List) objMo7500z0).iterator();
                    str4 = str3;
                    i4 = i2;
                    i5 = i3;
                    while (it2.hasNext()) {
                        Playlist playlist3 = (Playlist) it2.next();
                        iM8118c = playlist3.m8118c();
                        strM8117b = playlist3.m8117b();
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str4;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c = it2;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i4;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i5;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f = i9;
                        playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 5;
                        if (m7353m(iM8118c, str4, strM8117b, playlistRepositoryImpl$updatePlaylistsForLesson$1) == obj) {
                        }
                    }
                    return xfa.f68157a;
                }
                return obj;
            case 4:
                i3 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e;
                i2 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d;
                str3 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a;
                AbstractC3193b.m15359b(objMo7500z0);
                it2 = ((List) objMo7500z0).iterator();
                str4 = str3;
                i4 = i2;
                i5 = i3;
                while (it2.hasNext()) {
                    Playlist playlist4 = (Playlist) it2.next();
                    iM8118c = playlist4.m8118c();
                    strM8117b = playlist4.m8117b();
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str4;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c = it2;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i4;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i5;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f = i9;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 5;
                    if (m7353m(iM8118c, str4, strM8117b, playlistRepositoryImpl$updatePlaylistsForLesson$1) == obj) {
                        return obj;
                    }
                }
                return xfa.f68157a;
            case 5:
                int i10 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f;
                i5 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e;
                i4 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d;
                it2 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c;
                str4 = playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a;
                AbstractC3193b.m15359b(objMo7500z0);
                i9 = i10;
                while (it2.hasNext()) {
                    Playlist playlist5 = (Playlist) it2.next();
                    iM8118c = playlist5.m8118c();
                    strM8117b = playlist5.m8117b();
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16071a = str4;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16072b = null;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16073c = it2;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16074d = i4;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16075e = i5;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16076f = i9;
                    playlistRepositoryImpl$updatePlaylistsForLesson$1.f16079i = 5;
                    if (m7353m(iM8118c, str4, strM8117b, playlistRepositoryImpl$updatePlaylistsForLesson$1) == obj) {
                        return obj;
                    }
                }
                return xfa.f68157a;
            case 6:
                AbstractC3193b.m15359b(objMo7500z0);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (m7349i(r1, r2, r3, r4, r5) == r6) goto L32;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7343c(String str, String str2, Integer num, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$addPlaylist$1 playlistRepositoryImpl$addPlaylist$1;
        Integer num2;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num3;
        String str8;
        String str9;
        if (continuationImpl instanceof PlaylistRepositoryImpl$addPlaylist$1) {
            playlistRepositoryImpl$addPlaylist$1 = (PlaylistRepositoryImpl$addPlaylist$1) continuationImpl;
            int i = playlistRepositoryImpl$addPlaylist$1.f15877g;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylist$1.f15877g = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylist$1 = new PlaylistRepositoryImpl$addPlaylist$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$addPlaylist$1 = new PlaylistRepositoryImpl$addPlaylist$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$addPlaylist$1 playlistRepositoryImpl$addPlaylist$2 = playlistRepositoryImpl$addPlaylist$1;
        Object obj = playlistRepositoryImpl$addPlaylist$2.f15875e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$addPlaylist$2.f15877g;
        C1322j c1322j = this.f16534c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistRepositoryImpl$addPlaylist$2.f15871a = str;
            playlistRepositoryImpl$addPlaylist$2.f15872b = str2;
            num2 = num;
            playlistRepositoryImpl$addPlaylist$2.f15873c = num2;
            playlistRepositoryImpl$addPlaylist$2.f15874d = str3;
            playlistRepositoryImpl$addPlaylist$2.f15877g = 1;
            Object objM2861d = AbstractC0758a.m2861d(new lz5(24), c1322j.f17045K, playlistRepositoryImpl$addPlaylist$2, true, false);
            if (objM2861d != obj2) {
                str4 = str;
                obj = objM2861d;
                str5 = str2;
                str6 = str3;
            }
            return obj2;
        }
        if (i2 == 1) {
            str6 = playlistRepositoryImpl$addPlaylist$2.f15874d;
            num2 = playlistRepositoryImpl$addPlaylist$2.f15873c;
            str5 = playlistRepositoryImpl$addPlaylist$2.f15872b;
            str4 = playlistRepositoryImpl$addPlaylist$2.f15871a;
            AbstractC3193b.m15359b(obj);
        } else if (i2 == 2) {
            String str10 = playlistRepositoryImpl$addPlaylist$2.f15874d;
            num3 = playlistRepositoryImpl$addPlaylist$2.f15873c;
            String str11 = playlistRepositoryImpl$addPlaylist$2.f15872b;
            String str12 = playlistRepositoryImpl$addPlaylist$2.f15871a;
            AbstractC3193b.m15359b(obj);
            str7 = str10;
            str8 = str11;
            str9 = str12;
            playlistRepositoryImpl$addPlaylist$2.f15871a = null;
            playlistRepositoryImpl$addPlaylist$2.f15872b = null;
            playlistRepositoryImpl$addPlaylist$2.f15873c = null;
            playlistRepositoryImpl$addPlaylist$2.f15874d = null;
            playlistRepositoryImpl$addPlaylist$2.f15877g = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        Integer num4 = (Integer) obj;
        PlaylistEntity playlistEntity = new PlaylistEntity(vz1.m23629f(str5, str4), (num4 != null ? num4.intValue() : 0) + 1, str4, str5);
        playlistRepositoryImpl$addPlaylist$2.f15871a = str4;
        playlistRepositoryImpl$addPlaylist$2.f15872b = str5;
        playlistRepositoryImpl$addPlaylist$2.f15873c = num2;
        playlistRepositoryImpl$addPlaylist$2.f15874d = str6;
        playlistRepositoryImpl$addPlaylist$2.f15877g = 2;
        if (c1322j.mo4095v0(playlistEntity, playlistRepositoryImpl$addPlaylist$2) != obj2) {
            str7 = str6;
            num3 = num2;
            str8 = str5;
            str9 = str4;
            playlistRepositoryImpl$addPlaylist$2.f15871a = null;
            playlistRepositoryImpl$addPlaylist$2.f15872b = null;
            playlistRepositoryImpl$addPlaylist$2.f15873c = null;
            playlistRepositoryImpl$addPlaylist$2.f15874d = null;
            playlistRepositoryImpl$addPlaylist$2.f15877g = 3;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m7344d(int i, int i2, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$addPlaylistCourse$1 playlistRepositoryImpl$addPlaylistCourse$1;
        String str4;
        int i3;
        int i4;
        String str5;
        String str6 = str2;
        if (continuationImpl instanceof PlaylistRepositoryImpl$addPlaylistCourse$1) {
            playlistRepositoryImpl$addPlaylistCourse$1 = (PlaylistRepositoryImpl$addPlaylistCourse$1) continuationImpl;
            int i5 = playlistRepositoryImpl$addPlaylistCourse$1.f15885h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylistCourse$1.f15885h = i5 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylistCourse$1 = new PlaylistRepositoryImpl$addPlaylistCourse$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$addPlaylistCourse$1 = new PlaylistRepositoryImpl$addPlaylistCourse$1(this, continuationImpl);
        }
        Object obj = playlistRepositoryImpl$addPlaylistCourse$1.f15883f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = playlistRepositoryImpl$addPlaylistCourse$1.f15885h;
        xfa xfaVar = xfa.f68157a;
        C1322j c1322j = this.f16534c;
        if (i6 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistRepositoryImpl$addPlaylistCourse$1.f15878a = str;
            playlistRepositoryImpl$addPlaylistCourse$1.f15879b = str6;
            str4 = str3;
            playlistRepositoryImpl$addPlaylistCourse$1.f15880c = str4;
            i3 = i;
            playlistRepositoryImpl$addPlaylistCourse$1.f15881d = i3;
            i4 = i2;
            playlistRepositoryImpl$addPlaylistCourse$1.f15882e = i4;
            playlistRepositoryImpl$addPlaylistCourse$1.f15885h = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ql4(str6, 18), c1322j.f17045K, playlistRepositoryImpl$addPlaylistCourse$1, true, false);
            if (objM2861d != coroutineSingletons) {
                str5 = str;
                obj = objM2861d;
            }
        }
        if (i6 == 1) {
            int i7 = playlistRepositoryImpl$addPlaylistCourse$1.f15882e;
            int i8 = playlistRepositoryImpl$addPlaylistCourse$1.f15881d;
            String str7 = playlistRepositoryImpl$addPlaylistCourse$1.f15880c;
            String str8 = playlistRepositoryImpl$addPlaylistCourse$1.f15879b;
            str5 = playlistRepositoryImpl$addPlaylistCourse$1.f15878a;
            AbstractC3193b.m15359b(obj);
            i4 = i7;
            str6 = str8;
            i3 = i8;
            str4 = str7;
        } else {
            if (i6 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Integer num = (Integer) obj;
        Integer num2 = num == null ? new Integer(0) : new Integer(num.intValue() + 1);
        m7350j(i3, null, str5, str4, "add");
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(PlaylistAddCourseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str5), new Pair("coursePk", Integer.valueOf(i4))};
        hi8 hi8Var = new hi8(10);
        for (int i9 = 0; i9 < 2; i9++) {
            Pair pair = pairArr[i9];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16543l.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        bd7 bd7Var = new bd7(i4, num2, str6, str5, true);
        playlistRepositoryImpl$addPlaylistCourse$1.f15878a = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f15879b = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f15880c = null;
        playlistRepositoryImpl$addPlaylistCourse$1.f15881d = i3;
        playlistRepositoryImpl$addPlaylistCourse$1.f15882e = i4;
        playlistRepositoryImpl$addPlaylistCourse$1.f15885h = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new h85(25, c1322j, bd7Var), c1322j.f17045K, playlistRepositoryImpl$addPlaylistCourse$1, false, true);
        if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (androidx.room.AbstractC0747e.m2849b(r16.f16532a, r0, r7) == r8) goto L27;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7345e(int i, int i2, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$addPlaylistLesson$1 playlistRepositoryImpl$addPlaylistLesson$1;
        int i3;
        String str4;
        String str5;
        int i4;
        String str6 = str2;
        if (continuationImpl instanceof PlaylistRepositoryImpl$addPlaylistLesson$1) {
            playlistRepositoryImpl$addPlaylistLesson$1 = (PlaylistRepositoryImpl$addPlaylistLesson$1) continuationImpl;
            int i5 = playlistRepositoryImpl$addPlaylistLesson$1.f15893h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$addPlaylistLesson$1.f15893h = i5 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$addPlaylistLesson$1 = new PlaylistRepositoryImpl$addPlaylistLesson$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$addPlaylistLesson$1 = new PlaylistRepositoryImpl$addPlaylistLesson$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$addPlaylistLesson$1 playlistRepositoryImpl$addPlaylistLesson$2 = playlistRepositoryImpl$addPlaylistLesson$1;
        Object obj = playlistRepositoryImpl$addPlaylistLesson$2.f15891f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = playlistRepositoryImpl$addPlaylistLesson$2.f15893h;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = playlistRepositoryImpl$addPlaylistLesson$2.f15890e;
                i4 = playlistRepositoryImpl$addPlaylistLesson$2.f15889d;
                str5 = playlistRepositoryImpl$addPlaylistLesson$2.f15888c;
                String str7 = playlistRepositoryImpl$addPlaylistLesson$2.f15887b;
                str4 = playlistRepositoryImpl$addPlaylistLesson$2.f15886a;
                AbstractC3193b.m15359b(obj);
                i3 = i7;
                str6 = str7;
            } else {
                if (i6 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        playlistRepositoryImpl$addPlaylistLesson$2.f15886a = str;
        playlistRepositoryImpl$addPlaylistLesson$2.f15887b = str6;
        playlistRepositoryImpl$addPlaylistLesson$2.f15888c = str3;
        playlistRepositoryImpl$addPlaylistLesson$2.f15889d = i;
        i3 = i2;
        playlistRepositoryImpl$addPlaylistLesson$2.f15890e = i3;
        playlistRepositoryImpl$addPlaylistLesson$2.f15893h = 1;
        Object objM2861d = AbstractC0758a.m2861d(new ql4(str6, 18), this.f16534c.f17045K, playlistRepositoryImpl$addPlaylistLesson$2, true, false);
        if (objM2861d != coroutineSingletons) {
            str4 = str;
            obj = objM2861d;
            str5 = str3;
            i4 = i;
        }
        return coroutineSingletons;
        Integer num = (Integer) obj;
        Integer num2 = num == null ? new Integer(0) : new Integer(num.intValue() + 1);
        String str8 = str4;
        m7350j(i4, null, str8, str5, "add");
        int i8 = i3;
        PlaylistRepositoryImpl$addPlaylistLesson$2 playlistRepositoryImpl$addPlaylistLesson$3 = new PlaylistRepositoryImpl$addPlaylistLesson$2(this, new bd7(i8, num2, str6, str8, false), i4, i8, str8, null);
        playlistRepositoryImpl$addPlaylistLesson$2.f15886a = null;
        playlistRepositoryImpl$addPlaylistLesson$2.f15887b = null;
        playlistRepositoryImpl$addPlaylistLesson$2.f15888c = null;
        playlistRepositoryImpl$addPlaylistLesson$2.f15889d = i4;
        playlistRepositoryImpl$addPlaylistLesson$2.f15890e = i8;
        playlistRepositoryImpl$addPlaylistLesson$2.f15893h = 2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: f */
    public final Object m7346f(int i, int i2, int i3, int i4, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$changePosition$1 playlistRepositoryImpl$changePosition$1;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        String str4;
        String str5;
        int i9;
        int i10;
        bd7 bd7Var;
        int i11;
        bd7 bd7Var2;
        int i12;
        int iIntValue;
        Integer numM3649d;
        int i13 = i4;
        String str6 = str2;
        if (continuationImpl instanceof PlaylistRepositoryImpl$changePosition$1) {
            playlistRepositoryImpl$changePosition$1 = (PlaylistRepositoryImpl$changePosition$1) continuationImpl;
            int i14 = playlistRepositoryImpl$changePosition$1.f15910k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$changePosition$1.f15910k = i14 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$changePosition$1 = new PlaylistRepositoryImpl$changePosition$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$changePosition$1 = new PlaylistRepositoryImpl$changePosition$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$changePosition$1 playlistRepositoryImpl$changePosition$2 = playlistRepositoryImpl$changePosition$1;
        Object obj = playlistRepositoryImpl$changePosition$2.f15908i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = playlistRepositoryImpl$changePosition$2.f15910k;
        xfa xfaVar = xfa.f68157a;
        C1322j c1322j = this.f16534c;
        if (i15 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistRepositoryImpl$changePosition$2.f15900a = str;
            playlistRepositoryImpl$changePosition$2.f15901b = str6;
            playlistRepositoryImpl$changePosition$2.f15903d = i;
            playlistRepositoryImpl$changePosition$2.f15904e = i2;
            i5 = i3;
            playlistRepositoryImpl$changePosition$2.f15905f = i5;
            playlistRepositoryImpl$changePosition$2.f15906g = i13;
            playlistRepositoryImpl$changePosition$2.f15910k = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ld0(i13, str6, 18), c1322j.f17045K, playlistRepositoryImpl$changePosition$2, true, true);
            if (objM2861d != coroutineSingletons) {
                str3 = str;
                obj = objM2861d;
                i6 = i;
                i7 = i2;
            }
        }
        if (i15 == 1) {
            i13 = playlistRepositoryImpl$changePosition$2.f15906g;
            int i16 = playlistRepositoryImpl$changePosition$2.f15905f;
            i7 = playlistRepositoryImpl$changePosition$2.f15904e;
            i6 = playlistRepositoryImpl$changePosition$2.f15903d;
            String str7 = playlistRepositoryImpl$changePosition$2.f15901b;
            str3 = playlistRepositoryImpl$changePosition$2.f15900a;
            AbstractC3193b.m15359b(obj);
            i5 = i16;
            str6 = str7;
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = playlistRepositoryImpl$changePosition$2.f15907h;
            int i18 = playlistRepositoryImpl$changePosition$2.f15906g;
            int i19 = playlistRepositoryImpl$changePosition$2.f15905f;
            i11 = playlistRepositoryImpl$changePosition$2.f15904e;
            int i20 = playlistRepositoryImpl$changePosition$2.f15903d;
            bd7 bd7Var3 = playlistRepositoryImpl$changePosition$2.f15902c;
            String str8 = playlistRepositoryImpl$changePosition$2.f15901b;
            String str9 = playlistRepositoryImpl$changePosition$2.f15900a;
            AbstractC3193b.m15359b(obj);
            i10 = i20;
            i8 = i18;
            i9 = i17;
            str4 = str8;
            bd7Var = bd7Var3;
            str5 = str9;
            i5 = i19;
        }
        bd7Var2 = (bd7) obj;
        if (bd7Var2 != null || (numM3649d = bd7Var2.m3649d()) == null) {
            i12 = i11;
            iIntValue = i12;
        } else {
            iIntValue = numM3649d.intValue();
            i12 = i11;
        }
        PlaylistRepositoryImpl$changePosition$2 playlistRepositoryImpl$changePosition$3 = new PlaylistRepositoryImpl$changePosition$2(i9, i12, this, iIntValue, str4, i8, str5, bd7Var, i5, null);
        playlistRepositoryImpl$changePosition$2.f15900a = null;
        playlistRepositoryImpl$changePosition$2.f15901b = null;
        playlistRepositoryImpl$changePosition$2.f15902c = null;
        playlistRepositoryImpl$changePosition$2.f15903d = i10;
        playlistRepositoryImpl$changePosition$2.f15904e = i12;
        playlistRepositoryImpl$changePosition$2.f15905f = i5;
        playlistRepositoryImpl$changePosition$2.f15906g = i8;
        playlistRepositoryImpl$changePosition$2.f15907h = i9;
        playlistRepositoryImpl$changePosition$2.f15910k = 3;
        return AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$changePosition$3, playlistRepositoryImpl$changePosition$2) == coroutineSingletons ? coroutineSingletons : xfaVar;
        bd7 bd7Var4 = (bd7) obj;
        if (bd7Var4 != null) {
            Integer numM3649d2 = bd7Var4.m3649d();
            int iIntValue2 = numM3649d2 != null ? numM3649d2.intValue() : i6;
            playlistRepositoryImpl$changePosition$2.f15900a = str3;
            playlistRepositoryImpl$changePosition$2.f15901b = str6;
            playlistRepositoryImpl$changePosition$2.f15902c = bd7Var4;
            playlistRepositoryImpl$changePosition$2.f15903d = i6;
            playlistRepositoryImpl$changePosition$2.f15904e = i7;
            playlistRepositoryImpl$changePosition$2.f15905f = i5;
            playlistRepositoryImpl$changePosition$2.f15906g = i13;
            playlistRepositoryImpl$changePosition$2.f15907h = iIntValue2;
            playlistRepositoryImpl$changePosition$2.f15910k = 2;
            Object objM2861d2 = AbstractC0758a.m2861d(new hd7(i7, str6, 0), c1322j.f17045K, playlistRepositoryImpl$changePosition$2, true, true);
            if (objM2861d2 != coroutineSingletons) {
                i8 = i13;
                str4 = str6;
                str5 = str3;
                i9 = iIntValue2;
                i10 = i6;
                bd7Var = bd7Var4;
                obj = objM2861d2;
                i11 = i7;
                bd7Var2 = (bd7) obj;
                if (bd7Var2 != null) {
                    i12 = i11;
                    iIntValue = i12;
                } else {
                    i12 = i11;
                    iIntValue = i12;
                }
                PlaylistRepositoryImpl$changePosition$2 playlistRepositoryImpl$changePosition$4 = new PlaylistRepositoryImpl$changePosition$2(i9, i12, this, iIntValue, str4, i8, str5, bd7Var, i5, null);
                playlistRepositoryImpl$changePosition$2.f15900a = null;
                playlistRepositoryImpl$changePosition$2.f15901b = null;
                playlistRepositoryImpl$changePosition$2.f15902c = null;
                playlistRepositoryImpl$changePosition$2.f15903d = i10;
                playlistRepositoryImpl$changePosition$2.f15904e = i12;
                playlistRepositoryImpl$changePosition$2.f15905f = i5;
                playlistRepositoryImpl$changePosition$2.f15906g = i8;
                playlistRepositoryImpl$changePosition$2.f15907h = i9;
                playlistRepositoryImpl$changePosition$2.f15910k = 3;
                if (AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$changePosition$4, playlistRepositoryImpl$changePosition$2) == coroutineSingletons) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m7347g(ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$clearDownloads$1 playlistRepositoryImpl$clearDownloads$1;
        if (continuationImpl instanceof PlaylistRepositoryImpl$clearDownloads$1) {
            playlistRepositoryImpl$clearDownloads$1 = (PlaylistRepositoryImpl$clearDownloads$1) continuationImpl;
            int i = playlistRepositoryImpl$clearDownloads$1.f15923c;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$clearDownloads$1.f15923c = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$clearDownloads$1 = new PlaylistRepositoryImpl$clearDownloads$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$clearDownloads$1 = new PlaylistRepositoryImpl$clearDownloads$1(this, continuationImpl);
        }
        Object obj = playlistRepositoryImpl$clearDownloads$1.f15921a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$clearDownloads$1.f15923c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistRepositoryImpl$clearDownloads$1.f15923c = 1;
            Object objM2861d = AbstractC0758a.m2861d(new lz5(25), this.f16534c.f17045K, playlistRepositoryImpl$clearDownloads$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        playlistRepositoryImpl$clearDownloads$1.f15923c = 3;
        C3244l c3244l = this.f16541j.f49736a;
        Map mapM15360M = AbstractC3194a.m15360M();
        c3244l.getClass();
        c3244l.m15572j(null, mapM15360M);
        if (xfaVar != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        playlistRepositoryImpl$clearDownloads$1.f15923c = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new ry4(11), this.f16536e.f17034K, playlistRepositoryImpl$clearDownloads$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        if (objM2861d2 != coroutineSingletons) {
            playlistRepositoryImpl$clearDownloads$1.f15923c = 3;
            C3244l c3244l2 = this.f16541j.f49736a;
            Map mapM15360M2 = AbstractC3194a.m15360M();
            c3244l2.getClass();
            c3244l2.m15572j(null, mapM15360M2);
            if (xfaVar != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m7348h(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$deletePlaylist$1 playlistRepositoryImpl$deletePlaylist$1;
        if (continuationImpl instanceof PlaylistRepositoryImpl$deletePlaylist$1) {
            playlistRepositoryImpl$deletePlaylist$1 = (PlaylistRepositoryImpl$deletePlaylist$1) continuationImpl;
            int i2 = playlistRepositoryImpl$deletePlaylist$1.f15928e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$deletePlaylist$1.f15928e = i2 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$deletePlaylist$1 = new PlaylistRepositoryImpl$deletePlaylist$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$deletePlaylist$1 = new PlaylistRepositoryImpl$deletePlaylist$1(this, continuationImpl);
        }
        Object objM7364x = playlistRepositoryImpl$deletePlaylist$1.f15926c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = playlistRepositoryImpl$deletePlaylist$1.f15928e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7364x);
            playlistRepositoryImpl$deletePlaylist$1.f15924a = str;
            playlistRepositoryImpl$deletePlaylist$1.f15925b = i;
            playlistRepositoryImpl$deletePlaylist$1.f15928e = 1;
            objM7364x = m7364x(str, str2, playlistRepositoryImpl$deletePlaylist$1);
            if (objM7364x == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = playlistRepositoryImpl$deletePlaylist$1.f15925b;
            str = playlistRepositoryImpl$deletePlaylist$1.f15924a;
            AbstractC3193b.m15359b(objM7364x);
        }
        if (((Boolean) objM7364x).booleanValue()) {
            String strValueOf = String.valueOf(i);
            xj1 xj1Var = new xj1();
            xj1Var.m24558b(NetworkType.CONNECTED);
            tx6 tx6Var = (tx6) ((tx6) new tx6(PlaylistDeleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
            Pair[] pairArr = {new Pair("language", str), new Pair("playlistId", strValueOf)};
            hi8 hi8Var = new hi8(10);
            for (int i4 = 0; i4 < 2; i4++) {
                Pair pair = pairArr[i4];
                hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
            }
            this.f16543l.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m7349i(String str, String str2, Integer num, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1 playlistRepositoryImpl$dispatchAddPlaylistWorker$1;
        if (continuationImpl instanceof PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1) {
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1 = (PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1) continuationImpl;
            int i = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15935g;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15935g = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$dispatchAddPlaylistWorker$1 = new PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1 = new PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1(this, continuationImpl);
        }
        Object objM15541t = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15933e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15935g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) this.f16539h).f18480m;
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15929a = str;
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15930b = str2;
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15931c = num;
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15932d = str3;
            playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15935g = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, playlistRepositoryImpl$dispatchAddPlaylistWorker$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15932d;
            num = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15931c;
            str2 = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15930b;
            str = playlistRepositoryImpl$dispatchAddPlaylistWorker$1.f15929a;
            AbstractC3193b.m15359b(objM15541t);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(AddPlaylistWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair pair = new Pair("language", str);
        Pair pair2 = new Pair("itemId", num);
        Pair pair3 = new Pair("itemURL", str3);
        Pair pair4 = new Pair("title", str2);
        String str4 = ((Profile) objM15541t).f19665n;
        if (vk9.m23391n0(str4)) {
            str4 = "en";
        }
        Pair[] pairArr = {pair, pair2, pair3, pair4, new Pair("titleLanguage", str4)};
        hi8 hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 5; i3++) {
            Pair pair5 = pairArr[i3];
            hi8Var.m13287x(pair5.f47624b, (String) pair5.f47623a);
        }
        this.f16543l.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final void m7350j(int i, Integer num, String str, String str2, String str3) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(PlaylistLessonActionWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("playlistId", String.valueOf(i)), new Pair("lessonURL", str2), new Pair("action", str3), new Pair("position", num)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 5; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16543l.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m7351k(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1 playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1;
        if (continuationImpl instanceof PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1) {
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1 = (PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1) continuationImpl;
            int i = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15941f;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15941f = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1 = new PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1 = new PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1(this, continuationImpl);
        }
        Object objM15541t = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15939d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15941f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) this.f16539h).f18480m;
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15936a = str;
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15937b = str2;
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15938c = str3;
            playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15941f = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15938c;
            str2 = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15937b;
            str = playlistRepositoryImpl$dispatchUpdatePlaylistWorker$1.f15936a;
            AbstractC3193b.m15359b(objM15541t);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(PlaylistUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair pair = new Pair("language", str);
        Pair pair2 = new Pair("playlistId", str2);
        String str4 = ((Profile) objM15541t).f19665n;
        if (vk9.m23391n0(str4)) {
            str4 = "en";
        }
        Pair[] pairArr = {pair, pair2, new Pair("titleLanguage", str4), new Pair("title", str3)};
        hi8 hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 4; i3++) {
            Pair pair3 = pairArr[i3];
            hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
        }
        this.f16543l.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: l */
    public final Object m7352l(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1 playlistRepositoryImpl$fetchCoursePlaylistLessons$1;
        int i2;
        String str2;
        List arrayList;
        int i3;
        Results results;
        List list;
        if (continuationImpl instanceof PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1) {
            playlistRepositoryImpl$fetchCoursePlaylistLessons$1 = (PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1) continuationImpl;
            int i4 = playlistRepositoryImpl$fetchCoursePlaylistLessons$1.f15947f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$fetchCoursePlaylistLessons$1.f15947f = i4 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$fetchCoursePlaylistLessons$1 = new PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$fetchCoursePlaylistLessons$1 = new PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1 playlistRepositoryImpl$fetchCoursePlaylistLessons$2 = playlistRepositoryImpl$fetchCoursePlaylistLessons$1;
        Object objM4467h = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15945d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15947f;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM4467h);
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15942a = str;
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c = i;
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15947f = 1;
            Object objM14048y0 = this.f16535d.m14048y0(i, playlistRepositoryImpl$fetchCoursePlaylistLessons$2);
            if (objM14048y0 != coroutineSingletons) {
                i2 = i;
                str2 = str;
                objM4467h = objM14048y0;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i2 = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c;
            String str3 = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15942a;
            AbstractC3193b.m15359b(objM4467h);
            str2 = str3;
        } else {
            if (i5 == 2) {
                i2 = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c;
                arrayList = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15943b;
                AbstractC3193b.m15359b(objM4467h);
                i3 = i2;
                results = (Results) objM4467h;
                if (results != null) {
                    return arrayList;
                }
                PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1 playlistRepositoryImpl$fetchCoursePlaylistLessons$2$1 = new PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1(results, this, arrayList, i3, null);
                playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15942a = null;
                playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15943b = arrayList;
                playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c = i3;
                playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15947f = 3;
                objM4467h = AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$fetchCoursePlaylistLessons$2$1, playlistRepositoryImpl$fetchCoursePlaylistLessons$2);
                if (objM4467h != coroutineSingletons) {
                    list = arrayList;
                }
                return coroutineSingletons;
            }
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15943b;
            AbstractC3193b.m15359b(objM4467h);
        }
        return list;
        u85 u85Var = (u85) objM4467h;
        arrayList = new ArrayList();
        Integer num = new Integer(i2);
        String value = Sort.Position.getValue();
        if (!fa4.m11650l(u85Var != null ? u85Var.f63545G : null, "private")) {
            fa4.m11650l(u85Var != null ? u85Var.f63545G : null, "shared");
        }
        playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15942a = null;
        playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15943b = arrayList;
        playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c = i2;
        playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15947f = 2;
        objM4467h = this.f16538g.m4467h(str2, num, value, LibraryItemType.Content.getValue(), DescriptorProtos.Edition.EDITION_2023_VALUE, 1, EmptyList.f47638a, playlistRepositoryImpl$fetchCoursePlaylistLessons$2);
        if (objM4467h != coroutineSingletons) {
            i3 = i2;
            results = (Results) objM4467h;
            if (results != null) {
                return arrayList;
            }
            PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1 playlistRepositoryImpl$fetchCoursePlaylistLessons$2$2 = new PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1(results, this, arrayList, i3, null);
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15942a = null;
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15943b = arrayList;
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15944c = i3;
            playlistRepositoryImpl$fetchCoursePlaylistLessons$2.f15947f = 3;
            objM4467h = AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$fetchCoursePlaylistLessons$2$2, playlistRepositoryImpl$fetchCoursePlaylistLessons$2);
            if (objM4467h != coroutineSingletons) {
                list = arrayList;
                return list;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c A[LOOP:0: B:30:0x0096->B:32:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Serializable m7353m(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$fetchPlaylistLessons$1 playlistRepositoryImpl$fetchPlaylistLessons$1;
        int i2;
        String str3;
        Object obj;
        String str4;
        List list;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof PlaylistRepositoryImpl$fetchPlaylistLessons$1) {
            playlistRepositoryImpl$fetchPlaylistLessons$1 = (PlaylistRepositoryImpl$fetchPlaylistLessons$1) continuationImpl;
            int i3 = playlistRepositoryImpl$fetchPlaylistLessons$1.f15963g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$fetchPlaylistLessons$1.f15963g = i3 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$fetchPlaylistLessons$1 = new PlaylistRepositoryImpl$fetchPlaylistLessons$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$fetchPlaylistLessons$1 = new PlaylistRepositoryImpl$fetchPlaylistLessons$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$fetchPlaylistLessons$1 playlistRepositoryImpl$fetchPlaylistLessons$2 = playlistRepositoryImpl$fetchPlaylistLessons$1;
        Object obj2 = playlistRepositoryImpl$fetchPlaylistLessons$2.f15961e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = playlistRepositoryImpl$fetchPlaylistLessons$2.f15963g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj2);
            PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1 playlistRepositoryImpl$fetchPlaylistLessons$lessons$1 = new PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1(this, str, i, null);
            playlistRepositoryImpl$fetchPlaylistLessons$2.f15957a = str;
            playlistRepositoryImpl$fetchPlaylistLessons$2.f15958b = str2;
            playlistRepositoryImpl$fetchPlaylistLessons$2.f15960d = i;
            playlistRepositoryImpl$fetchPlaylistLessons$2.f15963g = 1;
            Object objM7367a = AbstractC1303s.m7367a(playlistRepositoryImpl$fetchPlaylistLessons$lessons$1, playlistRepositoryImpl$fetchPlaylistLessons$2);
            if (objM7367a != coroutineSingletons) {
                i2 = i;
                str3 = str;
                obj = objM7367a;
                str4 = str2;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i5 = playlistRepositoryImpl$fetchPlaylistLessons$2.f15960d;
            String str5 = playlistRepositoryImpl$fetchPlaylistLessons$2.f15958b;
            str3 = playlistRepositoryImpl$fetchPlaylistLessons$2.f15957a;
            AbstractC3193b.m15359b(obj2);
            i2 = i5;
            obj = obj2;
            str4 = str5;
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = playlistRepositoryImpl$fetchPlaylistLessons$2.f15959c;
            AbstractC3193b.m15359b(obj2);
        }
        List list2 = list;
        arrayList = new ArrayList(v91.m23189q0(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            AbstractC3393o1.m17749x(((ResultPlaylist) it.next()).m8381a(), arrayList);
        }
        return arrayList;
        List list3 = (List) obj;
        if (list3 == null) {
            return EmptyList.f47638a;
        }
        PlaylistRepositoryImpl$fetchPlaylistLessons$2 playlistRepositoryImpl$fetchPlaylistLessons$3 = new PlaylistRepositoryImpl$fetchPlaylistLessons$2(list3, str4, str3, i2, this, null);
        playlistRepositoryImpl$fetchPlaylistLessons$2.f15957a = null;
        playlistRepositoryImpl$fetchPlaylistLessons$2.f15958b = null;
        playlistRepositoryImpl$fetchPlaylistLessons$2.f15959c = list3;
        playlistRepositoryImpl$fetchPlaylistLessons$2.f15960d = i2;
        playlistRepositoryImpl$fetchPlaylistLessons$2.f15963g = 2;
        if (AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$fetchPlaylistLessons$3, playlistRepositoryImpl$fetchPlaylistLessons$2) != coroutineSingletons) {
            list = list3;
            List list4 = list;
            arrayList = new ArrayList(v91.m23189q0(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((ResultPlaylist) it.next()).m8381a(), arrayList);
            }
            return arrayList;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02b8 -> B:70:0x02bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02c2 -> B:71:0x02be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v9 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m7354n(java.lang.String r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1302r.m7354n(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    public final kk8 m7355o(String str) {
        str.getClass();
        return new kk8(new PlaylistRepositoryImpl$getDefaultPlaylist$1(this, str, null));
    }

    /* JADX INFO: renamed from: p */
    public final Object m7356p(int i, String str, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new ld0(str, i, 19), this.f16534c.f17045K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: q */
    public final c83 m7357q(String str) {
        str.getClass();
        C1322j c1322j = this.f16534c;
        c1322j.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, true, new String[]{"LessonAudioDownloadEntity"}, new ql4(str, 9)));
    }

    /* JADX INFO: renamed from: r */
    public final c83 m7358r(int i, String str) {
        str.getClass();
        jj2 jj2Var = new jj2(this.f16541j.f49736a, i, 0);
        C1322j c1322j = this.f16534c;
        c1322j.getClass();
        return AbstractC3224d.m15536o(new C3228h(jj2Var, new wz0(18, AbstractC3584sr.m21590A(c1322j.f17045K, false, new String[]{"LessonAudioDownloadEntity"}, new ld0(str, i, 21)), this), new PlaylistRepositoryImpl$observeAudioFetchState$2()));
    }

    /* JADX INFO: renamed from: s */
    public final c83 m7359s(int i, String str) {
        str.getClass();
        C1322j c1322j = this.f16534c;
        c1322j.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, true, new String[]{"LessonsWithPlaylistJoin", "PlaylistEntity"}, new hd7(str, i, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: t */
    public final Object m7360t(int i, int i2, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistCourse$1 playlistRepositoryImpl$removePlaylistCourse$1;
        String str3;
        int i3;
        String str4;
        u85 u85Var;
        String str5;
        int i4;
        String str6;
        int i5;
        int i6;
        bd7 bd7Var;
        Object objM2861d;
        bd7 bd7Var2;
        String str7;
        u85 u85Var2;
        int i7;
        String str8;
        Integer numM3649d;
        u85 u85Var3;
        String str9;
        int i8 = i;
        if (continuationImpl instanceof PlaylistRepositoryImpl$removePlaylistCourse$1) {
            playlistRepositoryImpl$removePlaylistCourse$1 = (PlaylistRepositoryImpl$removePlaylistCourse$1) continuationImpl;
            int i9 = playlistRepositoryImpl$removePlaylistCourse$1.f16011j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistCourse$1.f16011j = i9 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistCourse$1 = new PlaylistRepositoryImpl$removePlaylistCourse$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$removePlaylistCourse$1 = new PlaylistRepositoryImpl$removePlaylistCourse$1(this, continuationImpl);
        }
        Object obj = playlistRepositoryImpl$removePlaylistCourse$1.f16009h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = playlistRepositoryImpl$removePlaylistCourse$1.f16011j;
        xfa xfaVar = xfa.f68157a;
        C1322j c1322j = this.f16534c;
        if (i10 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistRepositoryImpl$removePlaylistCourse$1.f16002a = str;
            str3 = str2;
            playlistRepositoryImpl$removePlaylistCourse$1.f16003b = str3;
            playlistRepositoryImpl$removePlaylistCourse$1.f16006e = i8;
            i3 = i2;
            playlistRepositoryImpl$removePlaylistCourse$1.f16007f = i3;
            playlistRepositoryImpl$removePlaylistCourse$1.f16011j = 1;
            Object objM14048y0 = this.f16535d.m14048y0(i8, playlistRepositoryImpl$removePlaylistCourse$1);
            if (objM14048y0 != coroutineSingletons) {
                str4 = str;
                obj = objM14048y0;
            }
            return coroutineSingletons;
        }
        if (i10 == 1) {
            int i11 = playlistRepositoryImpl$removePlaylistCourse$1.f16007f;
            int i12 = playlistRepositoryImpl$removePlaylistCourse$1.f16006e;
            String str10 = playlistRepositoryImpl$removePlaylistCourse$1.f16003b;
            str4 = playlistRepositoryImpl$removePlaylistCourse$1.f16002a;
            AbstractC3193b.m15359b(obj);
            i3 = i11;
            i8 = i12;
            str3 = str10;
        } else {
            if (i10 == 2) {
                i6 = playlistRepositoryImpl$removePlaylistCourse$1.f16008g;
                i5 = playlistRepositoryImpl$removePlaylistCourse$1.f16007f;
                int i13 = playlistRepositoryImpl$removePlaylistCourse$1.f16006e;
                u85Var = playlistRepositoryImpl$removePlaylistCourse$1.f16004c;
                str6 = playlistRepositoryImpl$removePlaylistCourse$1.f16003b;
                str5 = playlistRepositoryImpl$removePlaylistCourse$1.f16002a;
                AbstractC3193b.m15359b(obj);
                i4 = i13;
                bd7Var = (bd7) obj;
                playlistRepositoryImpl$removePlaylistCourse$1.f16002a = str5;
                playlistRepositoryImpl$removePlaylistCourse$1.f16003b = str6;
                playlistRepositoryImpl$removePlaylistCourse$1.f16004c = u85Var;
                playlistRepositoryImpl$removePlaylistCourse$1.f16005d = bd7Var;
                playlistRepositoryImpl$removePlaylistCourse$1.f16006e = i4;
                playlistRepositoryImpl$removePlaylistCourse$1.f16007f = i5;
                playlistRepositoryImpl$removePlaylistCourse$1.f16008g = i6;
                playlistRepositoryImpl$removePlaylistCourse$1.f16011j = 3;
                objM2861d = AbstractC0758a.m2861d(new ld0(str5, i4, 27), c1322j.f17045K, playlistRepositoryImpl$removePlaylistCourse$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    u85 u85Var4 = u85Var;
                    bd7Var2 = bd7Var;
                    str7 = str6;
                    u85Var2 = u85Var4;
                    int i14 = i6;
                    i7 = i5;
                    if (bd7Var2 == null) {
                    }
                    str8 = str5;
                    str9 = u85Var2.f63567f;
                    if (str9 == null) {
                        str9 = "";
                    }
                    m7350j(i7, null, str8, str9, "del");
                    return xfaVar;
                }
                return coroutineSingletons;
            }
            if (i10 == 3) {
                i6 = playlistRepositoryImpl$removePlaylistCourse$1.f16008g;
                i5 = playlistRepositoryImpl$removePlaylistCourse$1.f16007f;
                i4 = playlistRepositoryImpl$removePlaylistCourse$1.f16006e;
                bd7Var2 = playlistRepositoryImpl$removePlaylistCourse$1.f16005d;
                u85Var2 = playlistRepositoryImpl$removePlaylistCourse$1.f16004c;
                String str11 = playlistRepositoryImpl$removePlaylistCourse$1.f16003b;
                String str12 = playlistRepositoryImpl$removePlaylistCourse$1.f16002a;
                AbstractC3193b.m15359b(obj);
                str7 = str11;
                str5 = str12;
                int i15 = i6;
                i7 = i5;
                if (bd7Var2 == null && (numM3649d = bd7Var2.m3649d()) != null) {
                    int iIntValue = numM3649d.intValue();
                    playlistRepositoryImpl$removePlaylistCourse$1.f16002a = str5;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16003b = null;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16004c = u85Var2;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16005d = null;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16006e = i4;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16007f = i7;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16008g = i15;
                    playlistRepositoryImpl$removePlaylistCourse$1.f16011j = 4;
                    Object objM2861d2 = AbstractC0758a.m2861d(new ld0(iIntValue, str7, 28), c1322j.f17045K, playlistRepositoryImpl$removePlaylistCourse$1, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        u85Var3 = u85Var2;
                        str8 = str5;
                    }
                    return coroutineSingletons;
                }
                str8 = str5;
                str9 = u85Var2.f63567f;
                if (str9 == null) {
                    str9 = "";
                }
                m7350j(i7, null, str8, str9, "del");
                return xfaVar;
            }
            if (i10 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i7 = playlistRepositoryImpl$removePlaylistCourse$1.f16007f;
            u85Var3 = playlistRepositoryImpl$removePlaylistCourse$1.f16004c;
            str8 = playlistRepositoryImpl$removePlaylistCourse$1.f16002a;
            AbstractC3193b.m15359b(obj);
        }
        u85Var2 = u85Var3;
        str9 = u85Var2.f63567f;
        if (str9 == null) {
            str9 = "";
        }
        m7350j(i7, null, str8, str9, "del");
        return xfaVar;
        u85 u85Var5 = (u85) obj;
        if (u85Var5 != null) {
            ((C1240a) this.f16542k).m7025f("Playlist item removed", null);
            playlistRepositoryImpl$removePlaylistCourse$1.f16002a = str4;
            playlistRepositoryImpl$removePlaylistCourse$1.f16003b = str3;
            playlistRepositoryImpl$removePlaylistCourse$1.f16004c = u85Var5;
            playlistRepositoryImpl$removePlaylistCourse$1.f16006e = i8;
            playlistRepositoryImpl$removePlaylistCourse$1.f16007f = i3;
            playlistRepositoryImpl$removePlaylistCourse$1.f16008g = 0;
            playlistRepositoryImpl$removePlaylistCourse$1.f16011j = 2;
            Object objM2861d3 = AbstractC0758a.m2861d(new ld0(i8, str3, 23), c1322j.f17045K, playlistRepositoryImpl$removePlaylistCourse$1, true, true);
            if (objM2861d3 != coroutineSingletons) {
                u85Var = u85Var5;
                obj = objM2861d3;
                str5 = str4;
                i4 = i8;
                str6 = str3;
                i5 = i3;
                i6 = 0;
                bd7Var = (bd7) obj;
                playlistRepositoryImpl$removePlaylistCourse$1.f16002a = str5;
                playlistRepositoryImpl$removePlaylistCourse$1.f16003b = str6;
                playlistRepositoryImpl$removePlaylistCourse$1.f16004c = u85Var;
                playlistRepositoryImpl$removePlaylistCourse$1.f16005d = bd7Var;
                playlistRepositoryImpl$removePlaylistCourse$1.f16006e = i4;
                playlistRepositoryImpl$removePlaylistCourse$1.f16007f = i5;
                playlistRepositoryImpl$removePlaylistCourse$1.f16008g = i6;
                playlistRepositoryImpl$removePlaylistCourse$1.f16011j = 3;
                objM2861d = AbstractC0758a.m2861d(new ld0(str5, i4, 27), c1322j.f17045K, playlistRepositoryImpl$removePlaylistCourse$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    u85 u85Var6 = u85Var;
                    bd7Var2 = bd7Var;
                    str7 = str6;
                    u85Var2 = u85Var6;
                    int i16 = i6;
                    i7 = i5;
                    if (bd7Var2 == null) {
                    }
                    str8 = str5;
                    str9 = u85Var2.f63567f;
                    if (str9 == null) {
                        str9 = "";
                    }
                    m7350j(i7, null, str8, str9, "del");
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (m7363w(r11, r3, r12, r5, r6, r7) == r0) goto L25;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7361u(int i, int i2, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$5 playlistRepositoryImpl$removePlaylistLesson$5;
        if (continuationImpl instanceof PlaylistRepositoryImpl$removePlaylistLesson$5) {
            playlistRepositoryImpl$removePlaylistLesson$5 = (PlaylistRepositoryImpl$removePlaylistLesson$5) continuationImpl;
            int i3 = playlistRepositoryImpl$removePlaylistLesson$5.f16038g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$5.f16038g = i3 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$5 = new PlaylistRepositoryImpl$removePlaylistLesson$5(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$5 = new PlaylistRepositoryImpl$removePlaylistLesson$5(this, continuationImpl);
        }
        PlaylistRepositoryImpl$removePlaylistLesson$5 playlistRepositoryImpl$removePlaylistLesson$6 = playlistRepositoryImpl$removePlaylistLesson$5;
        Object objM2861d = playlistRepositoryImpl$removePlaylistLesson$6.f16036e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = playlistRepositoryImpl$removePlaylistLesson$6.f16038g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            playlistRepositoryImpl$removePlaylistLesson$6.f16032a = str;
            playlistRepositoryImpl$removePlaylistLesson$6.f16033b = str2;
            playlistRepositoryImpl$removePlaylistLesson$6.f16034c = i;
            playlistRepositoryImpl$removePlaylistLesson$6.f16035d = i2;
            playlistRepositoryImpl$removePlaylistLesson$6.f16038g = 1;
            objM2861d = AbstractC0758a.m2861d(new mv0(i2, 19), this.f16534c.f17045K, playlistRepositoryImpl$removePlaylistLesson$6, true, false);
            if (objM2861d != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            i2 = playlistRepositoryImpl$removePlaylistLesson$6.f16035d;
            i = playlistRepositoryImpl$removePlaylistLesson$6.f16034c;
            str2 = playlistRepositoryImpl$removePlaylistLesson$6.f16033b;
            str = playlistRepositoryImpl$removePlaylistLesson$6.f16032a;
            AbstractC3193b.m15359b(objM2861d);
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        return xfa.f68157a;
        int i5 = i;
        Playlist playlist = (Playlist) objM2861d;
        if (playlist != null) {
            String strM8117b = playlist.m8117b();
            Integer num = new Integer(i2);
            playlistRepositoryImpl$removePlaylistLesson$6.f16032a = null;
            playlistRepositoryImpl$removePlaylistLesson$6.f16033b = null;
            playlistRepositoryImpl$removePlaylistLesson$6.f16034c = i5;
            playlistRepositoryImpl$removePlaylistLesson$6.f16035d = i2;
            playlistRepositoryImpl$removePlaylistLesson$6.f16038g = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (m7363w(r10, r3, r11, r5, r6, r7) == r0) goto L25;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7362v(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$3 playlistRepositoryImpl$removePlaylistLesson$3;
        if (continuationImpl instanceof PlaylistRepositoryImpl$removePlaylistLesson$3) {
            playlistRepositoryImpl$removePlaylistLesson$3 = (PlaylistRepositoryImpl$removePlaylistLesson$3) continuationImpl;
            int i2 = playlistRepositoryImpl$removePlaylistLesson$3.f16031f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$3.f16031f = i2 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$3 = new PlaylistRepositoryImpl$removePlaylistLesson$3(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$3 = new PlaylistRepositoryImpl$removePlaylistLesson$3(this, continuationImpl);
        }
        PlaylistRepositoryImpl$removePlaylistLesson$3 playlistRepositoryImpl$removePlaylistLesson$4 = playlistRepositoryImpl$removePlaylistLesson$3;
        Object objM2861d = playlistRepositoryImpl$removePlaylistLesson$4.f16029d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = playlistRepositoryImpl$removePlaylistLesson$4.f16031f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            playlistRepositoryImpl$removePlaylistLesson$4.f16026a = str;
            playlistRepositoryImpl$removePlaylistLesson$4.f16027b = str2;
            playlistRepositoryImpl$removePlaylistLesson$4.f16028c = i;
            playlistRepositoryImpl$removePlaylistLesson$4.f16031f = 1;
            objM2861d = AbstractC0758a.m2861d(new ld0(i, str, 26), this.f16534c.f17045K, playlistRepositoryImpl$removePlaylistLesson$4, true, false);
            if (objM2861d != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            i = playlistRepositoryImpl$removePlaylistLesson$4.f16028c;
            str2 = playlistRepositoryImpl$removePlaylistLesson$4.f16027b;
            str = playlistRepositoryImpl$removePlaylistLesson$4.f16026a;
            AbstractC3193b.m15359b(objM2861d);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        return xfa.f68157a;
        int i4 = i;
        Playlist playlist = (Playlist) objM2861d;
        if (playlist != null) {
            String strM8117b = playlist.m8117b();
            Integer num = new Integer(playlist.m8118c());
            playlistRepositoryImpl$removePlaylistLesson$4.f16026a = null;
            playlistRepositoryImpl$removePlaylistLesson$4.f16027b = null;
            playlistRepositoryImpl$removePlaylistLesson$4.f16028c = i4;
            playlistRepositoryImpl$removePlaylistLesson$4.f16031f = 2;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: w */
    public final Object m7363w(String str, String str2, String str3, int i, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLesson$1 playlistRepositoryImpl$removePlaylistLesson$1;
        String str4;
        String str5;
        Integer num2;
        Object objM2861d;
        PlaylistRepositoryImpl$removePlaylistLesson$2$1 playlistRepositoryImpl$removePlaylistLesson$2$1;
        String str6;
        String str7;
        Integer num3;
        String str8 = str2;
        int i2 = i;
        if (continuationImpl instanceof PlaylistRepositoryImpl$removePlaylistLesson$1) {
            playlistRepositoryImpl$removePlaylistLesson$1 = (PlaylistRepositoryImpl$removePlaylistLesson$1) continuationImpl;
            int i3 = playlistRepositoryImpl$removePlaylistLesson$1.f16019h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLesson$1.f16019h = i3 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLesson$1 = new PlaylistRepositoryImpl$removePlaylistLesson$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLesson$1 = new PlaylistRepositoryImpl$removePlaylistLesson$1(this, continuationImpl);
        }
        Object obj = playlistRepositoryImpl$removePlaylistLesson$1.f16017f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = playlistRepositoryImpl$removePlaylistLesson$1.f16019h;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = playlistRepositoryImpl$removePlaylistLesson$1.f16016e;
                String str9 = playlistRepositoryImpl$removePlaylistLesson$1.f16014c;
                String str10 = playlistRepositoryImpl$removePlaylistLesson$1.f16013b;
                String str11 = playlistRepositoryImpl$removePlaylistLesson$1.f16012a;
                AbstractC3193b.m15359b(obj);
                i2 = i5;
                str5 = str11;
                objM2861d = obj;
                str4 = str9;
                str8 = str10;
            } else {
                if (i4 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                num3 = playlistRepositoryImpl$removePlaylistLesson$1.f16015d;
                str7 = playlistRepositoryImpl$removePlaylistLesson$1.f16014c;
                str6 = playlistRepositoryImpl$removePlaylistLesson$1.f16012a;
                AbstractC3193b.m15359b(obj);
            }
            m7350j(num3.intValue(), null, str6, str7, "del");
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        if (num != null) {
            str4 = str3;
            str5 = str;
            num2 = num;
            if (num2 != null) {
                ((C1240a) this.f16542k).m7025f("Playlist item removed", null);
                playlistRepositoryImpl$removePlaylistLesson$2$1 = new PlaylistRepositoryImpl$removePlaylistLesson$2$1(this, i2, str8, num2, null);
                playlistRepositoryImpl$removePlaylistLesson$1.f16012a = str5;
                playlistRepositoryImpl$removePlaylistLesson$1.f16013b = null;
                playlistRepositoryImpl$removePlaylistLesson$1.f16014c = str4;
                playlistRepositoryImpl$removePlaylistLesson$1.f16015d = num2;
                playlistRepositoryImpl$removePlaylistLesson$1.f16016e = i2;
                playlistRepositoryImpl$removePlaylistLesson$1.f16019h = 2;
                if (AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$removePlaylistLesson$2$1, playlistRepositoryImpl$removePlaylistLesson$1) != coroutineSingletons) {
                    str6 = str5;
                    str7 = str4;
                    num3 = num2;
                    m7350j(num3.intValue(), null, str6, str7, "del");
                }
            }
            return xfa.f68157a;
        }
        playlistRepositoryImpl$removePlaylistLesson$1.f16012a = str;
        playlistRepositoryImpl$removePlaylistLesson$1.f16013b = str8;
        str4 = str3;
        playlistRepositoryImpl$removePlaylistLesson$1.f16014c = str4;
        playlistRepositoryImpl$removePlaylistLesson$1.f16016e = i2;
        playlistRepositoryImpl$removePlaylistLesson$1.f16019h = 1;
        objM2861d = AbstractC0758a.m2861d(new sp0(str, i2, 7, str8), this.f16534c.f17045K, playlistRepositoryImpl$removePlaylistLesson$1, true, false);
        if (objM2861d != coroutineSingletons) {
            str5 = str;
        }
        return coroutineSingletons;
        num2 = (Integer) objM2861d;
        if (num2 != null) {
            ((C1240a) this.f16542k).m7025f("Playlist item removed", null);
            playlistRepositoryImpl$removePlaylistLesson$2$1 = new PlaylistRepositoryImpl$removePlaylistLesson$2$1(this, i2, str8, num2, null);
            playlistRepositoryImpl$removePlaylistLesson$1.f16012a = str5;
            playlistRepositoryImpl$removePlaylistLesson$1.f16013b = null;
            playlistRepositoryImpl$removePlaylistLesson$1.f16014c = str4;
            playlistRepositoryImpl$removePlaylistLesson$1.f16015d = num2;
            playlistRepositoryImpl$removePlaylistLesson$1.f16016e = i2;
            playlistRepositoryImpl$removePlaylistLesson$1.f16019h = 2;
            if (AbstractC0747e.m2849b(this.f16532a, playlistRepositoryImpl$removePlaylistLesson$2$1, playlistRepositoryImpl$removePlaylistLesson$1) != coroutineSingletons) {
                str6 = str5;
                str7 = str4;
                num3 = num2;
                m7350j(num3.intValue(), null, str6, str7, "del");
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[PHI: r2 r13 r14 r15
      0x00c8: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:32:0x00c5, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r13v6 com.lingq.core.database.entity.PlaylistEntity) = (r13v4 com.lingq.core.database.entity.PlaylistEntity), (r13v7 com.lingq.core.database.entity.PlaylistEntity) binds: [B:32:0x00c5, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r14v5 java.lang.String) = (r14v3 java.lang.String), (r14v6 java.lang.String) binds: [B:32:0x00c5, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r15v15 java.lang.Object) = (r15v14 java.lang.Object), (r15v1 java.lang.Object) binds: [B:32:0x00c5, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[PHI: r2 r13 r14
      0x00e3: PHI (r2v11 java.lang.String) = (r2v7 java.lang.String), (r2v9 java.lang.String), (r2v13 java.lang.String) binds: [B:30:0x00b1, B:35:0x00e0, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r13v8 com.lingq.core.database.entity.PlaylistEntity) = 
      (r13v4 com.lingq.core.database.entity.PlaylistEntity)
      (r13v6 com.lingq.core.database.entity.PlaylistEntity)
      (r13v9 com.lingq.core.database.entity.PlaylistEntity)
     binds: [B:30:0x00b1, B:35:0x00e0, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r14v7 java.lang.String) = (r14v3 java.lang.String), (r14v5 java.lang.String), (r14v12 java.lang.String) binds: [B:30:0x00b1, B:35:0x00e0, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[PHI: r13
      0x0104: PHI (r13v10 com.lingq.core.database.entity.PlaylistEntity) = (r13v8 com.lingq.core.database.entity.PlaylistEntity), (r13v11 com.lingq.core.database.entity.PlaylistEntity) binds: [B:41:0x0101, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r4 == r1) goto L47;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7364x(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$removePlaylistLocally$1 playlistRepositoryImpl$removePlaylistLocally$1;
        PlaylistEntity playlistEntity;
        Object objM15541t;
        String str3;
        PlaylistEntity playlistEntity2;
        LinkedHashMap linkedHashMapM15372Y;
        Object objM2861d;
        Object objM2861d2;
        if (continuationImpl instanceof PlaylistRepositoryImpl$removePlaylistLocally$1) {
            playlistRepositoryImpl$removePlaylistLocally$1 = (PlaylistRepositoryImpl$removePlaylistLocally$1) continuationImpl;
            int i = playlistRepositoryImpl$removePlaylistLocally$1.f16044f;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$removePlaylistLocally$1 = new PlaylistRepositoryImpl$removePlaylistLocally$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$removePlaylistLocally$1 = new PlaylistRepositoryImpl$removePlaylistLocally$1(this, continuationImpl);
        }
        Object objM2861d3 = playlistRepositoryImpl$removePlaylistLocally$1.f16042d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$removePlaylistLocally$1.f16044f;
        int i3 = 2;
        Object obj = xfa.f68157a;
        vma vmaVar = this.f16540i;
        C1322j c1322j = this.f16534c;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM2861d3);
                String strM23629f = vz1.m23629f(str2, str);
                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str;
                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 1;
                objM2861d3 = AbstractC0758a.m2861d(new ql4(strM23629f, 13), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, true, false);
                if (objM2861d3 != coroutineSingletons) {
                    playlistEntity = (PlaylistEntity) objM2861d3;
                    if (playlistEntity == null) {
                        return Boolean.FALSE;
                    }
                    c83 c83Var = ((C1371d) vmaVar).f18582s;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 2;
                    objM15541t = AbstractC3224d.m15541t(c83Var, playlistRepositoryImpl$removePlaylistLocally$1);
                    if (objM15541t != coroutineSingletons) {
                        str3 = str;
                        playlistEntity2 = playlistEntity;
                        objM2861d3 = objM15541t;
                        if (fa4.m11650l(((Map) objM2861d3).get(str3), playlistEntity2.m7793c())) {
                            String strM23629f2 = vz1.m23629f(str2, str3);
                            playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                            objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f2, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                            if (objM2861d != coroutineSingletons) {
                                objM2861d = obj;
                            }
                            if (objM2861d != coroutineSingletons) {
                                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                                c1322j.getClass();
                                objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                if (objM2861d2 == coroutineSingletons) {
                                    obj = objM2861d2;
                                }
                            }
                        } else {
                            c83 c83Var2 = ((C1371d) vmaVar).f18582s;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 3;
                            objM2861d3 = AbstractC3224d.m15541t(c83Var2, playlistRepositoryImpl$removePlaylistLocally$1);
                            if (objM2861d3 != coroutineSingletons) {
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM2861d3);
                                linkedHashMapM15372Y.remove(str3);
                                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 4;
                                if (((C1371d) vmaVar).m7970j(linkedHashMapM15372Y, playlistRepositoryImpl$removePlaylistLocally$1) != coroutineSingletons) {
                                    String strM23629f3 = vz1.m23629f(str2, str3);
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                                    objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f3, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                    if (objM2861d != coroutineSingletons) {
                                        objM2861d = obj;
                                    }
                                    if (objM2861d != coroutineSingletons) {
                                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                                        c1322j.getClass();
                                        objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                        if (objM2861d2 == coroutineSingletons) {
                                            obj = objM2861d2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                str2 = playlistRepositoryImpl$removePlaylistLocally$1.f16040b;
                str = playlistRepositoryImpl$removePlaylistLocally$1.f16039a;
                AbstractC3193b.m15359b(objM2861d3);
                playlistEntity = (PlaylistEntity) objM2861d3;
                if (playlistEntity == null) {
                    return Boolean.FALSE;
                }
                c83 c83Var3 = ((C1371d) vmaVar).f18582s;
                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str;
                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity;
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 2;
                objM15541t = AbstractC3224d.m15541t(c83Var3, playlistRepositoryImpl$removePlaylistLocally$1);
                if (objM15541t != coroutineSingletons) {
                    str3 = str;
                    playlistEntity2 = playlistEntity;
                    objM2861d3 = objM15541t;
                    if (fa4.m11650l(((Map) objM2861d3).get(str3), playlistEntity2.m7793c())) {
                        String strM23629f4 = vz1.m23629f(str2, str3);
                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                        objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f4, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                        if (objM2861d != coroutineSingletons) {
                            objM2861d = obj;
                        }
                        if (objM2861d != coroutineSingletons) {
                            playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                            c1322j.getClass();
                            objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                            if (objM2861d2 == coroutineSingletons) {
                                obj = objM2861d2;
                            }
                        }
                    } else {
                        c83 c83Var4 = ((C1371d) vmaVar).f18582s;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 3;
                        objM2861d3 = AbstractC3224d.m15541t(c83Var4, playlistRepositoryImpl$removePlaylistLocally$1);
                        if (objM2861d3 != coroutineSingletons) {
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM2861d3);
                            linkedHashMapM15372Y.remove(str3);
                            playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 4;
                            if (((C1371d) vmaVar).m7970j(linkedHashMapM15372Y, playlistRepositoryImpl$removePlaylistLocally$1) != coroutineSingletons) {
                                String strM23629f5 = vz1.m23629f(str2, str3);
                                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                                objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f5, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                if (objM2861d != coroutineSingletons) {
                                    objM2861d = obj;
                                }
                                if (objM2861d != coroutineSingletons) {
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                                    c1322j.getClass();
                                    objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                    if (objM2861d2 == coroutineSingletons) {
                                        obj = objM2861d2;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                playlistEntity2 = playlistRepositoryImpl$removePlaylistLocally$1.f16041c;
                str2 = playlistRepositoryImpl$removePlaylistLocally$1.f16040b;
                str3 = playlistRepositoryImpl$removePlaylistLocally$1.f16039a;
                AbstractC3193b.m15359b(objM2861d3);
                if (fa4.m11650l(((Map) objM2861d3).get(str3), playlistEntity2.m7793c())) {
                    c83 c83Var5 = ((C1371d) vmaVar).f18582s;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 3;
                    objM2861d3 = AbstractC3224d.m15541t(c83Var5, playlistRepositoryImpl$removePlaylistLocally$1);
                    if (objM2861d3 != coroutineSingletons) {
                        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM2861d3);
                        linkedHashMapM15372Y.remove(str3);
                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 4;
                        if (((C1371d) vmaVar).m7970j(linkedHashMapM15372Y, playlistRepositoryImpl$removePlaylistLocally$1) != coroutineSingletons) {
                            String strM23629f6 = vz1.m23629f(str2, str3);
                            playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                            playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                            objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f6, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                            if (objM2861d != coroutineSingletons) {
                                objM2861d = obj;
                            }
                            if (objM2861d != coroutineSingletons) {
                                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                                c1322j.getClass();
                                objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                                if (objM2861d2 == coroutineSingletons) {
                                    obj = objM2861d2;
                                }
                            }
                        }
                    }
                    break;
                } else {
                    String strM23629f7 = vz1.m23629f(str2, str3);
                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                    objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f7, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = obj;
                    }
                    if (objM2861d != coroutineSingletons) {
                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                        c1322j.getClass();
                        objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                        if (objM2861d2 == coroutineSingletons) {
                            obj = objM2861d2;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                playlistEntity2 = playlistRepositoryImpl$removePlaylistLocally$1.f16041c;
                str2 = playlistRepositoryImpl$removePlaylistLocally$1.f16040b;
                str3 = playlistRepositoryImpl$removePlaylistLocally$1.f16039a;
                AbstractC3193b.m15359b(objM2861d3);
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM2861d3);
                linkedHashMapM15372Y.remove(str3);
                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = str3;
                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = str2;
                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 4;
                if (((C1371d) vmaVar).m7970j(linkedHashMapM15372Y, playlistRepositoryImpl$removePlaylistLocally$1) != coroutineSingletons) {
                    String strM23629f8 = vz1.m23629f(str2, str3);
                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                    objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f8, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = obj;
                    }
                    if (objM2861d != coroutineSingletons) {
                        playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                        playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                        c1322j.getClass();
                        objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                        if (objM2861d2 == coroutineSingletons) {
                            obj = objM2861d2;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                playlistEntity2 = playlistRepositoryImpl$removePlaylistLocally$1.f16041c;
                str2 = playlistRepositoryImpl$removePlaylistLocally$1.f16040b;
                str3 = playlistRepositoryImpl$removePlaylistLocally$1.f16039a;
                AbstractC3193b.m15359b(objM2861d3);
                String strM23629f9 = vz1.m23629f(str2, str3);
                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = playlistEntity2;
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 5;
                objM2861d = AbstractC0758a.m2861d(new ql4(strM23629f9, 10), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = obj;
                }
                if (objM2861d != coroutineSingletons) {
                    playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                    playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                    c1322j.getClass();
                    objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                    if (objM2861d2 == coroutineSingletons) {
                        obj = objM2861d2;
                    }
                    break;
                }
                return coroutineSingletons;
            case 5:
                playlistEntity2 = playlistRepositoryImpl$removePlaylistLocally$1.f16041c;
                AbstractC3193b.m15359b(objM2861d3);
                playlistRepositoryImpl$removePlaylistLocally$1.f16039a = null;
                playlistRepositoryImpl$removePlaylistLocally$1.f16040b = null;
                playlistRepositoryImpl$removePlaylistLocally$1.f16041c = null;
                playlistRepositoryImpl$removePlaylistLocally$1.f16044f = 6;
                c1322j.getClass();
                objM2861d2 = AbstractC0758a.m2861d(new ed7(c1322j, playlistEntity2, i3), c1322j.f17045K, playlistRepositoryImpl$removePlaylistLocally$1, false, true);
                if (objM2861d2 == coroutineSingletons) {
                    obj = objM2861d2;
                }
                break;
            case 6:
                AbstractC3193b.m15359b(objM2861d3);
                return Boolean.TRUE;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7365y(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$setArchived$1 playlistRepositoryImpl$setArchived$1;
        if (continuationImpl instanceof PlaylistRepositoryImpl$setArchived$1) {
            playlistRepositoryImpl$setArchived$1 = (PlaylistRepositoryImpl$setArchived$1) continuationImpl;
            int i2 = playlistRepositoryImpl$setArchived$1.f16047c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$setArchived$1.f16047c = i2 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$setArchived$1 = new PlaylistRepositoryImpl$setArchived$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$setArchived$1 = new PlaylistRepositoryImpl$setArchived$1(this, continuationImpl);
        }
        Object objM21318i = playlistRepositoryImpl$setArchived$1.f16045a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = playlistRepositoryImpl$setArchived$1.f16047c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM21318i);
                se7 se7Var = this.f16537f;
                if (z) {
                    playlistRepositoryImpl$setArchived$1.f16047c = 1;
                    objM21318i = se7Var.m21310a(str, i, playlistRepositoryImpl$setArchived$1);
                    if (objM21318i == coroutineSingletons) {
                    }
                } else {
                    playlistRepositoryImpl$setArchived$1.f16047c = 2;
                    objM21318i = se7Var.m21318i(str, i, playlistRepositoryImpl$setArchived$1);
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                AbstractC3193b.m15359b(objM21318i);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM21318i);
            }
            return new xm5(xfa.f68157a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "PlaylistRepository: setArchived failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: z */
    public final Object m7366z(Integer num, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistRepositoryImpl$syncAddPlaylist$1 playlistRepositoryImpl$syncAddPlaylist$1;
        Integer num2;
        String str5;
        String str6;
        String str7;
        ResultPlaylistFolder resultPlaylistFolder;
        String str8;
        String strM23629f;
        int iM8382a;
        int iIntValue;
        if (continuationImpl instanceof PlaylistRepositoryImpl$syncAddPlaylist$1) {
            playlistRepositoryImpl$syncAddPlaylist$1 = (PlaylistRepositoryImpl$syncAddPlaylist$1) continuationImpl;
            int i = playlistRepositoryImpl$syncAddPlaylist$1.f16054g;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImpl$syncAddPlaylist$1.f16054g = i - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImpl$syncAddPlaylist$1 = new PlaylistRepositoryImpl$syncAddPlaylist$1(this, continuationImpl);
            }
        } else {
            playlistRepositoryImpl$syncAddPlaylist$1 = new PlaylistRepositoryImpl$syncAddPlaylist$1(this, continuationImpl);
        }
        PlaylistRepositoryImpl$syncAddPlaylist$1 playlistRepositoryImpl$syncAddPlaylist$2 = playlistRepositoryImpl$syncAddPlaylist$1;
        Object objM21320k = playlistRepositoryImpl$syncAddPlaylist$2.f16052e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistRepositoryImpl$syncAddPlaylist$2.f16054g;
        Object obj2 = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21320k);
            RequestPlaylistCreate requestPlaylistCreate = new RequestPlaylistCreate(str2, str3);
            playlistRepositoryImpl$syncAddPlaylist$2.f16048a = str;
            num2 = num;
            playlistRepositoryImpl$syncAddPlaylist$2.f16049b = num2;
            playlistRepositoryImpl$syncAddPlaylist$2.f16050c = str4;
            playlistRepositoryImpl$syncAddPlaylist$2.f16054g = 1;
            objM21320k = this.f16537f.m21320k(str, requestPlaylistCreate, playlistRepositoryImpl$syncAddPlaylist$2);
            if (objM21320k != obj) {
                str5 = str;
                str6 = str4;
            }
            return obj;
        }
        if (i2 == 1) {
            str6 = playlistRepositoryImpl$syncAddPlaylist$2.f16050c;
            num2 = playlistRepositoryImpl$syncAddPlaylist$2.f16049b;
            str5 = playlistRepositoryImpl$syncAddPlaylist$2.f16048a;
            AbstractC3193b.m15359b(objM21320k);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM21320k);
                    return obj2;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resultPlaylistFolder = playlistRepositoryImpl$syncAddPlaylist$2.f16051d;
            String str9 = playlistRepositoryImpl$syncAddPlaylist$2.f16050c;
            Integer num3 = playlistRepositoryImpl$syncAddPlaylist$2.f16049b;
            str8 = playlistRepositoryImpl$syncAddPlaylist$2.f16048a;
            AbstractC3193b.m15359b(objM21320k);
            str7 = str9;
            num2 = num3;
        }
        if (num2 != null && str7 != null) {
            strM23629f = vz1.m23629f(resultPlaylistFolder.m8383b(), str8);
            iM8382a = resultPlaylistFolder.m8382a();
            iIntValue = num2.intValue();
            playlistRepositoryImpl$syncAddPlaylist$2.f16048a = null;
            playlistRepositoryImpl$syncAddPlaylist$2.f16049b = null;
            playlistRepositoryImpl$syncAddPlaylist$2.f16050c = null;
            playlistRepositoryImpl$syncAddPlaylist$2.f16051d = null;
            playlistRepositoryImpl$syncAddPlaylist$2.f16054g = 3;
            if (m7345e(iM8382a, iIntValue, str8, strM23629f, str7, playlistRepositoryImpl$syncAddPlaylist$2) == obj) {
                return obj;
            }
        }
        return obj2;
        ResultPlaylistFolder resultPlaylistFolder2 = (ResultPlaylistFolder) objM21320k;
        String strM23629f2 = vz1.m23629f(resultPlaylistFolder2.m8383b(), str5);
        int iM8382a2 = resultPlaylistFolder2.m8382a();
        playlistRepositoryImpl$syncAddPlaylist$2.f16048a = str5;
        playlistRepositoryImpl$syncAddPlaylist$2.f16049b = num2;
        playlistRepositoryImpl$syncAddPlaylist$2.f16050c = str6;
        playlistRepositoryImpl$syncAddPlaylist$2.f16051d = resultPlaylistFolder2;
        playlistRepositoryImpl$syncAddPlaylist$2.f16054g = 2;
        Object objM2861d = AbstractC0758a.m2861d(new ld0(iM8382a2, strM23629f2, 29), this.f16534c.f17045K, playlistRepositoryImpl$syncAddPlaylist$2, false, true);
        if (objM2861d != obj) {
            objM2861d = obj2;
        }
        if (objM2861d != obj) {
            str7 = str6;
            resultPlaylistFolder = resultPlaylistFolder2;
            str8 = str5;
            if (num2 != null) {
                strM23629f = vz1.m23629f(resultPlaylistFolder.m8383b(), str8);
                iM8382a = resultPlaylistFolder.m8382a();
                iIntValue = num2.intValue();
                playlistRepositoryImpl$syncAddPlaylist$2.f16048a = null;
                playlistRepositoryImpl$syncAddPlaylist$2.f16049b = null;
                playlistRepositoryImpl$syncAddPlaylist$2.f16050c = null;
                playlistRepositoryImpl$syncAddPlaylist$2.f16051d = null;
                playlistRepositoryImpl$syncAddPlaylist$2.f16054g = 3;
                if (m7345e(iM8382a, iIntValue, str8, strM23629f, str7, playlistRepositoryImpl$syncAddPlaylist$2) == obj) {
                }
            }
            return obj2;
        }
        return obj;
    }
}
