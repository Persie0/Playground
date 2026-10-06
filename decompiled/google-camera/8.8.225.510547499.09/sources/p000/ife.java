package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ife extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    private Animator f30615a;

    /* JADX INFO: renamed from: b */
    public TextView f30616b;

    /* JADX INFO: renamed from: c */
    public TextView f30617c;

    public ife(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m11170b(boolean z) {
        if (z) {
            this.f30617c.setEnabled(true);
        } else {
            this.f30617c.setEnabled(false);
        }
        Animator animator = this.f30615a;
        if (animator != null) {
            animator.end();
        }
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        if (z) {
            objectAnimatorOfFloat.addListener(new ifc(this));
        } else {
            objectAnimatorOfFloat.addListener(new ifd(this));
        }
        objectAnimatorOfFloat.start();
        this.f30615a = objectAnimatorOfFloat;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.mode_switcher_layout, (ViewGroup) this, true);
        this.f30616b = (TextView) findViewById(C0100R.id.current_mode_info_chip);
        this.f30617c = (TextView) findViewById(C0100R.id.camera_mode_chip);
    }

    public ife(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
