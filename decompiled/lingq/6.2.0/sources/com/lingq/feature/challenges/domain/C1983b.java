package com.lingq.feature.challenges.domain;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.d65;
import p000.ef0;
import p000.gha;
import p000.h14;
import p000.i14;
import p000.i88;
import p000.j14;
import p000.k14;
import p000.m88;
import p000.nm7;
import p000.ob1;
import p000.qm7;
import p000.vk9;
import p000.vz1;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.feature.challenges.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1983b {
    private static final h14 Companion = new h14();

    /* JADX INFO: renamed from: a */
    public final d65 f24755a;

    /* JADX INFO: renamed from: b */
    public final C1984c f24756b;

    /* JADX INFO: renamed from: c */
    public final nm7 f24757c;

    /* JADX INFO: renamed from: d */
    public final ob1 f24758d;

    public C1983b(d65 d65Var, C1984c c1984c, nm7 nm7Var, ob1 ob1Var) {
        d65Var.getClass();
        nm7Var.getClass();
        ob1Var.getClass();
        this.f24755a = d65Var;
        this.f24756b = c1984c;
        this.f24757c = nm7Var;
        this.f24758d = ob1Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        if (r0 == r3) goto L51;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8847a(String str, String str2, String str3, byte[] bArr, boolean z, Integer num, boolean z2, boolean z3, ContinuationImpl continuationImpl) throws Throwable {
        ImportBookChallengeBookUseCase$invoke$1 importBookChallengeBookUseCase$invoke$1;
        String str4;
        m88 m88Var;
        String str5;
        byte[] bArr2;
        boolean z4;
        String str6;
        boolean z5;
        String str7;
        Integer num2;
        boolean z6;
        ImportBookChallengeBookUseCase$invoke$1 importBookChallengeBookUseCase$invoke$2;
        String str8;
        boolean z7;
        boolean z8;
        ProfileAccount profileAccount;
        Integer num3;
        Lesson lesson;
        boolean z9;
        String str9;
        Lesson lesson2;
        if (continuationImpl instanceof ImportBookChallengeBookUseCase$invoke$1) {
            importBookChallengeBookUseCase$invoke$1 = (ImportBookChallengeBookUseCase$invoke$1) continuationImpl;
            int i = importBookChallengeBookUseCase$invoke$1.f24736H;
            if ((i & Integer.MIN_VALUE) != 0) {
                importBookChallengeBookUseCase$invoke$1.f24736H = i - Integer.MIN_VALUE;
            } else {
                importBookChallengeBookUseCase$invoke$1 = new ImportBookChallengeBookUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            importBookChallengeBookUseCase$invoke$1 = new ImportBookChallengeBookUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = importBookChallengeBookUseCase$invoke$1.f24747k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = importBookChallengeBookUseCase$invoke$1.f24736H;
        nm7 nm7Var = this.f24757c;
        String str10 = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM15541t);
                qm7 qm7Var = ((C1369b) nm7Var).f18481n;
                importBookChallengeBookUseCase$invoke$1.f24737a = str;
                str5 = str2;
                importBookChallengeBookUseCase$invoke$1.f24738b = str5;
                importBookChallengeBookUseCase$invoke$1.f24739c = str3;
                bArr2 = bArr;
                importBookChallengeBookUseCase$invoke$1.f24740d = bArr2;
                importBookChallengeBookUseCase$invoke$1.f24741e = num;
                importBookChallengeBookUseCase$invoke$1.f24744h = z;
                z4 = z2;
                importBookChallengeBookUseCase$invoke$1.f24745i = z4;
                importBookChallengeBookUseCase$invoke$1.f24746j = z3;
                importBookChallengeBookUseCase$invoke$1.f24736H = 1;
                objM15541t = AbstractC3224d.m15541t(qm7Var, importBookChallengeBookUseCase$invoke$1);
                if (objM15541t != coroutineSingletons) {
                    str6 = str;
                    z5 = z3;
                    str7 = str3;
                    num2 = num;
                    z6 = z;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                z5 = importBookChallengeBookUseCase$invoke$1.f24746j;
                boolean z10 = importBookChallengeBookUseCase$invoke$1.f24745i;
                z6 = importBookChallengeBookUseCase$invoke$1.f24744h;
                num2 = importBookChallengeBookUseCase$invoke$1.f24741e;
                byte[] bArr3 = importBookChallengeBookUseCase$invoke$1.f24740d;
                str7 = importBookChallengeBookUseCase$invoke$1.f24739c;
                str5 = importBookChallengeBookUseCase$invoke$1.f24738b;
                str6 = importBookChallengeBookUseCase$invoke$1.f24737a;
                AbstractC3193b.m15359b(objM15541t);
                z4 = z10;
                bArr2 = bArr3;
            } else {
                if (i2 == 2) {
                    z5 = importBookChallengeBookUseCase$invoke$1.f24746j;
                    z8 = importBookChallengeBookUseCase$invoke$1.f24745i;
                    z7 = importBookChallengeBookUseCase$invoke$1.f24744h;
                    profileAccount = importBookChallengeBookUseCase$invoke$1.f24742f;
                    num2 = importBookChallengeBookUseCase$invoke$1.f24741e;
                    String str11 = importBookChallengeBookUseCase$invoke$1.f24738b;
                    str8 = importBookChallengeBookUseCase$invoke$1.f24737a;
                    AbstractC3193b.m15359b(objM15541t);
                    importBookChallengeBookUseCase$invoke$2 = importBookChallengeBookUseCase$invoke$1;
                    str5 = str11;
                    num3 = num2;
                    lesson = (Lesson) objM15541t;
                    if (lesson == null) {
                        return new i14(null);
                    }
                    profileAccount.f19687k++;
                    importBookChallengeBookUseCase$invoke$2.f24737a = str8;
                    importBookChallengeBookUseCase$invoke$2.f24738b = str5;
                    importBookChallengeBookUseCase$invoke$2.f24739c = null;
                    importBookChallengeBookUseCase$invoke$2.f24740d = null;
                    importBookChallengeBookUseCase$invoke$2.f24741e = num3;
                    importBookChallengeBookUseCase$invoke$2.f24742f = null;
                    importBookChallengeBookUseCase$invoke$2.f24743g = lesson;
                    importBookChallengeBookUseCase$invoke$2.f24744h = z7;
                    importBookChallengeBookUseCase$invoke$2.f24745i = z8;
                    importBookChallengeBookUseCase$invoke$2.f24746j = z5;
                    importBookChallengeBookUseCase$invoke$2.f24736H = 3;
                    if (((C1369b) nm7Var).m7921h(profileAccount, importBookChallengeBookUseCase$invoke$2) != coroutineSingletons) {
                        z9 = z8;
                        str9 = str8;
                        lesson2 = lesson;
                        gha ghaVar = new gha(lesson2.f19149h, num3, z9, z5);
                        importBookChallengeBookUseCase$invoke$2.f24737a = null;
                        importBookChallengeBookUseCase$invoke$2.f24738b = null;
                        importBookChallengeBookUseCase$invoke$2.f24739c = null;
                        importBookChallengeBookUseCase$invoke$2.f24740d = null;
                        importBookChallengeBookUseCase$invoke$2.f24741e = null;
                        importBookChallengeBookUseCase$invoke$2.f24742f = null;
                        importBookChallengeBookUseCase$invoke$2.f24743g = null;
                        importBookChallengeBookUseCase$invoke$2.f24744h = z7;
                        importBookChallengeBookUseCase$invoke$2.f24745i = z9;
                        importBookChallengeBookUseCase$invoke$2.f24746j = z5;
                        importBookChallengeBookUseCase$invoke$2.f24736H = 4;
                        objM15541t = this.f24756b.m8848a(str9, str5, ghaVar, importBookChallengeBookUseCase$invoke$2);
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    z5 = importBookChallengeBookUseCase$invoke$1.f24746j;
                    z9 = importBookChallengeBookUseCase$invoke$1.f24745i;
                    boolean z11 = importBookChallengeBookUseCase$invoke$1.f24744h;
                    lesson2 = importBookChallengeBookUseCase$invoke$1.f24743g;
                    num3 = importBookChallengeBookUseCase$invoke$1.f24741e;
                    String str12 = importBookChallengeBookUseCase$invoke$1.f24738b;
                    str9 = importBookChallengeBookUseCase$invoke$1.f24737a;
                    AbstractC3193b.m15359b(objM15541t);
                    str5 = str12;
                    z7 = z11;
                    importBookChallengeBookUseCase$invoke$2 = importBookChallengeBookUseCase$invoke$1;
                    gha ghaVar2 = new gha(lesson2.f19149h, num3, z9, z5);
                    importBookChallengeBookUseCase$invoke$2.f24737a = null;
                    importBookChallengeBookUseCase$invoke$2.f24738b = null;
                    importBookChallengeBookUseCase$invoke$2.f24739c = null;
                    importBookChallengeBookUseCase$invoke$2.f24740d = null;
                    importBookChallengeBookUseCase$invoke$2.f24741e = null;
                    importBookChallengeBookUseCase$invoke$2.f24742f = null;
                    importBookChallengeBookUseCase$invoke$2.f24743g = null;
                    importBookChallengeBookUseCase$invoke$2.f24744h = z7;
                    importBookChallengeBookUseCase$invoke$2.f24745i = z9;
                    importBookChallengeBookUseCase$invoke$2.f24746j = z5;
                    importBookChallengeBookUseCase$invoke$2.f24736H = 4;
                    objM15541t = this.f24756b.m8848a(str9, str5, ghaVar2, importBookChallengeBookUseCase$invoke$2);
                } else {
                    if (i2 != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(objM15541t);
                }
            }
            return new k14((ef0) objM15541t);
            ProfileAccount profileAccount2 = (ProfileAccount) objM15541t;
            if (!z6 && profileAccount2.f19687k >= 5) {
                return j14.f44895a;
            }
            d65 d65Var = this.f24755a;
            String strM23372H0 = vk9.m23372H0(str7);
            int i3 = Integer.parseInt(LearningLevel.Beginner1.getServerName());
            List listM23604J = vz1.m23604J("Book");
            importBookChallengeBookUseCase$invoke$1.f24737a = str6;
            importBookChallengeBookUseCase$invoke$1.f24738b = str5;
            importBookChallengeBookUseCase$invoke$1.f24739c = null;
            importBookChallengeBookUseCase$invoke$1.f24740d = null;
            importBookChallengeBookUseCase$invoke$1.f24741e = num2;
            importBookChallengeBookUseCase$invoke$1.f24742f = profileAccount2;
            importBookChallengeBookUseCase$invoke$1.f24744h = z6;
            importBookChallengeBookUseCase$invoke$1.f24745i = z4;
            importBookChallengeBookUseCase$invoke$1.f24746j = z5;
            try {
                importBookChallengeBookUseCase$invoke$1.f24736H = 2;
                str10 = null;
                ImportBookChallengeBookUseCase$invoke$1 importBookChallengeBookUseCase$invoke$3 = importBookChallengeBookUseCase$invoke$1;
                String str13 = str6;
                Object objM7249G = ((C1295k) d65Var).m7249G(str13, null, str7, strM23372H0, bArr2, i3, listM23604J, importBookChallengeBookUseCase$invoke$3);
                importBookChallengeBookUseCase$invoke$2 = importBookChallengeBookUseCase$invoke$3;
                if (objM7249G != coroutineSingletons) {
                    str8 = str13;
                    z7 = z6;
                    z8 = z4;
                    profileAccount = profileAccount2;
                    objM15541t = objM7249G;
                    num3 = num2;
                    lesson = (Lesson) objM15541t;
                    if (lesson == null) {
                        return new i14(null);
                    }
                    profileAccount.f19687k++;
                    importBookChallengeBookUseCase$invoke$2.f24737a = str8;
                    importBookChallengeBookUseCase$invoke$2.f24738b = str5;
                    importBookChallengeBookUseCase$invoke$2.f24739c = null;
                    importBookChallengeBookUseCase$invoke$2.f24740d = null;
                    importBookChallengeBookUseCase$invoke$2.f24741e = num3;
                    importBookChallengeBookUseCase$invoke$2.f24742f = null;
                    importBookChallengeBookUseCase$invoke$2.f24743g = lesson;
                    importBookChallengeBookUseCase$invoke$2.f24744h = z7;
                    importBookChallengeBookUseCase$invoke$2.f24745i = z8;
                    importBookChallengeBookUseCase$invoke$2.f24746j = z5;
                    importBookChallengeBookUseCase$invoke$2.f24736H = 3;
                    if (((C1369b) nm7Var).m7921h(profileAccount, importBookChallengeBookUseCase$invoke$2) != coroutineSingletons) {
                        z9 = z8;
                        str9 = str8;
                        lesson2 = lesson;
                        gha ghaVar3 = new gha(lesson2.f19149h, num3, z9, z5);
                        importBookChallengeBookUseCase$invoke$2.f24737a = null;
                        importBookChallengeBookUseCase$invoke$2.f24738b = null;
                        importBookChallengeBookUseCase$invoke$2.f24739c = null;
                        importBookChallengeBookUseCase$invoke$2.f24740d = null;
                        importBookChallengeBookUseCase$invoke$2.f24741e = null;
                        importBookChallengeBookUseCase$invoke$2.f24742f = null;
                        importBookChallengeBookUseCase$invoke$2.f24743g = null;
                        importBookChallengeBookUseCase$invoke$2.f24744h = z7;
                        importBookChallengeBookUseCase$invoke$2.f24745i = z9;
                        importBookChallengeBookUseCase$invoke$2.f24746j = z5;
                        importBookChallengeBookUseCase$invoke$2.f24736H = 4;
                        objM15541t = this.f24756b.m8848a(str9, str5, ghaVar3, importBookChallengeBookUseCase$invoke$2);
                    }
                }
                return coroutineSingletons;
            } catch (HttpException e) {
                e = e;
                str4 = null;
                i88 i88Var = e.f59170b;
                String strM16682n = (i88Var == null || (m88Var = i88Var.f43691c) == null) ? str4 : m88Var.m16682n();
                if (strM16682n == null) {
                    strM16682n = "";
                }
                this.f24758d.getClass();
                return new i14(ob1.m17887e(strM16682n));
            }
        } catch (HttpException e2) {
            e = e2;
            str4 = str10;
        }
    }
}
