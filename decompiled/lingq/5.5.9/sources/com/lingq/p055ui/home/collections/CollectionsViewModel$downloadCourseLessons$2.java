package com.lingq.p055ui.home.collections;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonAudio;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$downloadCourseLessons$2", m19206f = "CollectionsViewModel.kt", m19207l = {670, 677, 687}, m19208m = "invokeSuspend")
final class CollectionsViewModel$downloadCourseLessons$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CollectionsViewModel f23316e;

    /* JADX INFO: renamed from: f */
    public Iterator f23317f;

    /* JADX INFO: renamed from: g */
    public LessonAudio f23318g;

    /* JADX INFO: renamed from: h */
    public String f23319h;

    /* JADX INFO: renamed from: i */
    public int f23320i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List<LessonAudio> f23321j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CollectionsViewModel f23322k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$downloadCourseLessons$2(CollectionsViewModel collectionsViewModel, List list, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23321j = list;
        this.f23322k = collectionsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$downloadCourseLessons$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$downloadCourseLessons$2(this.f23322k, this.f23321j, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099 A[PHI: r8
      0x0099: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v7 java.lang.String), (r8v8 java.lang.String) binds: [B:43:0x0093, B:45:0x0096, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116 A[PHI: r6 r8 r15
      0x0116: PHI (r6v4 com.lingq.ui.home.collections.CollectionsViewModel) = (r6v1 com.lingq.ui.home.collections.CollectionsViewModel), (r6v6 com.lingq.ui.home.collections.CollectionsViewModel) binds: [B:58:0x00cf, B:67:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r8v14 com.lingq.ui.home.collections.CollectionsViewModel$downloadCourseLessons$2) = 
      (r8v0 com.lingq.ui.home.collections.CollectionsViewModel$downloadCourseLessons$2)
      (r8v15 com.lingq.ui.home.collections.CollectionsViewModel$downloadCourseLessons$2)
     binds: [B:58:0x00cf, B:67:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r15v6 java.util.Iterator) = (r15v3 java.util.Iterator), (r15v7 java.util.Iterator) binds: [B:58:0x00cf, B:67:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00cf -> B:68:0x0116). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.collections.CollectionsViewModel$downloadCourseLessons$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
