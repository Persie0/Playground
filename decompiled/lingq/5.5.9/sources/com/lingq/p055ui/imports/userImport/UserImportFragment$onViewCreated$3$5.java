package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.content.Context;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import fj.C5546g;
import java.util.ArrayList;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7142w;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$5", m19206f = "UserImportFragment.kt", m19207l = {136}, m19208m = "invokeSuspend")
public final class UserImportFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportFragment f26611f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lfj/g;", "userImportData", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$5$1", m19206f = "UserImportFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40921 extends SuspendLambda implements InterfaceC2056p<C5546g, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26612e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportFragment f26613f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40921(UserImportFragment userImportFragment, InterfaceC9968c<? super C40921> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26613f = userImportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40921 c40921 = new C40921(this.f26613f, interfaceC9968c);
            c40921.f26612e = obj;
            return c40921;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C5546g c5546g, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40921) mo1336a(c5546g, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LearningLevel learningLevel;
            boolean zM10425D;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C5546g c5546g = (C5546g) this.f26612e;
            boolean zM15250P2 = C7661i.m15250P2(c5546g.f34280a);
            UserImportFragment userImportFragment = this.f26613f;
            if (zM15250P2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportFragment.f26580E0;
                userImportFragment.m10090q0().f26808g.mo10085v0(new C5546g(userImportFragment.m10090q0().mo498E1(), 126));
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = UserImportFragment.f26580E0;
                UserImportViewModel userImportViewModelM10090q0 = userImportFragment.m10090q0();
                Context contextM3578a0 = userImportFragment.m3578a0();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AbstractC7787n.m(R.string.lingq_language));
                boolean z10 = true;
                arrayList.add(new AbstractC7787n.h(null, C4924a.m10439R(contextM3578a0, c5546g.f34280a), ViewKeys.UserImportLanguage.ordinal(), 1));
                arrayList.add(new AbstractC7787n.m(R.string.imports_title));
                arrayList.add(new AbstractC7787n.h(null, c5546g.f34281b, ViewKeys.UserImportTitle.ordinal(), 1));
                arrayList.add(new AbstractC7787n.m(R.string.lingq_course));
                arrayList.add(new AbstractC7787n.h(null, c5546g.f34282c, ViewKeys.UserImportCourse.ordinal(), 1));
                arrayList.add(new AbstractC7787n.m(R.string.search_level));
                LearningLevel[] learningLevelArrValues = LearningLevel.values();
                int length = learningLevelArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        learningLevel = null;
                        break;
                    }
                    learningLevel = learningLevelArrValues[i10];
                    if (C5207g.m11106a(learningLevel.getServerName(), c5546g.f34283d)) {
                        break;
                    }
                    i10++;
                }
                if (learningLevel == null) {
                    learningLevel = LearningLevel.Beginner1;
                }
                arrayList.add(new AbstractC7787n.h(null, C4924a.m10434M(learningLevel, contextM3578a0), ViewKeys.UserImportLevel.ordinal(), 1));
                arrayList.add(new AbstractC7787n.m(R.string.feed_source));
                arrayList.add(new AbstractC7787n.h(null, c5546g.f34284e, ViewKeys.UserImportSource.ordinal(), 1));
                arrayList.add(new AbstractC7787n.m(C5207g.m11106a(c5546g.f34284e, "URL") ? R.string.user_import_url : R.string.user_import_text));
                arrayList.add(new AbstractC7787n.h(null, C5207g.m11106a(userImportViewModelM10090q0.mo10080T1().getValue().f34284e, "URL") ? c5546g.f34285f : c5546g.f34286g, ViewKeys.UserImportContent.ordinal(), 1));
                userImportViewModelM10090q0.f26811j.setValue(arrayList);
                UserImportViewModel userImportViewModelM10090q1 = userImportFragment.m10090q0();
                if (C5207g.m11106a(c5546g.f34284e, "URL")) {
                    zM10425D = C4924a.m10425D(c5546g.f34285f);
                } else {
                    zM10425D = !C7661i.m15250P2(c5546g.f34286g);
                }
                if (!(C5207g.m11106a(c5546g.f34284e, "URL") || !C7661i.m15250P2(c5546g.f34281b)) || !(!C7661i.m15250P2(c5546g.f34280a)) || !(!C7661i.m15250P2(c5546g.f34282c)) || !(!C7661i.m15250P2(c5546g.f34283d)) || !(!C7661i.m15250P2(c5546g.f34284e)) || !zM10425D) {
                    z10 = false;
                }
                userImportViewModelM10090q1.f26797K.setValue(Boolean.valueOf(z10));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportFragment$onViewCreated$3$5(UserImportFragment userImportFragment, InterfaceC9968c<? super UserImportFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26611f = userImportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportFragment$onViewCreated$3$5(this.f26611f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26610e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportFragment.f26580E0;
            UserImportFragment userImportFragment = this.f26611f;
            InterfaceC7142w<C5546g> interfaceC7142wMo10080T1 = userImportFragment.m10090q0().mo10080T1();
            C40921 c40921 = new C40921(userImportFragment, null);
            this.f26610e = 1;
            if (C0062b.m369m0(interfaceC7142wMo10080T1, c40921, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
