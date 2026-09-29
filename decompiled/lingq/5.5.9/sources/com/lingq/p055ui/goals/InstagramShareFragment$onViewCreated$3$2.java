package com.lingq.p055ui.goals;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.media.session.C0166e;
import android.widget.Toast;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$2", m19206f = "InstagramShareFragment.kt", m19207l = {138}, m19208m = "invokeSuspend")
public final class InstagramShareFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22638e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InstagramShareFragment f22639f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "title", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.InstagramShareFragment$onViewCreated$3$2$1", m19206f = "InstagramShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34591 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22640e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InstagramShareFragment f22641f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34591(InstagramShareFragment instagramShareFragment, InterfaceC9968c<? super C34591> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22641f = instagramShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34591 c34591 = new C34591(this.f22641f, interfaceC9968c);
            c34591.f22640e = obj;
            return c34591;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34591) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            OutputStream fileOutputStream;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f22640e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
            int i10 = Build.VERSION.SDK_INT;
            InstagramShareFragment instagramShareFragment = this.f22641f;
            if (i10 >= 29) {
                ContentResolver contentResolver = instagramShareFragment.m3578a0().getContentResolver();
                C5207g.m11110e(contentResolver, "requireContext().contentResolver");
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", "image/png");
                contentValues.put("relative_path", "DCIM/LingQ");
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                fileOutputStream = uriInsert != null ? contentResolver.openOutputStream(uriInsert) : null;
            } else {
                instagramShareFragment.getClass();
                String strM21i = C0009a.m21i(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString(), File.separator, "LingQ");
                File file = new File(strM21i);
                if (!file.exists()) {
                    file.mkdir();
                }
                fileOutputStream = new FileOutputStream(new File(strM21i, C0166e.m765k(str, ".png")));
            }
            if (fileOutputStream != null) {
                try {
                    Bitmap bitmap = instagramShareFragment.f22622T0;
                    if (bitmap != null) {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    }
                    Toast.makeText(instagramShareFragment.m3578a0(), instagramShareFragment.m3600t(R.string.share_saved_image), 0).show();
                    C9072e c9072e = C9072e.f47360a;
                    C5206f.m11032z0(fileOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramShareFragment$onViewCreated$3$2(InstagramShareFragment instagramShareFragment, InterfaceC9968c<? super InstagramShareFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22639f = instagramShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InstagramShareFragment$onViewCreated$3$2(this.f22639f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InstagramShareFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22638e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = InstagramShareFragment.f22618V0;
            InstagramShareFragment instagramShareFragment = this.f22639f;
            InstagramShareViewModel instagramShareViewModelM9764v0 = instagramShareFragment.m9764v0();
            C34591 c34591 = new C34591(instagramShareFragment, null);
            this.f22638e = 1;
            if (C0062b.m369m0(instagramShareViewModelM9764v0.f22652h, c34591, this) == coroutineSingletons) {
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
