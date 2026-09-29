package p537zi;

import ae.C0062b;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.DialogInterfaceC0215b;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2056p;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import mo.C7661i;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import ph.C8320l4;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: renamed from: zi.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10507q {

    /* JADX INFO: renamed from: a */
    public final Context f52455a;

    /* JADX INFO: renamed from: b */
    public final String f52456b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2056p<String, String, C9072e> f52457c;

    /* JADX INFO: renamed from: d */
    public DialogInterfaceC0215b f52458d;

    /* JADX INFO: renamed from: e */
    public final C8320l4 f52459e;

    /* JADX INFO: renamed from: f */
    public String f52460f;

    /* JADX INFO: renamed from: g */
    public String f52461g;

    /* JADX INFO: renamed from: zi.q$a */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C10507q c10507q = C10507q.this;
            DialogInterfaceC0215b dialogInterfaceC0215b = c10507q.f52458d;
            String string = null;
            if (dialogInterfaceC0215b == null) {
                C5207g.m11117l("alertDialog");
                throw null;
            }
            dialogInterfaceC0215b.f598f.f555k.setEnabled(!C7661i.m15250P2(String.valueOf(charSequence)));
            c10507q.f52460f = "other";
            if (charSequence != null) {
                string = charSequence.toString();
            }
            c10507q.f52461g = string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10507q(Context context, String str, InterfaceC2056p<? super String, ? super String, C9072e> interfaceC2056p) {
        this.f52455a = context;
        this.f52456b = str;
        this.f52457c = interfaceC2056p;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_report_menu, (ViewGroup) null, false);
        int i10 = R.id.etReason;
        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewInflate, R.id.etReason);
        if (textInputEditText != null) {
            i10 = R.id.rbAudioProblems;
            if (((RadioButton) C0062b.m298P0(viewInflate, R.id.rbAudioProblems)) != null) {
                i10 = R.id.rbOffensiveContent;
                if (((RadioButton) C0062b.m298P0(viewInflate, R.id.rbOffensiveContent)) != null) {
                    i10 = R.id.rbOther;
                    if (((RadioButton) C0062b.m298P0(viewInflate, R.id.rbOther)) != null) {
                        i10 = R.id.rgIssues;
                        RadioGroup radioGroup = (RadioGroup) C0062b.m298P0(viewInflate, R.id.rgIssues);
                        if (radioGroup != null) {
                            i10 = R.id.rvPoorTranscript;
                            if (((RadioButton) C0062b.m298P0(viewInflate, R.id.rvPoorTranscript)) != null) {
                                i10 = R.id.tlReason;
                                TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(viewInflate, R.id.tlReason);
                                if (textInputLayout != null) {
                                    this.f52459e = new C8320l4((ConstraintLayout) viewInflate, textInputEditText, radioGroup, textInputLayout);
                                    this.f52460f = "";
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: a */
    public final void m19482a() {
        C9249b c9249b = new C9249b(this.f52455a);
        final C8320l4 c8320l4 = this.f52459e;
        C9249b view = c9249b.setView(c8320l4.f45015a);
        view.m17615h(R.string.card_report);
        view.f599a.f579f = this.f52456b;
        DialogInterfaceC0215b dialogInterfaceC0215bM876a = view.setPositiveButton(R.string.card_report, new DialogInterfaceOnClickListenerC8634f(2, this)).setNegativeButton(R.string.ui_cancel, new DialogInterfaceOnClickListenerC10505o(0)).m876a();
        this.f52458d = dialogInterfaceC0215bM876a;
        dialogInterfaceC0215bM876a.f598f.f555k.setEnabled(false);
        c8320l4.f45017c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: zi.p
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                C8320l4 c8320l5 = c8320l4;
                C5207g.m11111f(c8320l5, "$this_with");
                C10507q c10507q = this;
                C5207g.m11111f(c10507q, "this$0");
                TextInputLayout textInputLayout = c8320l5.f45018d;
                if (i10 == R.id.rbOffensiveContent) {
                    C5207g.m11110e(textInputLayout, "tlReason");
                    C4924a.m10442U(textInputLayout);
                    DialogInterfaceC0215b dialogInterfaceC0215b = c10507q.f52458d;
                    if (dialogInterfaceC0215b == null) {
                        C5207g.m11117l("alertDialog");
                        throw null;
                    }
                    dialogInterfaceC0215b.f598f.f555k.setEnabled(true);
                    c10507q.f52460f = "offensive";
                    return;
                }
                if (i10 == R.id.rbAudioProblems) {
                    C5207g.m11110e(textInputLayout, "tlReason");
                    C4924a.m10442U(textInputLayout);
                    DialogInterfaceC0215b dialogInterfaceC0215b2 = c10507q.f52458d;
                    if (dialogInterfaceC0215b2 == null) {
                        C5207g.m11117l("alertDialog");
                        throw null;
                    }
                    dialogInterfaceC0215b2.f598f.f555k.setEnabled(true);
                    c10507q.f52460f = "audioProblems";
                    return;
                }
                if (i10 != R.id.rvPoorTranscript) {
                    if (i10 == R.id.rbOther) {
                        C5207g.m11110e(textInputLayout, "tlReason");
                        C4924a.m10457e0(textInputLayout);
                    }
                    return;
                }
                C5207g.m11110e(textInputLayout, "tlReason");
                C4924a.m10442U(textInputLayout);
                DialogInterfaceC0215b dialogInterfaceC0215b3 = c10507q.f52458d;
                if (dialogInterfaceC0215b3 == null) {
                    C5207g.m11117l("alertDialog");
                    throw null;
                }
                dialogInterfaceC0215b3.f598f.f555k.setEnabled(true);
                c10507q.f52460f = "poorTranscript";
            }
        });
        TextInputEditText textInputEditText = c8320l4.f45016b;
        C5207g.m11110e(textInputEditText, "etReason");
        textInputEditText.addTextChangedListener(new a());
    }
}
