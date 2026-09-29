package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.CheckableImageButton;
import com.lingq.core.web.WebViewFragment;
import com.lingq.feature.onboarding.auth.registration.C2193b;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.review.activities.ReviewActivityFlashcardFragment;
import com.lingq.feature.review.activities.ReviewActivityResultFragment;
import com.lingq.p020ui.AbstractC2891g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw6 implements js6, i02, yr6, gr6, h90, f68, f01, kk1, gp9, bm1, tr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36323b;

    public /* synthetic */ dw6(Object obj, int i) {
        this.f36322a = i;
        this.f36323b = obj;
    }

    @Override // p000.h90
    /* JADX INFO: renamed from: a */
    public void mo10699a(Object obj) {
        int i = this.f36322a;
        Object obj2 = this.f36323b;
        switch (i) {
            case 6:
                String str = (String) obj;
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                str.getClass();
                ((ReviewActivityFlashcardFragment) obj2).m9539U0().m9563Y2(str);
                break;
            default:
                String str2 = (String) obj;
                bh4[] bh4VarArr2 = ReviewActivityResultFragment.f32067H0;
                str2.getClass();
                ((ReviewActivityResultFragment) obj2).m9548U0().m9563Y2(str2);
                break;
        }
    }

    @Override // p000.kk1
    public void accept(Object obj) {
        ((c14) this.f36323b).m3157b((gs1) obj);
    }

    @Override // p000.f01
    /* JADX INFO: renamed from: b */
    public void mo10700b() {
        CheckableImageButton checkableImageButton = ((ug9) this.f36323b).f63901d;
        jfd.m14437e(checkableImageButton, checkableImageButton.getContentDescription());
    }

    /* JADX INFO: renamed from: c */
    public String m10701c(String str) {
        C3487q7 c3487q7 = (C3487q7) this.f36323b;
        l67 l67VarM15901d = l67.m15901d(dg4.m10329d(str, true));
        ce4 ce4Var = (ce4) c3487q7.f57333b;
        Context context = ((d74) ce4Var.f9968c).f35077a;
        g02 g02Var = (g02) ce4Var.f9969d;
        l67VarM15901d.m15902e(context, g02Var);
        if (!l67VarM15901d.m15904g(g02Var)) {
            ed4.f37055s.m21555D("Removing payload that is no longer allowed");
            l67VarM15901d = null;
        }
        if (l67VarM15901d != null) {
            return l67VarM15901d.m15905h().toString();
        }
        return null;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        ((CountDownLatch) this.f36323b).countDown();
        return null;
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        int i = this.f36322a;
        Object obj = this.f36323b;
        switch (i) {
            case 21:
                vxc.m23590b((Intent) obj);
                break;
            case 22:
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((h7b) obj).f41923b.m24140d(null);
                break;
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        int i = this.f36322a;
        Object obj2 = this.f36323b;
        switch (i) {
            case 0:
                ((C2193b) obj2).invoke(obj);
                break;
            case 9:
                ((C3445p2) obj2).invoke(obj);
                break;
            default:
                ((nka) obj2).invoke(obj);
                break;
        }
    }

    @Override // p000.f68
    /* JADX INFO: renamed from: h */
    public void mo10702h(long j, k47 k47Var) {
        int i = this.f36322a;
        eu8 eu8Var = (eu8) this.f36323b;
        switch (i) {
            case 8:
                n5d.m17243a(j, k47Var, eu8Var.f37871c);
                break;
            default:
                n5d.m17244b(j, k47Var, eu8Var.f37871c);
                break;
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        int i = this.f36322a;
        Object obj = this.f36323b;
        switch (i) {
            case 4:
                AbstractC2891g.m9818b("launchReviewFlow FAILED -> opening Play Store listing", exc);
                AbstractC2891g.m9819c((Activity) obj);
                break;
            default:
                vi3 vi3Var = (vi3) obj;
                String message = exc.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                vi3Var.invoke("Google sign-in failed: ".concat(message));
                break;
        }
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        int i = this.f36322a;
        Object obj = this.f36323b;
        switch (i) {
            case 17:
                hk8 hk8Var = (hk8) obj;
                long jMo100g = hk8Var.f42544b.mo100g() - hk8Var.f42546d.f50557d;
                SQLiteDatabase sQLiteDatabaseM13313a = hk8Var.m13313a();
                sQLiteDatabaseM13313a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jMo100g)};
                    Cursor cursorRawQuery = sQLiteDatabaseM13313a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hk8Var.m13316n(cursorRawQuery.getInt(0), LogEventDropped$Reason.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM13313a.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM13313a.setTransactionSuccessful();
                    sQLiteDatabaseM13313a.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM13313a.endTransaction();
                    throw th2;
                }
            default:
                ny8 ny8Var = (ny8) obj;
                Iterator it = ((Iterable) ((hk8) ny8Var.f53415c).m13314c(new ij6(20))).iterator();
                while (it.hasNext()) {
                    ((C3309ls) ny8Var.f53416d).m16493M((q50) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: p */
    public j02 mo10703p() {
        return (h33) this.f36323b;
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        int i = this.f36322a;
        Object obj = this.f36323b;
        switch (i) {
            case 5:
                ReaderFragment readerFragment = (ReaderFragment) obj;
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                view.getClass();
                l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
                l64VarMo136i.getClass();
                FrameLayout frameLayout = readerFragment.m9288U0().f66692M;
                int i2 = l64VarMo136i.f49117b;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), i2, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                RelativeLayout relativeLayout = readerFragment.m9288U0().f66705k;
                int i3 = l64VarMo136i.f49119d;
                relativeLayout.setPadding(relativeLayout.getPaddingLeft(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), i3);
                LinearLayout linearLayout = readerFragment.m9288U0().f66707m.f34899a;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), i2, linearLayout.getPaddingRight(), i3);
                RelativeLayout relativeLayout2 = (RelativeLayout) readerFragment.m9288U0().f66704j.f34379c;
                ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
                if (layoutParams == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.bottomMargin = i3;
                relativeLayout2.setLayoutParams(marginLayoutParams);
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    viewGroup.getChildAt(i4).dispatchApplyWindowInsets(f6bVar.m11575f());
                }
                return f6bVar;
            case 13:
                jp9 jp9Var = (jp9) obj;
                ArrayList arrayList = jp9Var.f45973b;
                c6b c6bVar = f6bVar.f38536a;
                l64 l64VarM15829b = l64.m15829b(c6bVar.mo136i(519), c6bVar.mo136i(64));
                l64 l64VarM15829b2 = l64.m15829b(c6bVar.mo137j(519), c6bVar.mo137j(64));
                if (!l64VarM15829b.equals(jp9Var.f45974c) || !l64VarM15829b2.equals(jp9Var.f45975d)) {
                    jp9Var.f45974c = l64VarM15829b;
                    jp9Var.f45975d = l64VarM15829b2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        yn7 yn7Var = (yn7) arrayList.get(size);
                        yn7Var.f70112c = l64VarM15829b;
                        yn7Var.f70113d = l64VarM15829b2;
                        yn7Var.m25214c();
                    }
                }
                return f6bVar;
            case 16:
                view.getClass();
                l64 l64VarMo136i2 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i2.getClass();
                Rect rect = ((b6a) obj).f8023b;
                rect.top -= l64VarMo136i2.f49117b;
                rect.bottom -= l64VarMo136i2.f49119d;
                return f6bVar;
            default:
                bh4[] bh4VarArr2 = WebViewFragment.f24315V0;
                view.getClass();
                l64 l64VarMo136i3 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i3.getClass();
                WebView webView = ((WebViewFragment) obj).m8805A0().f51281c;
                ViewGroup.LayoutParams layoutParams2 = webView.getLayoutParams();
                if (layoutParams2 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = l64VarMo136i3.f49119d;
                webView.setLayoutParams(marginLayoutParams2);
                return f6b.f38535b;
        }
    }
}
