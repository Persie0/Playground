package p000;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsv extends AbstractC0806ls {

    /* JADX INFO: renamed from: d */
    public int f29462d;

    /* JADX INFO: renamed from: e */
    private final List f29463e;

    /* JADX INFO: renamed from: f */
    private final int f29464f;

    public hsv(List list, int i) {
        this.f29463e = list;
        this.f29464f = i;
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: a */
    public final int mo1762a() {
        return this.f29463e.size();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: aU */
    public final /* bridge */ /* synthetic */ void mo10719aU(C0829mo c0829mo) {
        final hsy hsyVar = (hsy) c0829mo;
        hsu hsuVar = hsyVar.f29477y;
        hsuVar.getClass();
        int i = 0;
        for (View view : hsyVar.f29473u) {
            EduImageView eduImageView = (EduImageView) view.findViewById(C0100R.id.gif_sxs);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0100R.id.linearlayout_caption);
            if (((mrm) ((ihk) hsuVar.f29458d.get(i)).f30967b).mo16813g()) {
                eduImageView.m4363e((String) ((mrm) ((ihk) hsuVar.f29458d.get(i)).f30967b).mo16809c(), (String) hsuVar.f29459e, new jfo(linearLayout, eduImageView));
                i++;
            } else if (((mrm) ((ihk) hsuVar.f29458d.get(i)).f30966a).mo16813g()) {
                eduImageView.m4361b((Drawable) ((mrm) ((ihk) hsuVar.f29458d.get(i)).f30966a).mo16809c(), (String) hsuVar.f29460f);
                i++;
            }
        }
        final AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        hsyVar.f29476x.setOnScrollChangeListener(new View.OnScrollChangeListener(ambientController, bArr, bArr2, bArr3, bArr4) { // from class: hsx

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AmbientModeSupport.AmbientController f29469b;

            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i2, int i3, int i4, int i5) {
                hsy hsyVar2 = this.f29468a;
                AmbientModeSupport.AmbientController ambientController2 = this.f29469b;
                int width = hsyVar2.f29476x.getChildAt(0).getWidth() - hsyVar2.f29476x.getWidth();
                float scrollX = hsyVar2.f29476x.getScrollX();
                hsv hsvVar = (hsv) ambientController2.f1702a;
                hsvVar.f29462d = Math.max(hsvVar.f29462d, (int) ((scrollX / width) * 100.0f));
            }
        });
    }

    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C0829mo mo1765d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0100R.layout.page, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(C0100R.id.example_images_view);
        int i2 = this.f29464f;
        FrameLayout[] frameLayoutArr = new FrameLayout[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            frameLayoutArr[i3] = new FrameLayout(viewGroup.getContext());
            View.inflate(viewGroup.getContext(), C0100R.layout.image_page, frameLayoutArr[i3]);
            linearLayout.addView(frameLayoutArr[i3]);
            frameLayoutArr[i3].setVisibility(8);
        }
        return new hsy(viewInflate, frameLayoutArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // p000.AbstractC0806ls
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo1766e(C0829mo c0829mo, int i) {
        hsy hsyVar = (hsy) c0829mo;
        hsu hsuVar = (hsu) this.f29463e.get(i);
        hsyVar.f29471s.setText((CharSequence) hsuVar.f29456b);
        hsyVar.f29472t.setText((CharSequence) hsuVar.f29457c);
        View view = hsyVar.f29474v;
        boolean z = hsuVar.f29455a;
        view.setVisibility(8);
        if (hsyVar.f29473u.length > 1) {
            int dimensionPixelSize = hsyVar.f29475w.getContext().getResources().getDimensionPixelSize(C0100R.dimen.image_container_horizontal_padding);
            hsyVar.f29475w.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        for (View view2 : hsyVar.f29473u) {
            TextView textView = (TextView) view2.findViewById(C0100R.id.caption_after_effect);
            TextView textView2 = (TextView) view2.findViewById(C0100R.id.caption_before_effect);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0100R.id.linearlayout_caption);
            textView.setText((CharSequence) hsuVar.f29456b);
            textView2.setText((CharSequence) hsuVar.f29461g);
            view2.setVisibility(0);
            linearLayout.setVisibility(4);
        }
        hsyVar.f29477y = hsuVar;
    }
}
