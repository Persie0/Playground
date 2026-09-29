package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.view.C0782a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$4", m19206f = "StatsShareFragment.kt", m19207l = {144}, m19208m = "invokeSuspend")
public final class StatsShareFragment$onViewCreated$3$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24419e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareFragment f24420f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "languageCode", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$4$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37341 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24421e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37341(StatsShareFragment statsShareFragment, InterfaceC9968c<? super C37341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24422f = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37341 c37341 = new C37341(this.f24422f, interfaceC9968c);
            c37341.f24421e = obj;
            return c37341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37341) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Uri uriMo2961b;
            OutputStream fileOutputStream;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f24421e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24422f;
            LinearLayout linearLayout = statsShareFragment.m9921u0().f45309c;
            C5207g.m11110e(linearLayout, "binding.llStats");
            String strM10439R = C4924a.m10439R(statsShareFragment.m3578a0(), str);
            List<Integer> list = C6716m.f37937a;
            linearLayout.setBackgroundColor(C6716m.m13333r(R.attr.backgroundCardColor, statsShareFragment.m3578a0()));
            String str2 = strM10439R + " " + ((Object) DateFormat.format("MM-dd-yyyy hh:mm:ss", new Date()));
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentResolver contentResolver = statsShareFragment.m3578a0().getContentResolver();
                    C5207g.m11110e(contentResolver, "requireContext().contentResolver");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str2);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("relative_path", "DCIM/LingQ");
                    uriMo2961b = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriMo2961b != null) {
                        fileOutputStream = contentResolver.openOutputStream(uriMo2961b);
                    } else {
                        uriMo2961b = null;
                        fileOutputStream = null;
                    }
                } else {
                    String str3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString() + File.separator + "LingQ";
                    File file = new File(str3);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File file2 = new File(str3, str2 + ".jpeg");
                    uriMo2961b = FileProvider.m2957a(statsShareFragment.m3578a0(), statsShareFragment.m3578a0().getPackageName() + ".provider").mo2961b(file2);
                    fileOutputStream = new FileOutputStream(file2);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(C0782a.m2979a(linearLayout));
                C5207g.m11110e(bitmapCreateBitmap, "createBitmap(view.drawToBitmap())");
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    linearLayout.setBackgroundColor(0);
                    C9072e c9072e = C9072e.f47360a;
                    C5206f.m11032z0(fileOutputStream, null);
                    if (uriMo2961b != null) {
                        String str4 = strM10439R + " Stats";
                        try {
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("image/*");
                            intent.putExtra("android.intent.extra.STREAM", uriMo2961b);
                            statsShareFragment.m3595l0(Intent.createChooser(intent, str4));
                        } catch (Exception unused) {
                            Toast.makeText(statsShareFragment.m3578a0(), "Couldn't share stats", 0).show();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C5206f.m11032z0(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(statsShareFragment.m3578a0(), "Couldn't share stats", 0).show();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$4(StatsShareFragment statsShareFragment, InterfaceC9968c<? super StatsShareFragment$onViewCreated$3$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24420f = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareFragment$onViewCreated$3$4(this.f24420f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareFragment$onViewCreated$3$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24419e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24420f;
            StatsShareViewModel statsShareViewModelM9922v0 = statsShareFragment.m9922v0();
            C37341 c37341 = new C37341(statsShareFragment, null);
            this.f24419e = 1;
            if (C0062b.m369m0(statsShareViewModelM9922v0.f24445j, c37341, this) == coroutineSingletons) {
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
