package p408u6;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.linguist.R;

/* JADX INFO: renamed from: u6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9465d extends C9467f {

    /* JADX INFO: renamed from: J */
    public final RelativeLayout f48509J;

    /* JADX INFO: renamed from: K */
    public final Button f48510K;

    /* JADX INFO: renamed from: L */
    public final Button f48511L;

    /* JADX INFO: renamed from: M */
    public final Button f48512M;

    /* JADX INFO: renamed from: N */
    public final LinearLayout f48513N;

    /* JADX INFO: renamed from: O */
    public final ImageView f48514O;

    /* JADX INFO: renamed from: P */
    public final TextView f48515P;

    /* JADX INFO: renamed from: Q */
    public final TextView f48516Q;

    /* JADX INFO: renamed from: R */
    public final TextView f48517R;

    public C9465d(View view) {
        super(view);
        view.setTag(this);
        this.f48515P = (TextView) view.findViewById(R.id.messageTitle);
        this.f48516Q = (TextView) view.findViewById(R.id.messageText);
        this.f48534y = (ImageView) view.findViewById(R.id.media_image);
        this.f48514O = (ImageView) view.findViewById(R.id.image_icon);
        this.f48517R = (TextView) view.findViewById(R.id.timestamp);
        this.f48510K = (Button) view.findViewById(R.id.cta_button_1);
        this.f48511L = (Button) view.findViewById(R.id.cta_button_2);
        this.f48512M = (Button) view.findViewById(R.id.cta_button_3);
        this.f48533x = (FrameLayout) view.findViewById(R.id.icon_message_frame_layout);
        this.f48535z = (ImageView) view.findViewById(R.id.square_media_image);
        this.f48509J = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.f48513N = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.f48522B = (FrameLayout) view.findViewById(R.id.icon_progress_frame_layout);
        this.f48521A = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // p408u6.C9467f
    /* JADX INFO: renamed from: t */
    public final void mo17876t(com.clevertap.android.sdk.inbox.CTInboxMessage r26, com.clevertap.android.sdk.inbox.C2246a r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p408u6.C9465d.mo17876t(com.clevertap.android.sdk.inbox.CTInboxMessage, com.clevertap.android.sdk.inbox.a, int):void");
    }
}
